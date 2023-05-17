package com.sist.main;
import java.util.*;
import com.sist.dao.*;

public class EmpMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmpDAO dao=new EmpDAO();
		while(true) {
			System.out.println("===========메뉴===========");
			System.out.println("1. 사원목록");
			System.out.println("2. 사원 상세보기");
			System.out.println("3. 사원 찾기");
			System.out.println("9. 종료");
			System.out.println("=========================");
			System.out.println("번호 입력 : ");
			int menu=sc.nextInt();
			if(menu==9) {
				System.out.println("Program is Over");
				break;
			}
			else if(menu==1) {
				List<EmpVO> list = dao.empListData();
				for(EmpVO vo:list) {
					System.out.println(vo.getEmpno()+" "+vo.getEname()+" "+vo.getJob()+
							" "+vo.getHirdate().toString()+" "+vo.getSal());
				}
			}
			else if(menu==2) {
				List<Integer> list = dao.empGetEmpno();
				String s="";
				for(int no:list) {
					s+=no+",";
				}
				s=s.substring(0,s.lastIndexOf(","));
				System.out.println(s);
				System.out.println("사번 입력: ");
				int empno=sc.nextInt();
				
				EmpVO vo=dao.empdetailData(empno);
				System.out.println(vo.getEname()+"사원 정보");
				System.out.println("사번 : "+vo.getEmpno());
				System.out.println("이름 : "+vo.getEname());
				System.out.println("직위 : "+vo.getJob());
				System.out.println("사수번호 : "+vo.getMgr());
				System.out.println("입사일 : "+vo.getHirdate());
				System.out.println("급여 : "+vo.getSal());
				System.out.println("성과급 : "+vo.getComm());
				System.out.println("부서번호 : "+vo.getDeptno());
			}
			
			else if(menu==3) {
				List<Integer> list = dao.empGetEmpno();
				String s="";
				for(int no:list) {
					s+=no+",";
				}
				s=s.substring(0,s.lastIndexOf(","));
				System.out.println(s);
				
				System.out.println("사원 이름 입력(대문자): ");
				String ename=sc.next();
				EmpVO vo=dao.empSearchData(ename);
				System.out.println(vo.getEname()+"사원 정보");
				System.out.println("사번 : "+vo.getEmpno());
				System.out.println("이름 : "+vo.getEname());
				System.out.println("직위 : "+vo.getJob());
				System.out.println("사수번호 : "+vo.getMgr());
				System.out.println("입사일 : "+vo.getHirdate());
				System.out.println("급여 : "+vo.getSal());
				System.out.println("성과급 : "+vo.getComm());
				System.out.println("부서번호 : "+vo.getDeptno());
			}
					
			
		}
	}

}
