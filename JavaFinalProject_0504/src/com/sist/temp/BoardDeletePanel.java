package com.sist.temp;
import java.util.*;
import com.sist.manager.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class BoardDeletePanel extends JPanel implements ActionListener{
	ControlPanel cp;// 화면 변경 
    JLabel titleLa;
    JLabel la,la1;
    JPasswordField pf;
    JButton b1,b2;
    BoardManager bm=new BoardManager();
    public BoardDeletePanel(ControlPanel cp)
    {
    	this.cp=cp;
    	titleLa=new JLabel("삭제하기");
    	titleLa.setFont(new Font("맑은 고딕",Font.BOLD,45));
    	titleLa.setHorizontalAlignment(JLabel.CENTER);
    	
    	la=new JLabel("비밀번호");
    	pf=new JPasswordField();
    	la1=new JLabel();
    	la1.setVisible(false);
    	b1=new JButton("삭제");
    	b2=new JButton("취소");
    	setLayout(null);
    	titleLa.setBounds(10, 15, 720, 60);
  	    add(titleLa);
  	    add(la1);
  	    la.setBounds(200, 100, 80, 30);
  	    pf.setBounds(290, 100, 200, 30);
  	    add(la);add(pf);
  	    
  	    JPanel p=new JPanel();
  	    p.add(b1);
  	    p.add(b2);
  	    p.setBounds(200, 175, 290, 35);
  	    add(p);
  	    
  	    b1.addActionListener(this);
  	    b2.addActionListener(this);
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			String pwd=String.valueOf(pf.getPassword());
			if(pwd.length()<1)
			{
				pf.requestFocus();
				return;
			}
			String res=bm.boardDelete(Integer.parseInt(la1.getText()),
					pwd);
			if(res.equals("NO"))
			{
			    JOptionPane.showMessageDialog(this, "비밀번호가 틀립니다!!");
			    pf.setText("");
			    pf.requestFocus();
			}
			else
			{
				JOptionPane.showMessageDialog(this, "삭제되었습니다");
				cp.card.show(cp, "board");
				cp.bp.boardPrint();
			}
		}
		else if(e.getSource()==b2)
		{
			cp.card.show(cp, "board");
		}
	}
}
