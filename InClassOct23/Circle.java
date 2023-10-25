import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape{
	private int radius;

	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public Circle(int x, int y, int radius, Color color) {
		this.setX(x);
		this.setY(y);
		this.setRadius(radius);
		this.setColor(color);
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(this.getColor());
		g.fillOval(this.getX(), this.getY(), this.getRadius(), this.getRadius());
	}
	@Override
	public void update() {
		this.setY(this.getY()+2);
		if(this.getY()>500) {
			this.setY(-20);
		}
		
	}
	
}
