package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow extends JFrame {
	
	JFrame frame;
	JLabel label;
	
	NewWindow() {
		
		frame = new JFrame();	
		label = new JLabel();
		
		label.setPreferredSize(new Dimension(100, 30));
		label.setBackground(Color.lightGray);
		label.setText("Hello there");

		frame.setSize(new Dimension(300, 300));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.add(label, BorderLayout.EAST);
		frame.setVisible(true);
	}
}
