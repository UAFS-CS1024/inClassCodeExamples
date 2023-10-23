import java.awt.Dimension;

import javax.swing.JFrame;

public class GameWindow extends JFrame {
	private Dimension size;
	private GamePanel game;
	
	public GameWindow() {
		this.setTitle("My Game");
		size = new Dimension(640,480);
		//** Instantiate and Add Game Panel
		game = new GamePanel(size);
		this.add(game);
		
		this.setPreferredSize(size);
		this.setMaximumSize(size);
		this.setMinimumSize(size);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		GameWindow gw = new GameWindow();
	}
}
