import java.awt.Color;
import java.awt.Graphics;

public class Body {
	
	private Point startPoint;
	private Point centerPoint;
	private int width;
	private int heigth;
	private Color color;
	private int speedX;
	private int speedY;
	
	public Body ( int x, int y, int width, int heigth, Color color, int speedX, int speedY){
		
		startPoint = new Point(x, y);
		this.width = width;
		this.heigth = heigth;
		this.color = color;		
		centerPoint = new Point(x+width/2, y+heigth/2); // Centar tacka sa novim x i y koordinatama.		
		this.speedX = speedX;
		this.speedY=speedY;
		
	}
	
	public void draw(Graphics g){
		move();
		g.setColor(color);
		return;
	}
	/**
	 * Funkcija provjerava da li je doslo do sudara dva tijela.
	 * @param other
	 * @return
	 */
	public boolean checkCollision(Body other){
		int d = centerPoint.getDistance(other.centerPoint);
		
		if( d <= width/2 + other.width/2)
			return true;
		
		else if (d <= heigth/2 + other.heigth/2)
			return true;
		
		else return false;
					
	}
	
	private void move (){
		
		this.startPoint.move(speedX, speedY);
		this.centerPoint.move(speedX, speedY);
		
	}
	
	public int getX(){
		return startPoint.getX();
	}
	
	public int getY(){
		return startPoint.getY();
	}

	public Point getStartPoint() {
		return startPoint;
	}

	
	public Point getCenterPoint() {
		return centerPoint;
	}

	

	public int getWidth() {
		return width;
	}

	

	public int getHeigth() {
		return heigth;
	}

	

}
