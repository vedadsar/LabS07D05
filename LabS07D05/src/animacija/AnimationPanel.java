package animacija;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class AnimationPanel extends JPanel implements ActionListener{
	int circleDiameter = 30;
	int x;
	int y;
	Timer animationTimer;

	
	public AnimationPanel(){
		animationTimer = new Timer(1000/60, this);
		animationTimer.start();
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
				
		x= getWidth()/2 - circleDiameter;
		g.fillOval(x , y, circleDiameter, circleDiameter);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		y +=1;
		repaint();
	}

}
