import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class GameMain extends JFrame implements KeyListener{
	GameView gv=new GameView();
	public GameMain() {
		add("Center",gv);
		setSize(1024, 768);
		setVisible(true);
		this.addKeyListener(this);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GameMain();

	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==this) {
			switch(e.getKeyCode()) {
			case KeyEvent.VK_UP:
				gv.y-=3;
				if(gv.x<0)
					gv.x=1024;
				break;
			case KeyEvent.VK_DOWN:
				gv.y+=3;
				if(gv.x<0)
					gv.x=1024;
				break;
			case KeyEvent.VK_LEFT:
				gv.x-=5;
				if(gv.x<0)
					gv.x=1024;
				break;
			case KeyEvent.VK_RIGHT:
				gv.x+=5;
				if(gv.x<0)
					gv.x=1024;
				break;
			}
			repaint();
			
		}
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
