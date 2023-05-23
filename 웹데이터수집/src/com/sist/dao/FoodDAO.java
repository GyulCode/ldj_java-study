package com.sist.dao;
import java.util.*;
import java.sql.*;
import com.sist.vo.*;
/*
 *    286 page
 *    1. 드라이버 등록
 *       ----- 오라클 연결하는 라이브러리(ojdbc8.jar)
 *       OracleDriver -> 메모리할당
 *    2. 오라클 연결
 *       Connection(클래스)
 *    3. SQL문장 전송
 *       PreparedStatemnet
 *    4. SQL문장 실행 요청
 *       = executeUpdate() => insert, update, delete
 *         -------------commit이 자동으로 된다(auto commit)
 *         
 *       = executeQuery() => select
 *         ----------- 결과값을 가지고 온다
 *                     ----ResultSet
 *       Result Set
 *       String sql="SELECT id, name,sex,age"; 
 *       --------------------------------------
 *          id       name       sex      age
 *       --------------------------------------
 *         aaa       짱구         남자      20  --커서 위치 first(), next() - 위치 변경후 데이터 읽기
 *    getString(1)getString(2)getString(3)getString(4)
 *    getStrnig("id") 이것도 가능
 *       --------------------------------------
 *         bbb       유리         여자      23
 *    getString(1)getString(2)getString(3)getString(4)
 *       --------------------------------------
 *         ccc       훈이         남자      27  -- 커서 위치 last()
 *    getString(1)getString(2)getString(3)getString(4)
 *       --------------------------------------
 *       |커서위치
 *                     
 *    5. 닫기
 *       생성 반대로 닫는다
 *       rs.close(), ps.close, conn.close()
 *    -------------------------------------오라클 연결 servlet(서버에서 시행되는 가벼운 파일) ->JSP대용
 *    *DAO코딩이 밥줄코딩 이해
 *    
 *    
 *        
 */
public class FoodDAO {
	// 기능 -> insert -> 데이터수집(파일)
	private Connection conn; // 오라클 연결 객체( DB 연결)
	private PreparedStatement ps; // SQL문장 전송/ 결과값 읽기
	private final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	//                         ---- ------  ---    ----    ---   --
	//                          db         서버연결   서버명   서버주소  db이름
	// My SQL -> jdbc:mysql ://localhost/mydb
	
	private static FoodDAO dao; // 싱글턴 패턴 , DAO객체를 한개만 사용이 가능하게 만든다
	
	// 드라이버 설치 -> 소프트웨어 (메모리 할당 요청) Class.forName()
	// 클래스의 정보를 전송
	// 드라이버 설치는 1번만 수행
	public FoodDAO() {
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 뭔가 연결 , 드라이버인가..?
		}catch (Exception ex) {}
	}
		
	// 오라클 연결
	public void getConnection() {
		try
		{
			// 오라클 접속(connection) 전송값 : conn hr/happy
			conn=DriverManager.getConnection(URL,"hr","happy");
		}catch(Exception ex) {}
	}
	
	// 연결종료
	public void disConnection() {
		try {
			if(ps!=null) ps.close();
			if(conn!= null) conn.close();
			//오라클 전송 : exit
		} catch (Exception ex) {}
	}
	
	// DAO객체를 1개만 생성해서 사용 -> 메모리 누수현상을 방지(싱글턴 패턴)
	// 싱글턴 / 팩토리 패턴은 단골 면접(스프링:패턴 8개)
	
	public static FoodDAO newInstance() {
		// newInstance(), getInstance() -> 싱글턴
		if(dao == null)
			dao=new FoodDAO();
		return dao;
	}
	//--------------------------JDBC 기본세팅(모든 dao는 동일)
	// 기능
	// 1. 데이터 수집(insert)
	/*
	 * Statement -> sql -> 생성과 동시에 데이터 추가
	 * PreparedStatement -> 미리 sql문장을 만들고 나중에 값을 채운다
	 * 실무 default 처리방법
	 * CallableStatement -> procedure
	 */
	public void foodCategoryInsert(CategoryVO vo) {
		try
		{
			// 1. 연결
			getConnection();
			
			// 2. SQL문장 생tjd
			String sql="INSERT INTO food_category VALUES(fc_cno_seq.nextval,?,?,?,?)";
			// ?로 미리 틀만 만들고 나중에 값을 채워 넣는다 preparedStatement 방식 ''의 오류 방지 목적
			// 실무에서 기본적으로 사용함
			
			// 3. SQL문장 오라클 전송
			ps=conn.prepareStatement(sql);
			
			// 3-1. ?에 값을 채운다
			ps.setString(1, vo.getTitle()); // "'"+vo.getTitle()+"'"
			ps.setString(2, vo.getSubject());
			ps.setString(3, vo.getPoster());
			ps.setString(4, vo.getLink());
			//번호가 잘못되면 오류발생 -> ?갯수 잘 맞추기, 데이터형도 잘 맞춰추기
			// 오류시 in/out 메세지가 출력됨
			
			// 4. SQL문장 실행 명령 -> 문장 작성 후 실행 Excute
			ps.executeUpdate();
			
		}catch(Exception ex)
		{
			ex.printStackTrace(); //에러 확인
		}finally
		{
			disConnection(); //오라클 연결 해제 -> 무조건
		}
		
	}
	// 2. select -> 전체 데이터 읽기
	//
	// 3. 상세보기 -> where
		
	}
	

	

