package com.sist.temp;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.*;
public class ControlPanel extends JPanel{
	NewsPanel np=new NewsPanel();
	ChatPanel cp=new ChatPanel();
	FindPanel fp=new FindPanel();
	HomePanel hp;
	DetailPanel dp;
	BoardListPanel bp;
	BoardInsertPanel ip;
	BoardDetailPanel bdp;
	BoardUpdatePanel bup;
	BoardDeletePanel bdelp;
	CardLayout card=new CardLayout();
	// 화면 이동 
    public ControlPanel()
    {
    	hp=new HomePanel(this);
    	dp=new DetailPanel(this);
    	bp=new BoardListPanel(this);
    	ip=new BoardInsertPanel(this);
    	bdp=new BoardDetailPanel(this);
    	bup=new BoardUpdatePanel(this);
    	bdelp=new BoardDeletePanel(this);
    	setLayout(card);
    	add("home",hp);
    	// @RequestMapping("main/maim.do")
    	add("news",np);
    	add("chat",cp);
    	add("find",fp);
    	add("detail",dp);
    	add("board",bp);
    	add("insert",ip);
    	add("bdp",bdp);
    	add("bup",bup);
    	add("delete",bdelp);
    }
}
