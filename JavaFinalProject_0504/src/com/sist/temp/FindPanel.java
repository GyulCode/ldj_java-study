package com.sist.temp;

import java.awt.*;
import java.net.URL;

import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import java.util.List;

import com.sist.common.ImageChange;
import com.sist.inter.FindInterface;
import com.sist.manager.*;
import java.awt.event.*;
public class FindPanel extends JPanel implements ActionListener,FindInterface{
   JTextField tf;
   JButton b1;
   JButton b2,b3,b4,b5,b6,b7;
   JTable table;
   DefaultTableModel model;
   MusicSystem ms=new MusicSystem();
   public FindPanel()
   {
	   // 초기화 
	   tf=new JTextField();
	   b1=new JButton("검색");
	   
	   b2=new JButton("가요");
	   b3=new JButton("POP");
	   b4=new JButton("OST");
	   b5=new JButton("트롯");
	   b6=new JButton("JAZZ");
	   b7=new JButton("CLASSIC");
	   
	   String[] col={"","","곡명","가수명","앨범"};
	   Object[][] row=new Object[0][5];
	   model=new DefaultTableModel(row,col){
        // 익명의 클래스 => 상속없이 생성자안에서 오버라이딩을 할때 사용 
		@Override
		public boolean isCellEditable(int row, int column) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Class<?> getColumnClass(int columnIndex) {
			// TODO Auto-generated method stub
			// 이미지 출력 
			return getValueAt(0, columnIndex).getClass();
		}
		    
	   };
	   table=new JTable(model);
	   // 출력위치 길이 설정 
	   table.setRowHeight(35);
	   // 타이틀바 고정
	   table.getTableHeader().setReorderingAllowed(false);
	   JScrollPane js=new JScrollPane(table);
	   
	   //배치 750 730 
	   setLayout(null);
	   tf.setBounds(10, 15, 300, 30);
	   b1.setBounds(315, 15, 100, 30);
	   
	   JPanel p=new JPanel();
	   p.setLayout(new GridLayout(1,6,5,5));
	   p.add(b2);
	   p.add(b3);
	   p.add(b4);
	   p.add(b5);
	   p.add(b6);
	   p.add(b7);
	   p.setBounds(10,55, 700, 35);
	   
	   js.setBounds(10,100,700,600);
	   add(tf);
	   add(b1);
	   add(p);
	   add(js);
	   try
	   {
	    List<GenieMusicVO> list=ms.musicCategoryData(1);
	    for(GenieMusicVO vo:list)
	    {
	       String s="";
	       if(vo.getState().equals("유지"))
	       {
	    	   s="-";
	       }
	       else if(vo.getState().equals("상승"))
	       {
	    	   s="▲ "+vo.getIdcrement();
	       }
	       else if(vo.getState().equals("하강"))
	       {
	    	   s="▼ "+vo.getIdcrement();
	       }
	       else if(vo.getState().equals("NEW"))
	       {
	    	   s="NEW";
	       }
	       URL url=new URL("http:"+vo.getPoster());
		   Image img=ImageChange.getImage(new ImageIcon(url), 
				   30, 30);
		   Object[] data={
			   s,
			   new ImageIcon(img),
			   vo.getTitle(),
			   vo.getSinger(),
			   vo.getAlbum()
		   };
		   model.addRow(data);
	    }
	   }catch(Exception ex){}
	   
	   b1.addActionListener(this);
	   b2.addActionListener(this);
	   b3.addActionListener(this);
	   b4.addActionListener(this);
	   b5.addActionListener(this);
	   b6.addActionListener(this);
	   b7.addActionListener(this);
	   tf.addActionListener(this);
   }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b2)
		{
			findPrint(1);
		}
		else if(e.getSource()==b3)
		{
			findPrint(2);
		}
		else if(e.getSource()==b4)
		{
			findPrint(3);
		}
		else if(e.getSource()==b5)
		{
			findPrint(4);
		}
		else if(e.getSource()==b6)
		{
			findPrint(5);
		}
		else if(e.getSource()==b7)
		{
			findPrint(6);
		}
		else if(e.getSource()==b1 || e.getSource()==tf)
		{
			String title=tf.getText();
			if(title.length()<1)
			{
				JOptionPane.showMessageDialog(this, "검색어 입력");
				tf.requestFocus();
				return;
			}
			findPrint2(title);
		}
	}
	public void findPrint(int cno)
	{
		for(int i=model.getRowCount()-1;i>=0;i--)
		{
			model.removeRow(i);
		}
		
		try
		   {
		    List<GenieMusicVO> list=ms.musicCategoryData(cno);
		    for(GenieMusicVO vo:list)
		    {
		       String s="";
		       if(vo.getState().equals("유지"))
		       {
		    	   s="-";
		       }
		       else if(vo.getState().equals("상승"))
		       {
		    	   s="▲ "+vo.getIdcrement();
		       }
		       else if(vo.getState().equals("하강"))
		       {
		    	   s="▼ "+vo.getIdcrement();
		       }
		       else if(vo.getState().equals("NEW"))
		       {
		    	   s="NEW";
		       }
		       URL url=new URL("http:"+vo.getPoster());
			   Image img=ImageChange.getImage(new ImageIcon(url), 
					   30, 30);
			   Object[] data={
				   s,
				   new ImageIcon(img),
				   vo.getTitle(),
				   vo.getSinger(),
				   vo.getAlbum()
			   };
			   model.addRow(data);
		    }
		   }catch(Exception ex){}
	}
	public void findPrint2(String title)
	{
		for(int i=model.getRowCount()-1;i>=0;i--)
		{
			model.removeRow(i);
		}
		
		try
		   {
		    List<GenieMusicVO> list=ms.musicFindData(title);
		    for(GenieMusicVO vo:list)
		    {
		       String s="";
		       if(vo.getState().equals("유지"))
		       {
		    	   s="-";
		       }
		       else if(vo.getState().equals("상승"))
		       {
		    	   s="▲ "+vo.getIdcrement();
		       }
		       else if(vo.getState().equals("하강"))
		       {
		    	   s="▼ "+vo.getIdcrement();
		       }
		       else if(vo.getState().equals("NEW"))
		       {
		    	   s="NEW";
		       }
		       URL url=new URL("http:"+vo.getPoster());
			   Image img=ImageChange.getImage(new ImageIcon(url), 
					   30, 30);
			   Object[] data={
				   s,
				   new ImageIcon(img),
				   vo.getTitle(),
				   vo.getSinger(),
				   vo.getAlbum()
			   };
			   model.addRow(data);
		    }
		   }catch(Exception ex){}
	}
}
