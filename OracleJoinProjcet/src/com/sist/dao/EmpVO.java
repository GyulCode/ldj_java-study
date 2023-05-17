package com.sist.dao;
/*
 EMPNO          NOT NULL NUMBER(4)
 ENAME          VARCHAR2(10)
 JOB            VARCHAR2(9)
 MGR            NUMBER(4)
 HIREDATE       DATE
 SAL            NUMBER(7,2)
 COMM           NUMBER(7,2)
 DEPTNO         NUMBER(2)
*/

import java.util.Date;

public class EmpVO {
	
	private String ename, job;
	private Date hiredate;
	private int empno, mgr, sal, comm, deptno;
	
	//조인 데이터 -> 포함 클래스
	private DeptVO dvo = new DeptVO();
	private SalGradeVO svo = new SalGradeVO();
	
	
	public DeptVO getDvo() {
		return dvo;
	}
	public void setDvo(DeptVO dvo) {
		this.dvo = dvo;
	}
	public SalGradeVO getSvo() {
		return svo;
	}
	public void setSvo(SalGradeVO svo) {
		this.svo = svo;
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
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getComm() {
		return comm;
	}
	public void setComm(int comm) {
		this.comm = comm;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
	

}
