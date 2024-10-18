package main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyListenerFrame extends JFrame implements KeyListener{

	JLabel label;
	
	KeyListenerFrame() {
		
		label = new JLabel();
		label.setBounds(0, 0, 50, 50);
		label.setBackground(Color.green);
		label.setOpaque(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 500);
		this.addKeyListener(this);
		this.add(label);
		this.setVisible(true);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		switch(e.getKeyChar()) {
			case 'w': label.setLocation(label.getX(), label.getY() - 10); break;
			case 's': label.setLocation(label.getX(), label.getY() + 10); break;
			case 'a': label.setLocation(label.getX() - 10, label.getY()); break;			
			case 'd': label.setLocation(label.getX() + 10, label.getY()); break;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}	
	
}
