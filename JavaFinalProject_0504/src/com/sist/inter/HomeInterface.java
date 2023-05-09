package com.sist.inter;
import java.util.*;
import javax.swing.*;
import java.awt.*;

import com.sist.manager.GenieMusicVO;
/*
 *    1) 환경설정
 *    2) 인터페이스 구현 -> 조원별로(인터페이스 설계)
 *    3) 애플리케이션 테스트(단위 테스트 -> JUnit)
 *    4) 네트워크 구현
 *    
 *    인터페이스 -> 기능 설계
 *    -> 미완성 클래스 (메모리 할당을 할 수 없다)
 *    -> 변수 -> 상수형 변수
 *    -> 메소드 -> 추상메소드
 *    -> 다중 상속
 *    -> jdk1.8
 *       -> 구현 메소드가 가능하다
 *          default static
 *    상속 : extends , 구현 : implements
 *    -> 목적 : 기술면접의 단골 -> 스프링은 인터페이스
 *    표준화가 가능하다 (메소드 구현은 다를 수 있다, 메소드명이 동일)
 *    -> 분석 : 
 *    
 */


public interface HomeInterface{
//	public void cardPrint(List<GenieMusicVO> list);
//	public void cardInit(List<GenieMusicVO> list);
	public void findprint(int cno);
	public void findprint2(String title);

}
