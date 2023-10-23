import java.awt.Color;
import java.awt.Graphics;

public class Ball {
	private int x;
	private int y;
	private int radius;
	private Color color;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}

	public Ball() {
		
	}
	
	public Ball(int x, int y, int radius, Color color) {
		this.setX(x);
		this.setY(y);
		this.setRadius(radius);
		this.setColor(color);
	}
	
	public void draw(Graphics g) {
		g.setColor(this.getColor());
		g.fillOval(this.getX(), this.getY(), this.getRadius(), this.getRadius());
	}
	
}
