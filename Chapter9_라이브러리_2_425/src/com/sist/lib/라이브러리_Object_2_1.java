package com.sist.lib;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class 라이브러리_Object_2_1 extends JFrame{
	JComboBox box; // <String> 강제 형변환
	JLabel la;
	public 라이브러리_Object_2_1() {
		box=new JComboBox();
		box.addItem("Hong");
		box.addItem("Sim");
		box.addItem("Park");
		la=new JLabel();
		
		//배치 layout = css
		add("North",box);
		add("Center",la);
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 라이브러리_Object_2_1();

	}

	
//	@Override
//	public void itemStateChanged(ItemEvent e) {
//		// TODO Auto-generated method stub
//		if(e.getSource()==box) {
//			String name=String.valueOf(box.getSelectedIndex());
////			String name=box.getSelectedItem()
//			la.setText(name);
//		}
//	}
	
	

}
