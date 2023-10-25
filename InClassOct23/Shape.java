import java.awt.Color;
import java.awt.Graphics;

abstract public class Shape {
	private int x;
	private int y;
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

	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}

	abstract public void update();
	abstract public void draw(Graphics g);
}
