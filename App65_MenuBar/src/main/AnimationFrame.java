package main;

import javax.swing.JFrame;

public class AnimationFrame extends JFrame {

	AnimationPanel panel;
	
	AnimationFrame() {
		
		panel = new AnimationPanel();
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("2D animation");
		this.add(panel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
