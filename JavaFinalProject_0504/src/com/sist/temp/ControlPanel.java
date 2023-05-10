package com.sist.temp;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.*;
public class ControlPanel extends JPanel{
	NewsPanel np=new NewsPanel();
	ChatPanel cp=new ChatPanel();
	FindPanel fp=new FindPanel();
	RecommandPanel rp=new RecommandPanel();
	HomePanel hp;
	DetailPanel dp;
	CardLayout card=new CardLayout();
	// 화면 이동 
    public ControlPanel()
    {
    	hp=new HomePanel(this);
    	dp=new DetailPanel(this);
    	setLayout(card);
    	add("home",hp);
    	// @RequestMapping("main/maim.do")
    	add("news",np);
    	add("chat",cp);
    	add("find",fp);
    	add("recomm",rp);
    	add("detail",dp);
    }
}
