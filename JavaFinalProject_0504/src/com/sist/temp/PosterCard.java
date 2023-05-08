package com.sist.temp;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.net.*;

import com.sist.common.ImageChange;
import com.sist.manager.GenieMusicVO;


public class PosterCard extends JPanel{
	JLabel poLa=new JLabel(); //이미지출력
	JLabel tLa = new JLabel();// 제목출력
		
	//초기화
	public PosterCard(GenieMusicVO vo){
		setLayout(null);
		poLa.setBounds(5,5,150,130);
		tLa.setBounds(5,140,150,30);
		
		add(poLa);
		add(tLa);
		
		try {
			URL url=new URL("Http:"+vo.getPoster());
			Image img=ImageChange.getImage(new ImageIcon(url), 150, 130);
			poLa.setIcon(new ImageIcon(img));
			tLa.setText(vo.getTitle());
			
		} catch (Exception ex) {
			// TODO: handle exception
		}
	}
	
	

}
