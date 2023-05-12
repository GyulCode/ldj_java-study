package com.sist.dao;
import java.sql.*;
import java.util.*;

public class EmpDAO {
	private Connection conn; // 오라클 연결
	// socket
	private PreparedStatement ps;
	// bufferedreader OutputStream
	
	// 클라이언트 ( Function.LOGIN+"|"+id+"|"...)
	// 클라이언트 --> sql문장을 전송 --> 오라클로부터 결과값을 받는다
	//             ----테이블 컬럼
	// 웹 개발자 -> 자바/오라클
	// MyBatis(SQL) / Spring(자바)(사이트관리)  -> 라이브러리
	// JDBC -> java.sql -> 게시판(500)
	
	// 0.연결 링크 따는듯?
	private final String URL="jdbc:oracle:thin:@localhost:1521:xe"; //xe자동생성되는 DB
	
	// 1.드라이버 설정 //생성자
	public EmpDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 파일경로명 대소문자 구분함
		}catch(Exception ex) {}
	}
	// 2.연결
	public void getConnection() {
		try {
			conn=DriverManager.getConnection(URL,"hr","happy");
			// conn hr/happy 커넥트 될때 이계정으로 연결됨
		} catch (Exception ex) {}
		
	}
	// 3.연결 해제
	public void disConncection()
	{
		try {
			if(ps!=null)
				ps.close(); // in.close();, out.close()
			if (conn!=null)
				conn.close(); // s.close();
				//오라클 -> 서버
			
		} catch (Exception ex) {}
		
	}
	
	// 1.기능(SQL) -> 송신
	// emp(사원 -> 14명)
	public List<EmpVO> empListData()
	{
		List<EmpVO> list=new ArrayList<EmpVO>();
		try {
			//연결
			getConnection();
			
			//SQL문장 생성
			String sql="SELECT empno,ename,job,sal "
					+"FROM emp "
					+"WHERE ename LIKE '%A%'";
			//전송
			ps=conn.prepareStatement(sql);
			
			//결과값 받기
			ResultSet rs=ps.executeQuery(); // 실행된 결과값이 메모리에 저장
			
			//list에 값을 채운다
			while(rs.next())//처음부터 데이터가 없을때가끼 읽어온다
			{
				EmpVO vo=new EmpVO();
				vo.setEmpno(rs.getInt(1));
				vo.setEname(rs.getString(2)); //스
				vo.setJob(rs.getString(3));
				vo.setSal(rs.getInt(4));
				list.add(vo);
						
			}
			rs.close();
			
		} catch (Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			disConncection();
		}
		return list;
	}

	
	


}
