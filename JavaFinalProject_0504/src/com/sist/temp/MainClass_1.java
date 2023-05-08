package com.sist.temp;
/*
 *    1. 1024 바이트 크기
 *    Window -> javax.swing
 *    ---------------------
 *    1. Container : 윈도우
 *   	
	     1. JFrame : 일반 윈도우 화면창 같은거
	     ------
	     2.JDialong : 정보창, 입력창
	     3.JWindow : 사용빈도가 거의 없다
	     4.JPanel : 독립적으로 사용이 불가능 -> JFrame위에 설정 화면 분활에 많이 사용
	              Component 모아서 사용 
 *    2. Component
 *       1. Button
 *          -> JButton
 *          -> Menu
 *          -> JCheckBox
 *          -> JRadioButton
 *          
 *       2. 입력창
 *          -> 한줄 : JTextField, JPasswordField
 *          -> 여러줄 : JTextArea
 *          
 *       3. 목록 출력
 *          -> JcomboBox, JTable, JTree
 *          
 *       4. Label : 정보 이미지
 *       
 *       5. JScrollPane
 *  -------------------------------------------------
 *    3. 배치
 *         1. BoarderLayout
 *            -> 위/아래/좌/우/가운데             
 *         2. Flowlayout         
 *         3. GridLayout
 *         4. CardLayout
 *         5. 사용자 정의 (위치를 잡아서 처리)
 *         	  x,y,width,height
 *         
 *         -> 윈도우 크기
 *            1) 크기결정
 *               setSize(width,height)
 *            2) 윈도우 보여준다   
 *               setVisible(true)
 *            3) 상속 -> 이미 있는것들 대부분 갖다쓴다 -> 수정도 가능
 *    
 * 
 */
import java.awt.*; // Layout들이 여기 들어있음
import javax.swing.*; // window
import java.awt.event.*; // 이 3개는 쌍임

public class MainClass_1 extends JFrame {
	// 시작과 동시에 윈도우 설정
	// 그래서 생성자(초기화, 시작시 처리할일이 있을때 사용)로 처리한다
	// 생성자는 모든 클래스에서 사용이 가능해야한다!** -> public
	JButton b1,b2,b3,b4,b5;
	JMenuItem home, find, chat, news, board;
	JTabbedPane pane;
	public MainClass_1() {
		
		home=new JMenuItem("홈");
		find=new JMenuItem("검색");
		chat=new JMenuItem("Chat");
		news=new JMenuItem("News");
		board=new JMenuItem("Community");
		JMenu menu=new JMenu("메뉴");
		
		menu.add(home);
		menu.add(find);
		menu.add(chat);
		menu.add(news);
		menu.add(board);
		JMenuBar bar=new JMenuBar();
		bar.add(menu);
		setJMenuBar(bar);
		
		pane=new JTabbedPane();
		pane.addTab("홈", new JPanel());
		pane.addTab("검색", new JPanel());
		pane.addTab("채팅", new JPanel());
		pane.addTab("뉴스", new JPanel());
		pane.addTab("커뮤니티", new JPanel());
		add("Center",pane);
		
		// 윈도우 크기 결정
		b1=new JButton("홈");
		b2=new JButton("Search");
		b3=new JButton("Chatting");
		b4=new JButton("News");
		b5=new JButton("Community");
		
		JPanel p=new JPanel(); //일자 배치
		p.setLayout(new GridLayout(5,1,5,5));
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		add("West",p);
		
		
		JPanel p1=new JPanel(); //일자 배치
		p1.setLayout(new GridLayout(5,1,5,5));
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p1.add(b5);
		add("West",p1);
		
		// 윈도우에 배치
		add("North",p); // 앞글자 필수 대문자 / South, East West Center
		// JFrame -> Boarderlayout
		// JPanel -> FlowLayout
		
		setSize(800,650);
		
		// 윈도우 출력
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 상단에 x눌렀을때 메모리 해제 시켜줌 설정안하면 닫아도 안닫아지는...
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 생성자만 호출
		
		try {
//			UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookandFeel");
//			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
//			UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
//			UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
//			UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookandFeel");
//			UIManager.setLookAndFeel("com.jtattoo.plaf.bernsteinlookandfeel.BernsteinLookAndFeel");
//			UIManager.setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");
			UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
			
			// BernsteinLookAndFeel  
		} catch (Exception ex) {
			// TODO: handle exception
		}
		new MainClass_1();

	}

}
