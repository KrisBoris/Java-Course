package main;

import javax.swing.JFrame;

public class Graphics2DFrame extends JFrame {	
	
	Graphics2DPanel panel;
	
	Graphics2DFrame() {
		
		panel = new Graphics2DPanel();
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(panel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}	
}
