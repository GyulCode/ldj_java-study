package com.sist.temp;
import java.util.*;
import java.awt.*;
import javax.swing.*;
public class NewsCard extends JPanel{
     JLabel titleLa;
     JLabel contentTa;
     JLabel dateLa;
     public NewsCard()
     {
    	 setLayout(null);
    	 titleLa=new JLabel("");
    	 contentTa=new JLabel("");
    	 dateLa=new JLabel("");
    	 
    	 // 배치 
    	 titleLa.setBounds(10, 10, 730, 35);
    	 contentTa.setBounds(10,50, 730, 35);
    	 dateLa.setBounds(380, 90, 360, 35);
    	 
    	 // 추가 
    	 add(titleLa);
    	 add(contentTa);
    	 add(dateLa);
     }
}