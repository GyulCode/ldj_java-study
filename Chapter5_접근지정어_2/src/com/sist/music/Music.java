package com.sist.music;
/*
 *    1.재사용
 *       = 상속 -> is-a
 *           기존의 클래스를 확장해서 사용
 *               			=extends
 *           자바는 단일 상속만 가능하다
 *                ------
 *           class A
 *           class B extends A -> 라이브러리를 주로 상속받음
 *           ---------------------------------------
 *           class A
 *           class B
 *           class C extends A, B -> 오류(언어)
 *           
 *           둘다 받는법음
 *           class B extends A
 *           class C extends B
 *           
 *           class A
 *           class B
 *           ------- A와 B는 다른 클래스 -> 크기를 가지지 않는다
 *           
 *           class A(int a,b)
 *           class B(int c) extends A
 *           B---int a b c 변수는 많지만
 *           A > B 상속을 내리는 클래스가 더 크다*** 
 *           
 *           번외) 형변환 : 남자 a = new(남자)인간 // 인간이 상위 클래스라 선언시 형변환이 필수
 *           모든 클래스는 Object상속을 받고 있다
 *           Object -> 모든 클래스 최상위 클래스
 *                  
 *           
 *           
 *           
 *           
 *           C=A+B+@
 *         
 *       = 포함 -> has-a (********)
 */

public class Music {
	private int rank;
	private String state;
	private String title;
	private String singer;
	private String album;
	private int idcrement;
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public int getIdcrement() {
		return idcrement;
	}
	public void setIdcrement(int idcrement) {
		this.idcrement = idcrement;
	}
	

}
