package main;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerFrame extends JFrame implements MouseListener{

	JLabel label1;
	JLabel label2;
	JLabel label3;
	JLabel label4;
	
	MouseListenerFrame() {
		
		label1 = new JLabel();
		label2 = new JLabel();
		label3 = new JLabel();
		label4 = new JLabel();
		
		label1.setBounds(0, 0, 100, 100);
		label2.setBounds(100, 0, 100, 100);
		label3.setBounds(0, 100, 100, 100);
		label4.setBounds(100, 100, 100, 100);
		
		label1.setBackground(Color.black);
		label1.setOpaque(true);
		label2.setBackground(Color.black);
		label2.setOpaque(true);
		label3.setBackground(Color.black);
		label3.setOpaque(true);
		label4.setBackground(Color.black);
		label4.setOpaque(true);
		
		label1.addMouseListener(this);
		label2.addMouseListener(this);
		label3.addMouseListener(this);
		label4.addMouseListener(this);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(250, 250);
		this.add(label1);
		this.add(label2);
		this.add(label3);
		this.add(label4);
		this.setVisible(true);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
		if(e.getSource() == label1)
			label1.setBackground(Color.red);
		else if(e.getSource() == label2)
			label2.setBackground(Color.red);
		else if(e.getSource() == label3)
			label3.setBackground(Color.green);
		else if(e.getSource() == label4)
			label4.setBackground(Color.red);		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
		if(e.getSource() == label1)
			label1.setBackground(Color.black);
		else if(e.getSource() == label2)
			label2.setBackground(Color.black);
		else if(e.getSource() == label3)
			label3.setBackground(Color.black);
		else if(e.getSource() == label4)
			label4.setBackground(Color.black);
	}

}
