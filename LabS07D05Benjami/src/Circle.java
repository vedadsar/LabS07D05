import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;


public class Circle extends JPanel implements ActionListener, KeyListener{

	private int x ;
	private int y ;
	private int speed = 1;
	private int bodyCount;
	private int frame;
	
	public Circle(){
		
		Timer t = new Timer(250, this);
		t.start();
		this.addKeyListener(this);
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		for(int i=0; i<bodyCount;i++){
			g.fillOval((int)(Math.random()*500),(int)(Math.random()*500), 30, 30);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame++;
		repaint();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		bodyCount++;
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
