package com.sist.lib;

/*   강사님 파일 나중에 확인**   
 * 
 *   다수의 데이터를 쉽고 효율적으로 처리할 수 있게 만든 표준화된 클래스의 집합
 *   자바에서 라이브러리로 지원
 *   2. 데이터 -> 수정, 삭제, 추가, 읽기 (잘구조)
 *   3. 배열-> 정적 메모리할당(추가를 어렵게)
 *           동적 메모리 할당(추가를 쉽게)
 *           추가가 될때마다 자동으로 메모리 추가
 *   4. 컬렉션의 종류
 *   = 순서가 존재, 데이터 중복허용
 *   LIST 인터페이스
 *      Arraylist
 *      Vector
 *      LinkedList
 *      
 *   = 순서가 없고 데이터 중복을 허요하지 않는다
 *     Set(인터페이스)
 *        Hashset
 *        ------ 웹 채팅, list에서 중복된 데이터 추출
 *        TreeSet(검색)
 *   = 먼저 들어온 데이터를 먼저 출력
 *      Queue(FiFo), Stack(LiFo) - 코테
 *        순서적으로       뒤에서
 *   = KEY-VALUE 동시에 저장
 *     MAP (인터페이스)
 *        HashMap
 *        Hashtable -> HashMAP의 단점을 보완
 *     
 *   -> 전체 상속도
 *      1. Collection
 *         1) List
 *            1. Arraylist 동기화
 *               1) 단방향 포인터(인덱스)를 갖고 있다, 조회하ㅣ 편리하다 성능이 좋다
 *               2) 검색이 빠르다, 데이터 추가시 속도가 빠르다
 *               3) 단점 : 수정, 삭제, 추가시 속도가 느림 -> 배열 종특 -> 대안 LinkedList
 *               
 *            2. LinkedList 동기화(
 *               1) 양방향 포인터를 가지고 있다
 *               2) 수정, 삭제, 추가가 많은 경우에 주로 사용
 *               3) 단점은 검색속도가 느리다
 *            
 *              (Stack)             
 *            3. Vector : 유지보수용 - 비동기(데이터 유실이 생김)방식으로 동시에 여러개를 갖고옴 
 *               1) 대용량 데이터 처리 -> 채팅,서버연결(동기화)
 *               2) 비동기화 보완 -> ArrayList
 *               3) 데이터는 반드시 구분되게 만든다 ex) 홍길동이 3명이면 앞에 번호를 붙인다던가...
 *            
 *         2) Set
 *            순서가 없다(인덱스), 데이터 중복을 허용하지 않는다
 *            DB에서 이용, 중복 제거 distinct
 *            
 *            1. HashSet** :
 *               1) 순서가 없다(인덱스가 존재하지 않는다)
 *               2) 데이터중복을 허용하지 않는다
 *               3) 주요 메소드
 *                  -> 데이터 저장 : add() -> Object
 *                  -> 데이터 삭제 : remove(Object)
 *                  -> 전체 삭제 : clear()
 *                  -> isEmpty : 빈공간 (데이터 존재여부 확인)
 *                  -> 저장 갯수 : size()
 *                  -> 데이터를 한번에 모아서 관리 : iterator()
 *                                 
 *            2. TreeSet : 검색용으로 주로 사용
 *                         Like, regexp_like(오라클)
 *               1) headSet
 *               2) tailSet
 *               
 *               1)정렬 검색속도
 *            
 *         3) Queue
 *         
 *      *. Map
 *         key, value를 동시에 저장
 *         
 *         1. HashMap**
 *         2. HashTable
 *      
 *        
 *        
 *      
 *      
 */
import java.util.*;
public class 라이브러리_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Hash Set
		Set set=new HashSet();
		set.add("A"); // add(Object) 제네릭을 사용 안해서 가능함
		set.add("B");
		set.add("C");
		set.add("D");
		
		// 집합이라 당연히 아래꺼는 중복x
		set.add("A");
		set.add("B");
		set.add("C");
		
		System.out.println(set);
		
		//출력
		for(Object o:set) {
			String s=(String)o; // Object 타입임
			System.out.print (s+"\t");
		}
		
		

	}

}
