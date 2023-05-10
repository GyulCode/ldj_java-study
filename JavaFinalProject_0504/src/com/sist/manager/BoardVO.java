package com.sist.manager;
import java.io.Serializable;
// 파일입출력 
/*
 *   클래스 
 *    = 데이터만 관리 => 한개의 대한 정보를 모아서 처리
 *                   예) 게시물 1개 전체 데이터를 모아서 관리 
 *                      읽기/쓰기/검색 
 *                      여행지에 정보 / 뮤직 정보 ...
 *       ~VO , ~DTO
 *       ----  ----
 *              Data Transfor Object 
 *              => 한개의 정보를 모아서 전송 목적 
 *       Value Object 
 *       => 데이터 보호 : 변경이 불가능하게 막아주는 역할 
 *          -------- 캡슐화 
 *                   데이터는 은닉화하고 메소드를 통해서 접근 
 *                   -----------   ---------------
 *                   변수: private   메소드 : public (다른 클래스와 통신)
 *                                 -------------- 메세지 
 *    = 기능 처리 => 액션 클래스 (메소드가 중심)
 *      => ~Manager , ~System , ~DAO , ~Service
 *         ------------------   ---------------
 *                                   |오라클 제어 
 *             | 크롤링(웹에서 데이터 읽기)
 *    = 유사한 기능을 가지고 있는 클래스가 여러개 
 *      => 멜론 / 지니뮤직 
 *      => CGV / 롯데시네마 / 메가박스 
 *      => 공통된 메소드를 이용하는 것이 편하다 
 *         --------------------------- 인터페이스 
 *         추상 => 공통적인 
 *         => 인터페이스 한개로 관련된 여러개 클래스를 제어 
 *    = 견고한 프로그램을 제작 (에러 => 복구) 
 *      => 사용자 에러 / 프로그램 에러 => 복구 (에러를 피해서 다음 문장으로 이동)
 *      => 예외처리 
 *         직접처리 (예외 복구) => try~catch (*******)
 *         간접처리 (예외 회피) => throws => 유지 보수, 라이브러리 
 *         => 기능(메소드) => 이미 소스코딩이 된 상태에 추가 
 *                         ----------------- throws
 *                         처음부터 메소드 제작 
 *                         ----------------- try~catch
 */
import java.util.*;
public class BoardVO implements Serializable{
    private int no; // 중복없이 
    private String name;
    private String subject;
    private String content;
    private String pwd;// 본안 여부 확인 
    private Date regdate;
    private int hit;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	   
}








