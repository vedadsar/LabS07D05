import java.awt.Color;
import java.awt.Graphics;


public class Oval extends Body {

	public Oval(int x, int y, int width, int heigth, Color color, int speedX,
			int speedY) {
		super(x, y, width, heigth, color, speedX, speedY);

	}
	@Override
	public void draw(Graphics g){
		super.draw(g);
		g.fillOval(super.getX(), super.getY(), super.getWidth(), super.getHeigth());
		
	}
	

}
