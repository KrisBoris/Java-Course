package main;

import javax.swing.JFrame;

public class DragDropFrame extends JFrame {

	DragPanel dragPanel = new DragPanel();
	
	DragDropFrame() {		
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(600, 600);
		this.setTitle("Drag and drop");
		this.add(dragPanel);
		this.setVisible(true);
	}
}
