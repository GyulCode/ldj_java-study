package com.sist.dao;
//오라클 연결 -> 인터페이스 구현
//인터페이스는 서로 다른 프로그램을 연결할때 사용
// 자바  <-> 오라클 -> 라이브러리 (인터페이스 만들어져 있다)
/*
 *    1. 드라이버 등록 -> 소프트웨어 -> 메모리 할당 //thin 드라이버..?
 *                    class.forName("oracle.jdbc.driver.OracleDriver");
 *                    -> 각 업체에서 제공 -> ojdbc8.jar
 *       10g, 11g, 12c, 18c, 21c
 *            ---       ---
 *            ojdbc6    ojdbc8
 *    2. 오라클 연결 -> conn hr/happy = 오라클에서 연결법
 *       Connection -> getConnection(URL, username, password)
 *       
 *    3. SQL문장 전송(송수신)
 *       Statement -> executeQuery(SQL)
 *       -> 결과값을 받는 클래스 ResultSet
 *       -> resultset에 있는 데이터를 -> List, vo 형태로 보냄
 *    4. resultSet.close()
 *    5. statement.cloase()
 *    6. connection.close()
 *    
 *    --> 자바프로그램
 *        1) 네트워크 프로그램( 애플리케이션)
 *        2) 데이터베이스 프로그램(웹애플리케이션)****
 *        가장 쉬운 프로그램 : 데이터베이스 프로그램
 *    --> 모든 개발자가 동일한 코딩 : SQL
 */
import java.sql.*; //컴파일 예외 -> 예외처리가 필요하다
import java.util.*;
public class EmpDAO {
	// 오라클 연결 객체
	private Connection conn;
	
	// 오라클 통신(SQL전송, 결과값 받는다)
	private PreparedStatement ps;
	
	//--------------
	// 오라클 주소
	// 드라이버 이름
	// 사용자명
	// 비밀번호
	//--------------보안을 위해 파일에 저장
	
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	                                                   // 포트번호  아이디??
	private final String DRIVER="oracle.jdbc.driver.OracleDriver";
	private final String USERNAME="hr";
	private final String PASSWORD="happy";
	
	public EmpDAO() {
		try {
			Class.forName(DRIVER);
			
		}catch(Exception ex) {
			
		}
	}
	
	// 오라클 연결
	public void getConnection() {
		try {
			conn=DriverManager.getConnection(URL,USERNAME,PASSWORD);
			// 호출시 = conn hr/happy
		}catch (Exception ex) {
			
		}
	}
	
	// 오라클 해체
	public void disConnection() {
		try {
			if(ps!=null)
				ps.close();
			if(conn!=null)
				conn.close();
			// 호출시 = exit
		} catch (Exception ex) {
			
		}
	}
	////////////// 오라클 연결시 필수 조건
	////////////// 클래스화
	/*
	 *           1차           2차      3차
	 * JDBC === DBCP === ORM(MyBatis, JPA)
	 * ----연습용
	 * 
	 * 요구사항(지원 자격)
	 * ------------- 1. 언어(자바)
	 *               2. 데이터베이스(오라클, MySQL)
	 *               3. 프론트엔드(Vue,React)
	 *               4. 우대사항(클라우드)AWS
	 *               -------------------Full Stack -> 추세
	 * 
	 */
	// 기능 : 사용자 요청시에 데이터베이스 -> SQL문장을 만들어서 오라클 연동
	// 1. 사용자 사원 전체 목록 요청
	public List<EmpVO> empListData()
	{
		List<EmpVO> list = new ArrayList<EmpVO>();
		try {
			// 정상 수행 문장
			// 1. 오라클 연결
			getConnection();
			
			// 2. 사용자가 요청한 SQL 문장을 시작
			String sql="SELECT empno, ename, job, hiredate, sal FROM emp ORDER BY 1";
			
			// 3. 오라클 전송
			ps=conn.prepareStatement(sql);
			
			// 4. 오라클에 명령을 내린다 (SQL문장 실행후 결과값을 가지고 온다)
			ResultSet rs=ps.executeQuery(); 
			
			/*
			 *    1(정수)  2(String)3(String) 4(Date) 5(float, int)
			 *    empno   ename   job   hiredate    sal
			 *    7788     -       -       -         -   -> 위치(rs.next(0)
			 *    7788     -       -       -         -   -> 위치(rs.previous())
			 * 
			 */
			while(rs.next())
			{
				EmpVO vo=new EmpVO();
				vo.setEmpno(rs.getInt(1));  //컬럼을 번호로 읽어온다
				vo.setEname(rs.getString(2));
				vo.setJob(rs.getString(3));
				vo.setHirdate(rs.getDate(4));
				vo.setSal(rs.getInt(5));
				list.add(vo);
			}
			rs.close();
			
		} catch (Exception ex) {
			ex.printStackTrace(); //오류확인
		} finally {
			disConnection(); // 오라클 닫기
		}
		return list;
	}
	// 2. 상세보기
	public EmpVO empdetailData(int empno) {
		EmpVO vo=new EmpVO();
		try {
			// 1. 오라클 연결
			getConnection();
			// 2. SQL문장 만들기
			String sql ="SElECT * FROM emp WHERE empno="+empno;
			// 3. 오라클 전송
			ps=conn.prepareStatement(sql);
			// 4. 실행후에 결과값 받기
			ResultSet rs=ps.executeQuery();
			// 5. rs에 있는 데이터를 vo에 담는다
			rs.next(); // 데이터가 메모리에 출력된 첫번째 줄에 커서이동 // 데이터가 없는 위치에 커서가 가 있음 그래서 첫번째로옮겨주는거
			vo.setEmpno(rs.getInt(1));
			vo.setEname(rs.getString(2));
			vo.setJob(rs.getString(3));
			vo.setMgr(rs.getInt(4));
			vo.setHirdate(rs.getDate(5));
			vo.setSal(rs.getInt(6));
			vo.setComm(rs.getInt(7));
			vo.setDeptno(rs.getInt(8));
			rs.close();			
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			disConnection(); // 오라클 해체
		}
		return vo;
	}
	//2-1 사번읽기
	public List<Integer> empGetEmpno(){
		List<Integer> list = new ArrayList<>();
		try {
			// 1. 연결
			getConnection();
			// SQL문장 제작
			String sql = "SELECT DISTINCT empno FROM emp";
			// SQL 문장 전송
			ps=conn.prepareStatement(sql);
			// 결과값 받기
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				list.add(rs.getInt(1));
			}
			rs.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			disConnection();
		}
		return list;
	}
	
	// 3. 검색
	public List<EmpVO> empSearchData(String ename) {
		List<EmpVO> list = new ArrayList<>();
		EmpVO vo=new EmpVO();
		try {
			// 1. 오라클 연결
			getConnection();
			// 2. SQL문장 만들기
			String sql ="SELECT * FROM emp WHERE ename LIKE '%'||?||'%'";
			// 3. 오라클 전송
			ps=conn.prepareStatement(sql);
			ps.setString(1, sql);
			// 4. 실행후에 결과값 받기
			ResultSet rs=ps.executeQuery();
			// 5. rs에 있는 데이터를 vo에 담는다
			while(rs.next()){
				list.add(rs.getObject());
			}
			System.out.println(list);
			
			vo.setEmpno(rs.getInt(1));
			vo.setEname(rs.getString(2));
			vo.setJob(rs.getString(3));
			vo.setMgr(rs.getInt(4));
			vo.setHirdate(rs.getDate(5));
			vo.setSal(rs.getInt(6)); 
			vo.setComm(rs.getInt(7));
			vo.setDeptno(rs.getInt(8));
			rs.close();			
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			disConnection(); // 오라클 해체
		}
		return vo;
	}
	
	

	
	
	
	

}
