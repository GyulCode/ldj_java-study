package com.sist.main;
import java.util.*;
import com.sist.dao.*;

public class MainClass {
	public static void main(String[] args) {
		EmpDAO dao=new EmpDAO();
		List<EmpVO> list=dao.empListData();
		for(EmpVO vo:list) {
			System.out.println(vo.getEmpno()+" "+vo.getEname()+" "+vo.getJob()+" "+vo.getSal());
		}
			
	}
	

}
