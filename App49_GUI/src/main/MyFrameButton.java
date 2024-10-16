package main;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrameButton extends JFrame implements ActionListener {

	Button button;
	JLabel label;
	
	MyFrameButton() {
		
		ImageIcon icon = new ImageIcon("icon.png");
		ImageIcon icon2 = new ImageIcon("thumb_up.png");
		
		label = new JLabel();
		label.setBounds(150, 300, 200, 200);
		label.setIcon(icon2);
		label.setVisible(false);
		
		button = new Button();
		button.setBounds(150, 50, 200, 200);
		button.addActionListener(this);
		button.setLabel("This is button");		
		button.setFont(new Font("Comic Sans", Font.BOLD, 24) );
		button.setFocusable(false);
		button.setBackground(Color.LIGHT_GRAY);
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLayout(null);
		this.setSize(450, 600);
		this.setVisible(true);
		this.add(button);
		this.add(label);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			System.out.println("click");
			label.setVisible(true);
		}
	}
	
}
