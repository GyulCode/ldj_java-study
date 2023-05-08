package com.sist.common;
//기능 설정
// 클라이언트 -> 서버로 요청(어떤 기능 설정)
// 웹 -> 파일명으로 구분 /여기서는 파일명이 없어서 번호로 처리
// 내부 프로토콜 : 서버/클라이언트의 약속
/*
 *    방들어가기 -> 먼저 입실 / 지금 입실
 *    방 나가기 -> 남아 있는 사람 / 나가는 사람
 *    채팅 종료 -> 남아 있는 사람 / 채팅 종료하는 사람
 *    
 *    
 *    서버 프로그래머
 *    웹서버는 이미 구현이 되어있음, 게임쪽이 억대
 *    서버 -> 쓰레드 사용법
 *        -> 내부 클래스
 *    -----------------------------
 *    흐름 파악
 *    서버 : 요청을 받아서 처리후에 응답
 *          -> 오라클 서버 / 웹 서버(설치)
 *    --> 웹 프로그래머
 *    클라이언트 : 요청 -> 결과값을 받아서 출력
 *    DAO(JDBC) , JSP, Spring
 *    브라우저에 출력 : Front-End
 *    
 *    
 */
public class Function {
	public static final int LOGIN=100; // 로그인 처리(이미 로그인된 유저)
	public static final int MYLOG=110; // 로그인 처리( 로그인 하는 유저)
	public static final int CHAT=200; // 채팅
	public static final int MSGSEND=300; //쪽지보내기
	public static final int INFO=400; // 정보보기

}
