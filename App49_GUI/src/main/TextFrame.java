package main;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class TextFrame extends JFrame implements ActionListener {

	Button button;
	JTextField text;
	
	TextFrame() {
		button = new Button();
		text = new JTextField();
		
		button.setPreferredSize(new Dimension(150, 100));
		button.setBackground(Color.lightGray);
		button.setLabel("Submit");
		button.addActionListener(this);
		
		text.setPreferredSize(new Dimension(400, 250));
		text.setBackground(new Color(0, 0, 0));
		text.setForeground(new Color(0x00FF00));
		text.setFont(new Font("Consolas", Font.PLAIN, 36));
		text.setCaretColor(Color.white);
		text.setText("Enter your login");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.add(button);
		this.add(text);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			button.setEnabled(false);
			text.setEditable(false);
			System.out.println("Hello " + text.getText());
		}
		
	}
}
