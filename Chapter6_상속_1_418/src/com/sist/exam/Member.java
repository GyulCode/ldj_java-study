package com.sist.exam;
//Member VO, MemberDTO -> 사용자 정의 데이터형(읽기 쓰기)

public class Member {
	private String id;
	private String name, sex;
	

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


}
