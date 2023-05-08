package com.sist.temp;
import java.awt.*;
import javax.swing.*;
public class Login extends JFrame{
	JLabel la1, la2, la3;
	JTextField tf1, tf2;
	JRadioButton rb1, rb2;
	JButton b1,b2;
	
	public Login() {
//		setLayeredPane(null);
		la1=new JLabel("아이디");
		la2=new JLabel("이름");
		la3=new JLabel("성별");
		
		tf1=new JTextField();
		tf2=new JTextField();
		
		rb1=new JRadioButton("남자");
		rb2=new JRadioButton("여자");
		
		// 그룹으로 묶는다
		ButtonGroup bg=new ButtonGroup();
		bg.add(rb1); bg.add(rb2);
		rb1.setSelected(true);
		
		b1=new JButton("로그인");
		b2=new JButton("취소");
		// 각 클래스 초기화
		// 윈도우에 배치
		la1.setBounds(10, 15, 60, 30);
		tf1.setBounds(80, 15, 150, 30);
		
		la2.setBounds(10, 50, 60, 30);
		tf2.setBounds(80, 50, 150, 30);
		
		la3.setBounds(10, 85, 60, 30);
		rb1.setBounds(80, 85, 70, 30);
		rb2.setBounds(155, 85, 70, 30);
		
//		b1.setBounds(80, 105, 70, 30);
//		b2.setBounds(155, 105, 70, 30);
		
		JPanel p=new JPanel();
		p.add(b1);
		p.add(b2);
		
		p.setBounds(10,120,215,35);
		
		add(la1); add(tf1);
		add(la2); add(tf2);
		add(la3); add(rb1); add(rb2);
		add(p);
		
		setSize(270,200);
		setVisible(true);

		
	}
	
	public static void main(String[] args) {
		new Login();
	}
	

}
