package com.sist.dao;
/*
 *  이름         널?      유형
 ----------- -------- ----------------------------
 EMPNO       NOT NULL    NUMBER(4)
                         -------int, double
                                                    
 ENAME                   VARCHAR2(10)
                         ----String
                         
 JOB                     VARCHAR2(9)
 MGR                     NUMBER(4)
 HIREDATE                DATE
                         ------java.util.Date
 SAL                     NUMBER(7,2)
 COMM                    NUMBER(7,2)
 DEPTNO                  NUMBER(2)
 */
import java.util.*;
import java.util.Date;
import java.sql.*;
// 사원에 대한 정보 저장 -> EMP(테이블->파일) -> 데이터베이스(xe):폴더
// data transfer object
// value object
public class EmpVO {
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private Date hiredate;
	private int sal;
	private int domm;
	private int deptno;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getDomm() {
		return domm;
	}
	public void setDomm(int domm) {
		this.domm = domm;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
}
