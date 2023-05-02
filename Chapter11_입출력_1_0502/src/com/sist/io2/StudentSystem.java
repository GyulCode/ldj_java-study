package com.sist.io2;
import java.util.*;
import java.io.*;
public class StudentSystem {
	// 모든 학생을 읽어서 메모리에 저장
	private static List<Student> stdList = new ArrayList<Student>();
	
	//파일을 읽어서 메모리에 저장
	static {
		FileReader fr = null; //여기서 파일 경로를 선언하면 예외처리가 안되어서 오류임
		try {
			fr=new FileReader("C:\\java_datas\\school.txt");
			
			StringBuffer sb=new StringBuffer();
			int i=0;
			while((i=fr.read())!=-1) {
				sb.append((char)i);
			}
			// 홍길동|90|90|90|270|90.00\n

			// 학생별로 구분
			String[] stds=sb.toString().split("\n");
			for(String ss:stds) {
				// 학생각각의 데이터별 구분
				StringTokenizer st=new StringTokenizer(ss,"|");
				Student s=new Student();
				s.setHakbun(Integer.parseInt(st.nextToken()));
				s.setName(st.nextToken());
				s.setKor(Integer.parseInt(st.nextToken()));
				s.setEng(Integer.parseInt(st.nextToken()));
				s.setMath(Integer.parseInt(st.nextToken()));
				
				int total=s.getEng()+s.getKor()+s.getMath();
				s.setTotal(total);
				s.setAvg(total/3.0);
				
				stdList.add(s);
			}
		} catch (Exception ex) {
			// TODO: handle exception
			ex.printStackTrace(); // 에러 위치 확인
		}finally {
			try {
				fr.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
	}
	public int menu() {
		System.out.println("=========메뉴=============");
		System.out.println("1. Student List");
		System.out.println("2. Register");
		System.out.println("3. Modify");
		System.out.println("4. Delete");
		System.out.println("5. Program Exit");
		
		int no=0;
		try {
			// 키보드 읽기 -> 예외처리 -> Scanner를 대체
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));

			System.out.println("메뉴번호 입력:");
			String str=in.readLine();
			no=Integer.parseInt(str);

		} catch (Exception ex) {
			// TODO: handle exception
		}
		return no;
	}
	
	public void process() {
		while(true) {
			
			int no=menu();
			if(no==5) {
				System.out.println("Progam Exit");
				FileWriter fw=null; // 한글저장시 outputstream 보다는 writer가 나음 2byte라 그럼
				try {
					fw=new FileWriter("C:\\java_datas\\school.txt");
					// 자바프로그램과 파일 연결 -> 스트림 (출력 스트림)
					// 2byte씩 전송한다 (문자 스트림) -> 한글(2byte)
					// 알파벳은 상관없이 전송가능
					String temp="";
					for(Student ss:stdList) {
						temp+=ss.getHakbun()+"|"+ss.getName()+"|"+ss.getKor()+"|"+ss.getEng()+"|"+ss.getMath()+
								"\n";
								
					}
					fw.write(temp);
				} catch (Exception ex) {
					ex.printStackTrace();
				} finally {
					try {
						fw.close();
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
				break;
			}
			
			else if(no==1) {
				for(Student ss:stdList) {
					int total=ss.getEng()+ss.getKor()+ss.getMath();
					ss.setTotal(total);
					ss.setAvg(total/3.0);

					System.out.println(ss.getHakbun()+" "+ss.getName()+" "+ss.getKor()+" "+ss.getMath()+" "+
				ss.getEng()+" "+ss.getTotal()+" "+ String.format("%.2f", ss.getAvg()));
				}
			}
			
			else if(no==2) {
				try {
					
					BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
					System.out.println("이름을 입력");
					String name=in.readLine();
					System.out.println("국어점수 : ");
					String kor=in.readLine();
					System.out.println("영어점수 : ");
					String eng=in.readLine();
					System.out.println("수학점수 : ");
					String math=in.readLine();
					
					// 시퀀스 -> 자동 증가 번호 만들기 -> 구분자
					int max=0;
					for(Student ss:stdList) {
						if(ss.getHakbun()>max)
							max=ss.getHakbun();
					}
					Student s=new Student();
					s.setName(name);
					s.setHakbun(max+1);
					s.setKor(Integer.parseInt(kor));
					s.setEng(Integer.parseInt(eng));
					s.setMath(Integer.parseInt(math));
					
					stdList.add(s);

				} catch (Exception e) {
					// TODO: handle exception
				}

			}
			else if(no==4) {
				try {
					BufferedReader in =
							new BufferedReader(new InputStreamReader(System.in)); // 키보드로 부터 입력받는 형식 암기
					System.out.println("학번 입력 : ");
					String hak= in.readLine();
					int i=0;
					for(Student ss:stdList) {
						if(ss.getHakbun()==Integer.parseInt(hak)) {
							stdList.remove(i); // i 또는 ss
						}
						i++;
					}
					
				} catch (Exception e) {
					
				}
				
			}
		
			
			
		}
	}

}
