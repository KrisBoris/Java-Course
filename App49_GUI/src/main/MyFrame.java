package main;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	MyFrame() {
		
		this.setTitle("This is title");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	// after pressing 'X' -> exit application
		this.setResizable(true);	// prevent the frame from being resized
		this.setSize(500, 500); // set x-size and y-size of the frame
		this.setVisible(true);	// make the frame visible
		
		ImageIcon icon = new ImageIcon("icon.jpg");	// create an image icon
		this.setIconImage(icon.getImage());	// set icon of the frame
		this.getContentPane().setBackground(new Color(20, 50, 200));	// change background color (RGB or HEX)
	}
}
