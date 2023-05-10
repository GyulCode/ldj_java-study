package com.sist.temp;

import java.awt.*;

import javax.swing.JPanel;

public class TopPanel extends JPanel{
	Image img,img2;
    public TopPanel()
    {
    	img=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\m1.png");
    	img2=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\m2.png");
    }
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.white);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		g.drawImage(img, 0, 0, getWidth(), getHeight()/2, this);
		g.drawImage(img2, 0, getHeight()/2+10, getWidth(), getHeight()/2, this);
	}
    
}
