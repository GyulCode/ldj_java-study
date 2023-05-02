package com.sist.io2;

// file 영구적인 저장 장치
// 단점 : 보안 취약 / 파일은 독립적 -> 여러개 파일을 연결할 수 없다 
// 임시 용도 -> 댓글 읽기, 크롤링 -> 추출 -> 오라클
//             ------- 빅데이터 -> 분석(필요한 데이터만 추출)
public class Student {
	private int hakbun;
	private String name;
	private int kor, eng, math, total;
	private double avg;
	
	public int getHakbun() {
		return hakbun;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	

}
