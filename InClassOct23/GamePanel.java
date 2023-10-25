import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;
	Shape[] shapes;
	Timer timer;
		
	public GamePanel(Dimension size) {
		this.setPreferredSize(size);
		this.setMaximumSize(size);
		this.setMinimumSize(size);
		this.setBackground(Color.black);
		this.setDoubleBuffered(true);
		this.setVisible(true);	
		
		shapes = new Shape[4];
		shapes[0] = new Circle(100,100,50,Color.blue);
		shapes[1] = new Square(200,200,Color.red,80);
		shapes[2] = new Circle(400,50,50,Color.yellow);
		shapes[3] = new Square(300,300,Color.green,40);
		
		timer = new Timer(30,this);
		timer.start();
		
		
	}
	
	public void draw(Graphics g) {
		int index;this.setVisible(true);		
		
		for(index=0;index<shapes.length;index++) {
			//System.out.println(shapes[index].toString());
			shapes[index].draw(g);
		}
	}
	
	public void update() {
		int index;
		
		for(index=0;index<shapes.length;index++) {
			shapes[index].update();
		}
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.draw(g);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		this.update();
		repaint();
		
	}

}
