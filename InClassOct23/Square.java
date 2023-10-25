import java.awt.Color;
import java.awt.Graphics;

public class Square extends Shape {
	private int side;
	
	public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}

	public Square(int x, int y, Color color, int side) {
		this.setX(x);
		this.setY(y);
		this.setColor(color);
		this.setSide(side);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(this.getColor());
		g.fillRect(this.getX(), this.getY(), this.getSide(), this.getSide());
		
	}
	@Override
	public void update() {
		this.setX(this.getX()+1);
		if(this.getX()>650) {
			this.setX(-20);
		}
	}

}
