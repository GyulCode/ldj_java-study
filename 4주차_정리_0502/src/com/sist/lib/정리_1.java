package com.sist.lib;
/*
 * 8장 예외처리 -> 목적 : 사전에 에러를 방지하는 프로그램을 제작 비정상 종료를 방지하고 정상상태를 유지
 *              예외처리의 방법 : 수정이 가능한 에러
 *              1) 상속도 -> 예외처리 방법에 순서 존재
 *                 Object-Throwable(Spring -> AOP)
 *                 1. Error
 *                 2. Exception(예외처리의 최상위 클래스)
 *                    1) CheckedException
 *                       컴파일시 예외처리를 확인한다 -> 예외처리를 반드시 해야함
 *                       ---javac---
 *                       IOException : file명/디렉토리명
 *                       ClassNotFoundException
 *                          -> Class.forName("패키지명.클래스명")
 *                          -> 웹 (MVC)
 *                          InterruptedException(쓰레드)
 *                          malforedURLException(ip,web:네트워크)
 *                          SQLExeption(문법 -> 오라클)
 *                          
 *                       
 *                    2) UncheckedException
 *                       예외처리 여부를 확인하지는 않음 -> 필요시에만 작업한다
 *                       자주 오류가 나는 부분을 예외하는것이 좋다
 *                       ex) NumberFormateException(사용자 입력), NullPointException(사용자 입력, 프로그래밍 오류)
 *                       ---java---
 *                       실행시 에러(인터프리터)
 *                       RuntimeException
 *                       NullPointException
 *                          String s;
 *                          s.replace()
 *                       NumberFormatExcpetion
 *                          Integer.pasrInt(" 10")
 *                          web 에서 공백보낼시 에러
 *                          데이터 전송시 웹주소/파일명?no= 10
 *                       ArrayIndexOutOfBoundException
 *                       ClassCastException
 *              2) 예외처리의 종류
 *                 = **예외복구 (프로그래머가 주로 사용)
 *                    try{
 *                       정상수행 소스코드
 *                    }catch(예외처리 클래스){
 *                       try에서 에러 발생시 처리되는 문장
 *                       
 *                       -> 이때 순서가 존재 상속도!!
 *                       -> 상속을 내리는 클래스가 처리하는 예외가 많다
 *                       
 *                    }finally{
 *                       생략가능한 부분으로 실행 결과에상관없이 무조건 수행됨
 *                       file 닫기
 *                       오라클 연결해제
 *                       서버 연겨해제
 *                    }
 *                                        
 *                 = **예외회피 : 예외 떠넘기기(라이브러리)
 *                    -> 사용법
 *                       메소드 선언 뒤에 예상되는 에러를 선언
 *                          메소드 호출시에 처리할 수 있게 만든다
 *                          -> 사용하는 프로그래머가 처리해서 사용
 *                          -> 1) 선언
 *                             2) try~catch
 *                             ex) public void method() throws 예외처리클래스, 예외처리 클래스...
 *                             {
 *                                예상되는 에러를 체크하고 throws 한다
 *                             }
 *                             public void display()
 *                             {
 *                                try
 *                                {
 *                                   method()
 *                                }catch(예외처리 클래스){}
 *                                
 *                             }
 *                             
 *                             선언된 예외클래스가 많은 경우
 *                             -> 1) 전체를 사용 catch()를 여러개 사용
 *                             -> 2) 전체를 포함 클래스를 통합 Exception / Throwable
 *                             
 *                             ex)
 *                             public void method() throws IOExcepiton, InteruuptedException, SQLException 등등...
 *                             {
 *                                try
 *                                {
 *                                } catch(위에 언급한 에러를 다적거나 아니면 상위 클래스인 Exception / Throwable을적는다){
 *                                } catch(...){
 *                                } catch(위에보다 상위){
 *                                }             
 *                             }
 *                             
 *                 = 예외 임의 발생 : throw( 테스트용으로 사용) -> 배포
 *                 = 사용자 정의 예외처리 : 거의 사용빈도가 없다
 *                   class MyException extends Exception
 *                   -> 차라리 if문을 사용해서 처리
 *                 
 *                 프로그램상에서 제어가 안되는 경우가 많다
 *                    -> 다른프로그램과 연동 : 브라우저, 오라클... 
 *                 
 *                       
 *                       
 * 9, 10장 -> 라이브러리
 * java.lang : 자바 프로그램 기본 라이브러리 (가장 많이 사용)
 *             -> import 생략
 *    라이브러리 : 변수는 없다 / 메소드(기능) 이걸 갖다쓰는거 
 *    -> Object
 *       -> Object clone() : 복제 (prototype : spring)
 *          새로운 메모리를 생성
 *       -> equals() : 객체 비교(오버라이딩을 하기 전까지는 메모리 주소를 비교한다)
 *                            ------ 값비교는 String
 *       -> toString() : 객체를 문자열화(디폴트는 메모리주소 리턴)
 *       -> finalize() : 소멸자 (객체 메모리 해제 ->자동호출)
 *       -> String -> 라이브러리 문제 풀이 참고! ***
 *       
 *    -> StirngBuffeer : 문자열 결합 -> append() 
 *    -> Wrapper : 문자열을 해당 문자의 클래스화
 *       = Integer
 *       = Double
 *       = Boolean
 *       = Long
 *       => 문자열을 해당 데이터형으로 변경할때 주로 사용
 *       Integer.parseInt("10") "10" -> 10
 *       Long.parseLong("10") -> 10L
 *       
 *       -> 제네릭 사용시 : 항상 클래스형으로만 등록이가능하다
 *          컬렉션 정수 저장
 *          List<Integer> -> list<int>
 *       -> 호환
 *          Integer i=10 -> 오토박싱(박싱)
 *          int i=new Integer(10) -> 언박싱
 *       
 *       
 *    -> System : gc()
 *    -> math : ceil(), round(), random()    
 *      
 *       
 * java.util
 *    -> 프로그램에서 많이 사용되는 유용한 클래스의 집합
 *    -> 날짜
 *       Date / Calendar
 *       Date : 기능이 없다(단지 날짜 저장할 목적)
 *       Calendar : Date에 없는 기능을 보완 -> 달력 만드때 사용
 *          날짜 설정 : set(Calendar.YEAR,2023)...
 *                                MONTH, DATE등등 들어갈 수 있음
 *          날짜 읽기 : get(Calendar.YEAR) 마찬가지로 MONT, DATE가능
 *          요일 읽기 : get(Calendar.DAY_OF_WEEK)
 *          월 (MONTH)-> 0부터 시작 / 등록시 -1
 *          요일 (Week) -> 1부터 시작 / 사용시 -1
 *    -> 문자열 분해
 *       StringTokenizer
 *          -> counterTokens() : 분해된 문자열의 갯수
 *          -> hasMoreTokens() : 데이터가 존재할때까지 true
 *             주로 while을 이용해서 이용
 *          -> nextTokens() : 실제 분해된 데이터 읽을 경우에 주로 사용
 *          -> 오라클 연동 / 네트워크로 상대방에 값을전송
 *    -> 자료구조 : 메모리에서 데이터를 쉽게 관리할 수 있게 만든 클래스
 *       -----(컬렉션) 데이터를 모아서 관리 -> 가변형(크기를 결정하지 않는다)
 *       -----관리프로그램을 제작(사람, 영화...)
 *       -----표준화(모든 프로그래머가 동일하게 사용)
 *            ---인터페이스
 *            collection
 *               1) List : 순서가 존재 인덱스 0부터 시작, 중복 데이터 허용, 오라클 연동시 주로 사용
 *                         오라클(DB) 변수 -> 메모리 -> 파일 -> 오라클 서버(제약 조건이 있다)
 *                  1. ArrayList*** : web데이터를 모아서 전송할때(목록)
 *                     ***-> 추가 add()
 *                     -> 수정 set()
 *                     ***-> 읽기 get(int index)
 *                     ***-> 저장 갯수 size()
 *                     ***-> 삭제 : clear()
 *                     -> 존재여부 : isEmpty*(
 *                  2. Vector
 *                  3. LinkedList
 *               2) Set : 순서가 없다, 값중복이 안됨
 *                       -> List에서 중복된 데이터 추룰로 자주씀
 *                  1. HashSet*** : 네트워크에서 서버에 접속하는 클라이언트의 IP,PORT
 *                                  WEB채팅
 *                  2. TreeSet
 *            3) Map(Collection 상속은 아님) : 순서가 없다 , key-value두개 동시 저장
 *               1. HashMap*** : 많이사용 web지원하는 클래스 -> map 클래스를 여러개 모아서 관리(Spring, mybatis)
 *                  -> put() : 저장시 사용
 *                  -> get(key) : 저장된 데이터 읽기
 *               2. HashTable 
 *               
 *            -> 기본 생성자를 사용하게 되면 모든 데이터형은 Object
 *               List list = new ArrayList();
 *                  저장 add(Object)
 *                  Object get(int index)
 *               Map map=new Hahsmap();
 *                  put(String s, Object o)
 *                  Object get(key)
 *               Set set=new Hashset();
 *                  add(Object)
 *                  Object get(int inedx)
 *                  -> 관리하기가 어렵다
 *                  -> Object가 추가 되면 모든 데이터형을 첨부
 *                     = 데이터형이 섞일 수 있어 for문 수행이 어렵다
 *                     = 같은 데이터형을 첨부하는 것이 편리하다
 *                     = Object 리턴이면 반드시 형변환을 시킨다
 *                     = 메소드에서 사용되는 모든 매개변수, 리턴형을 통일화 (제네릭) -> 표준화 가능 -> 1.5버전 부터 나왔다함
 *                     = 형변환 할 필요가 없기 때문에 소스가 간결하다
 *                     문자열
 *                     List<String> -> add(String s), String get(index)
 *                     List<Integer> -> add(Integer s) 오토박싱, Integer get(index) 언박싱
 *                                
 * 
 * java.text
 *    날짜 변경(출력 형식) : SimpleDateFormat()
 *        년도 : yyyy
 *        월 : MM, M
 *        -> yyyy/MM/dd , yyyy-MM-dd
 *        숫자 : DecimalFormat -> ###,###
 *        오라클 (TO CHAR)
 * 
 * java.io
 * java.net
 * java.sql
 * 
 * 
 * 
 */

public class 정리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
