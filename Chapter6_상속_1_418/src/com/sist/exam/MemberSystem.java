package com.sist.exam;

import java.util.Scanner;

public class MemberSystem {
	Member[] members=new Member[10]; //공간만 확보 아직 주소값은 할당이 안된상태
	static int index=0;
	//오라클 -> 모든 데이터 static
	//가입
	
	public void join() {
		Scanner sc=new Scanner(System.in);
		System.out.println("아이디, 이름, 성별, 입력(hong 홍길동 남자)");
		members[index]=new Member();
		members[index].setId(sc.next());
		members[index].setName(sc.next());
		members[index].setSex(sc.next());
		index++;
	}
	public void print() {
		for(Member m:members) {
			if(m!=null) {
				System.out.println(m.getId()+" "
						+m.getName()+" "
						+m.getSex());
			}
			
		}
	}


}
