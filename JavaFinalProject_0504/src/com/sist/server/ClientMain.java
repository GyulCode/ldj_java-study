package com.sist.server;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.table.*;
import javax.swing.text.Document;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

import com.sist.common.Function;

import java.net.*;
import java.util.*;
import java.io.*;

public class ClientMain extends JFrame implements ActionListener, Runnable{
	JTextPane pane; //편집가능
	JTextField tf;
	JButton b1,b2;
	JTable table; // 화면 UI
	DefaultTableModel model; // 데이터 관리
	JComboBox<String> box;
	
	// 서버와 연동
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			
			while(true) {
				
				String msg=in.readLine();
				StringTokenizer st= new StringTokenizer(msg,"|");
				int protocol=Integer.parseInt(st.nextToken());
				switch(protocol) {
				case Function.CHAT:{
					initStyle();
					append(st.nextToken(),st.nextToken());
				}
				break;
					
				}
			}
		} catch (Exception ex) {}
			// TODO: handle exception

	}
	// 버튼 클릭시 처리
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			try {
				s=new Socket("211.238.142.108",10000);
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));
				
				out=s.getOutputStream();
				
			} catch (Exception ex) {
				// TODO: handle exception
			}
			new Thread(this).start();
		}
		else if(e.getSource()==tf) {
			try {
				
				String msg=tf.getText();
				if(msg.length()<1) return;
				String color = box.getSelectedItem().toString();
				out.write((Function.CHAT+" "+msg+"|"+color+"\n").getBytes());
			} catch (Exception ex) {
				// TODO: handle exception
			}
		}
	}
	/*
	 *   화면관리 / 데이터 관리를 따로하는 프로그램
	 *   -----   ----
	 *   view    model  -> 연결 (Controller)
	 *   MVC(Spring)
	 *   
	 */
	
	// 네트워크에 필요한 클래스 설정
	Socket s; // 서버 연결
	
	// httpserveletrequest
	BufferedReader in; // 서버에서 보내주는 데이터를 읽는다
	
	// httpserveletresponse
	OutputStream out; // 서버에 요청
	
	public ClientMain() {

		// 초기화
		pane=new JTextPane();
		pane.setEditable(false);
		JScrollPane js1=new JScrollPane(pane);  // 스크롤바
		tf=new JTextField();
		box=new JComboBox<String>();
		
		// red 알림
		box.addItem("black");
		box.addItem("green");
		box.addItem("yellow");
		box.addItem("pink");
		box.addItem("blue");
		box.addItem("cyan");
		js1.setVisible(true);
		
		// 테이블
		String[] col= {"아이디","이름","성별"};
		String[][] row=new String[0][3];
		model=new DefaultTableModel(row,col);
		table=new JTable(model);
		JScrollPane js2=new JScrollPane(table);
		b1=new JButton("서버연결");
		b2=new JButton("연결 해제");
		JPanel p=new JPanel();
		p.add(b1);
		p.add(b2);
		
		// 배치
		setLayout(null);
		js1.setBounds(10, 15, 500, 600);
		tf.setBounds(19,620, 380, 30);
		box.setBounds(395,620,115,30);
		js2.setBounds(520,15,230,205);
		p.setBounds(520, 270, 230, 35);
		add(js1);
		add(tf); add(box);
		add(js2);
		add(p);
		String[] data= {"hong","홍길동","남자"};
		model.addRow(data);
		
		// 이벤트
		setSize(790, 700);
		setVisible(true);
		
		b1.addActionListener(this); // 서버 연결
		tf.addActionListener(this); // 채팅
	}
	public static void main(String[] args) {
		new ClientMain();
	}
	public void initStyle() {
		Style blue=pane.addStyle("blue", null);
		StyleConstants.setForeground(blue, Color.blue);
		
		Style yellow=pane.addStyle("yellow", null);
		StyleConstants.setForeground(yellow, Color.yellow);
		
		Style green=pane.addStyle("green", null);
		StyleConstants.setForeground(green, Color.green);
		
		Style pink=pane.addStyle("pink", null);
				StyleConstants.setForeground(pink, Color.pink);
				
		Style red=pane.addStyle("red", null);
		StyleConstants.setForeground(red, Color.red);
		
	}
	
	public void append(String msg, String color) {
		try {
			Document doc=pane.getDocument();
			doc.insertString(doc.getLength(), msg+"\n",pane.getStyle(color));
		} catch (Exception eㅌ) {
			// TODO: handle exception
		}
	}
}
