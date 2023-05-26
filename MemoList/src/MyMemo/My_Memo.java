package MyMemo;

/*
 23-05-15
 --study-
 1. 메모리 영역
 2. 깃(브랜치), 노션 공부
 3. 진도 복습 (html 110pag~, 데이터 베이스 복습, BoardUpdateServlet, 환경세팅) 
 4. 자바(소켓, 스트림, 제네릭)
 쇼핑리스트(면세, 옷), 환전(목)
 개발자(로드맵), 자바 

 --개인--
 여행 준비 : 면세, 옷
 개발자 :
 1. 목표 구체화
 2. 로드맵 작성 (요구사항 분석 및 필요 기술)
 3. 자바공부 (스트림버퍼, 제네릭, 소켓..등등)
 
 --취업 :
 1. 포폴 만들어두기(소켓, 크롤링)

Front-End : JavaScript(Jquery(Ajax),VueJS,ReactJS,NodeJS)
Back-End : Java, Oracle, Spring, MSA(분산처리)
                                       |  [도커, 쿠바네티스, 젠킨스]
                              MVC -> Domain
FullStack : Front + Back -> (Spring + VueJS, ReactJS => redux / Vue3)

JVM은 동작시 운영체제로 부터 JVM 고유의 메모리(runtime data area)를 할당받는다
그전에 JVM의 동작 과정을 잠시 복습하고가자!
자바컴파일러 javac가 바이트코드인 .class을(클래스파일 API) 만들면
ClassLoader가 Runtime Data area에 파일을 올려준다
그러면 Execution Engine에서 바이트 코드를 실행가능하도록 해석한다.

그럼 오늘의 주제인 Runtime Data Area / JVM의 메모리 영역을 알아보자
RDA 내부는 5개의 영역으로 다시 나누어 지는데
1. PC Register
2. Heap
3. (Java)Stack
4. Method Area : 인스턴스 생성을 위한 객체구조, 생성자, 필드, static변수, 메소드 데이터, 
JVM 동작시 같이 생성되고 종료시 같이 사라짐 / JVM당 1개만 생성됨 -> thread 들이 공유하는 영역
다른 메모리 영역에서 요청이 오면 실제 물리 메모리 주소로 변환되어서 전달됨

5. Navtive Method Stacks
https://tecoble.techcourse.co.kr/post/2021-08-09-jvm-memory/ - 사진
https://www.holaxprogramming.com/2013/07/16/java-jvm-runtime-data-area/

엔코아 인터파크














*/




