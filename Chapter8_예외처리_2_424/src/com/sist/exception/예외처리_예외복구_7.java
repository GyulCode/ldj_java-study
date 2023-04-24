package com.sist.exception;
/*
 *   예외처리방법
 *   1.예외 복구 : try~catch~finally -> 가장많이 사용됨
 *   2.예외 회피 : throws -> 라이브러리에 주로 있다
 *   ------------------------------------------
 *   3.임의 발생 : throw
 *   4.사용자 정의 : 지원하지 않는 경우에 직접 제작 <-거의 사용안함 if문 사용
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class 예외처리_예외복구_7 extends JFrame implements ActionListener{
	private JTextField tf;
	private JButton b1,b2; //부분적 예외처리
	private int com;
	
	public 예외처리_예외복구_7() { //생성자 초기화 및 시작과동시에 처리하는 내용
		tf=new JTextField(20);
		b1=new JButton("시작");
		b2=new JButton("종료");
		
		tf.setEnabled(false);
		JPanel p=new JPanel();
		p.add(tf);p.add(b1);p.add(b2);
		add("Center",p);
		setSize(400, 150);
		setVisible(true);
		
		b1.addActionListener(this);
		// b1번 클릭시 actionPerformed 수행
		b2.addActionListener(this);
		tf.addActionListener(this);
		// tf에서 엔터를 누르면 -> actionPerformed 호출한다(이벤트 등록)
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 예외처리_예외복구_7();

	}
	//버튼 처리하는 메소드 : 정의(용도가 여러개이기 때문에 구현을 하지 못한다)
	//호출은 해준다(자동 호출) -> 구현은 사용자에게 맡긴다
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b2) {
			System.exit(0);
		}
		else if(e.getSource()==b1) {
			com=(int)(Math.random()*100)+1;
			JOptionPane.showMessageDialog(this, "게임을 시작합니다");
			tf.setEnabled(true);
			tf.requestFocus();
			b1.setEnabled(false);
		}
		else if(e.getSource()==tf) {
			String strNum=tf.getText(); // 사용자의 값을 읽어온다
			
			//입력이 안된경우
			if(strNum.trim().length()<1) { // strNum 받을시 좌우의 공백 제거

				JOptionPane.showMessageDialog(this,"1~100사이의 정수 입력");
				tf.requestFocus();
				return; // 메소드 종료
			}
			
			//입력된상태
			int num=0;
			try {
				num=Integer.parseInt(strNum);
				//문자를 정수형으로 변경
				//정수를 문자열로 ValueOf()
				
			}catch(NumberFormatException ex){
				//잘못된 입력인 경우에 복구
				JOptionPane.showMessageDialog(this,"정수만 입력이 가능하다");
				tf.setText("");
				tf.requestFocus();
				return;
				
			}
			
			//비교
			if(com>num) {
				JOptionPane.showMessageDialog(this,"입력한 정수보다 큰정수를 입력하세요");
				tf.setText("");
				tf.requestFocus();
			}
			else if(com<num) {
				JOptionPane.showMessageDialog(this,"입력한 정수보다 작은 정수를 입력하세요");
				tf.setText("");
				tf.requestFocus();
			}
			else
			{
				JOptionPane.showMessageDialog(this,"Gmae Over!!");
				tf.setText("");
				tf.setEnabled(false);
				b1.setEnabled(true);
			}
		}
		
	}

}
