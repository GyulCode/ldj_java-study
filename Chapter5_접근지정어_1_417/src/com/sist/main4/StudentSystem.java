package com.sist.main4;
import com.sist.main3.Student;
//패키지명이 다르면 -> 사용시 반드시 import를 사용한다
import java.util.Scanner;

public class StudentSystem {
	//액션클래스
	private Student[] std=new Student[3];  // ***초기화가 된상태가 아님!! null상태임
	// 1. 학생 초기화
	/*
	 *  초기화
	 *  1.명시적 초기화
	 *  2.생성자 이용
	 *  3.초기화 블록
	 *  4.메소드
	 *  -> 입력값을 받거나 외부에서 데이터 읽기
	 *  
	 *  클래스 내부에서 선언및 초기화 
	 *  제어문 외부 라이브러리 호출 불가능
	 */
	
	public void init()
	{
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<std.length;i++) {
			
			std[i]=new Student(); // ***배열은 모든 저장공간이 null(메모리 연결)
			
			System.out.print("학번 입력: ");
			std[i].setHakbun(scan.nextInt());
			System.out.print("이름: ");
			std[i].name=scan.next();
			System.out.print("국영수 점수 입력: ");
			std[i].setKor(scan.nextInt());
			std[i].setEng(scan.nextInt());
			std[i].setMath(scan.nextInt());
			System.out.println("성별: ");
			std[i].setSex(scan.next());
			
			
		}
	}
	
	//1-1 출력
	public void display() { //default -> 자신의 패키지내의 클래스만 접근가능
		for(Student s: std) {
			System.out.println(s.getHakbun()+" "
					+s.name+" "
					+s.getKor()+" "
					+s.getEng()+" "
					+s.getMath()+" "
					+s.getSex()+" "
					+s.getTotal()+" "
					+s.getAvg()+" "
					+s.getScore()+" "
					+s.getRank()

					);
		}
	}
	
	
	// 2. 평균 구하기
	public void stdTotal() {
		for(int i=0;i<std.length;i++) {
			std[i].setAvg(std[i].getTotal()/3.0);//비공개
			//std[i].Avg(std[i].getTotal()/3.0);  //공개 상태
		}
	}

	// 3. 총점 구하기
	public void stdAvg() {
		for(int i=0;i<std.length;i++) {
			std[i].setTotal(std[i].getKor()+std[i].getEng()+std[i].getMath());
		}
	}

	// 4. 학점 구하기
	public void stdScore() {
		char c='A';
		for(int i=0; i<std.length;i++) {
			switch((int)(std[i].getAvg()/10)) {
			case 10:
			case 9:
				c='A';
				break;
			case 8:
				c='B';
				break;
			case 7:
				c='C';
				break;
			case 6:
				c='D';
				break;
			default:
				c='F';
				
			}
			std[i].setScore(c);
		}
	}
	// 5. 등수 구하기
	public void stdRank() {
		for(int i=0;i<std.length;i++) {
			std[i].setRank(1);
			for(int j=0; j<std.length;j++) {
				if(std[i].getTotal()<std[j].getTotal()) {
					std[i].setRank(std[i].getRank()+1);
				}
			}
		}
	}

}
