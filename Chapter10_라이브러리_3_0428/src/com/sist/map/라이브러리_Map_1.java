package com.sist.map;

import java.util.HashMap;

/*
 *    Map -> 인터페이스
 *       1. Hashtable
 *          특징) 두개를 동시에 저장(key,value)
 *               단 key는 중복할 수 없음
 *               중복될 경우 key에 마지막으로 저장된 값을 갖고옴
 *          사용처 : 웹에서 제공하는 모든 클래스(MAP형식)
 *               HttpServletRequest
 *                  request.setAttribute("key","value")
 *               HttpServletRespone
 *               HttpSession
 *               cookie
 *               스프링, 마이바티스 -> Map형식
 *               
 *               클래스 등록
 *               ("a",new A())
 *               저장 / 읽기
 *               --------
 *               저장 : put("key","값")
 *               읽기 : get(key)
 *               -------------------- JSON, Properties
 *               데이터는 구분자를 필요로 한다
 *               Arraylist -> 인덱스
 *               Set -> 중복없이
 *               Map -> key
 *               오라클 -> Primary key
 *               
 *               비정형화 -> 빅데이터 -> 정형화된 데이터 = 통계/확률
 *               
 *               
 *           
 *       
 *       2. HashMap****
 */
import java.util.*;
public class 라이브러리_Map_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map=new HashMap<>();
		//데이터 저장
		map.put("id", "admin");
		map.put("password", 1234);
		map.put("name", "홍길동");
		map.put("sex", "남자");
		map.put("age",25);
		map.put("password", "4567"); // key가 중복되면 덮어써짐! 
		
		System.out.println(map);
		System.out.println("ID : "+map.get("id"));
		System.out.println("Password : "+map.get("password"));
		Set set=map.keySet();
		System.out.println(set);//키명만 갖고오게됨
		for(Object o:set) {
			String key=(String)o;
			System.out.println(key+":"+map.get(key));
		}
		/*
		 * clear() : 전체삭제
		 * get() : 실제 데이터값 읽을때
		 * put() : 데이터 추가
		 * isEmpty() : 데이터가 있는지 여부 (true/false)
		 * size() : 저장된 갯수
		 * values() : 실제 저장된 값 전체
		 * 
		 */
		
		for(Object o:map.values()) {
			System.out.println(o);
		}

	}

}
