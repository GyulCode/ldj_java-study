package com.sist.io2;
/*
 *    데이터 연결 : 자바응용프로그램
 *               -------- .java
 *    데이터 저장 (변수, 배열, 클래스, 파일, 오라클)
 *             -------------- 메모리(단점 -> 한번 사용하면 사라짐..ㅠㅠ)
 *             대안으로 파일 : 영구적으로 저장(보안 취약, 다른 파일과 연결이 어려움) -> 관계형 데이터모델 -> Oracle ~> mybatis
 *             Spring : web 제어
 *             mybatis : Mapper(데이터베이스 연결)
 *             이둘로 aws에 연결해서 출력시킴
 *    데이터 -> 읽기/쓰기 
 *    파일 / 오라클
 *    읽기
 *    inputStream (1Byte)
 *    Reader(2Byte) 한글이 포함된 친구들 제어
 *       -> 업로드/ 다운로드(.zip, png...)
 *       읽기/쓰기 동시에 수행이 불가능 -> 단방향
 *       -> 파일 읽기 통로
 *       -> 파일 쓰기 통로
 *       이 통로를 stream이라 한다
 *       ----------------------------------------
 *       전송 속도가 더 빠른 클래스
 *       Buffered~ (따른 저장소에 잠시 두는거 filter)
 *       ObjectInputStream / ObjectOutputStream
 *       read/readLine 
 *             
 *       
 *    outputStream -> Writer
 *       
 *             
 *               
 *               
 */

public class IO_정리 {

}
