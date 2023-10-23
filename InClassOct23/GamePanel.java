import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
	Ball ball;
		
	public GamePanel(Dimension size) {
		this.setPreferredSize(size);
		this.setMaximumSize(size);
		this.setMinimumSize(size);
		this.setBackground(Color.black);
		ball=new Ball(100,100,50,Color.blue);
		
		this.setVisible(true);		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		ball.draw(g);
	}

}
