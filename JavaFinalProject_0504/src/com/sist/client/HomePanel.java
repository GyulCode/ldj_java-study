package com.sist.client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.PopupMenu;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class HomePanel {
	
	public static void main(String[] args) {
		JFrame fram = new JFrame();
		fram.setLayout(new GridLayout(3,1));
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JLabel la1 = new JLabel("위쪽");
		JTextField tf1 = new JTextField("0");
		JTextField tf2 = new JTextField("text222");
		JButton b1 = new JButton("Click!");
		
		String[] col= {"번호", "제목", "작성자"};
		String[][] row= {{"1번","밥먹자","헝그리"},{"2번","웅","웅잉"},{"3번","고로자","그로자"}};
		
		JTable t1=new JTable(row,col);
		JScrollPane sc1=new JScrollPane(t1);
		
		fram.setVisible(true);
		fram.setSize(400,400);
		tf1.setBackground(Color.pink);
		p1.setBackground(Color.blue);
	
		p1.add(la1,BorderLayout.NORTH);
		p1.add(tf1,BorderLayout.CENTER);
		p1.add(b1,BorderLayout.SOUTH);
		fram.add(p1,BorderLayout.SOUTH);
//		fram.add(p2);
		fram.add(sc1,BorderLayout.NORTH);
		
		
		

		
	}
	

}
