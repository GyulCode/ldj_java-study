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
import javax.swing.JTextField;

public class HomePanel {
	
	public static void main(String[] args) {
		JFrame fram = new JFrame();
		GridLayout layout=new GridLayout(1,2);
		fram.setLayout(new GridLayout(3,1));		
		JLabel la1 = new JLabel("위쪽");
//		JLabel la2 = new JLabel("카운트");
		JTextField tf1 = new JTextField("0");
		JTextField tf2 = new JTextField("text222");
		JButton b1 = new JButton("Click!");
		
		fram.setVisible(true);
		fram.setSize(400,400);
		
//		la1.setText("Testing...");
//		la2.setText("Is it right?");
//		la1.setOpaque(true);
//		la2.setOpaque(true);
//		la1.setBackground(Color.red);
//		la2.setBackground(Color.pink);
		
		
	
		
		KeyListener kact=new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				System.out.println("keytype : "+ e.getKeyChar() +"코드 : "+e.getKeyCode());
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				System.out.println("keyreleased : "+ e.getKeyChar() +"코드 : "+e.getKeyCode());
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				System.out.println("keypressed : "+ e.getKeyChar() +"코드 : "+e.getKeyCode());
			}
		};
		
		ActionListener act=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tf1.setText(String.valueOf(Integer.valueOf(tf1.getText())+1));
			}
		};
		 b1.addActionListener(act);
		 la1.addKeyListener(kact);
		fram.add(la1,BorderLayout.NORTH);
		fram.add(tf1,BorderLayout.CENTER);
//		fram.add(la2);
		fram.add(b1,BorderLayout.SOUTH);
		
	}
	

}
