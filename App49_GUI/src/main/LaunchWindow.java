package main;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class LaunchWindow extends JFrame implements ActionListener {
	
	JFrame frame;
	JPanel panel;
	Button button;
	
	LaunchWindow() {
		
		frame = new JFrame();
		panel = new JPanel();
		button = new Button("Go to new window");
		
		button.setBounds(20, 50, 160, 50);
		button.setBackground(Color.gray);
		button.setFont(new Font("Comic Sans", Font.PLAIN, 24));
		button.addActionListener(this);
		
		panel.setBounds(50, 50, 200, 200);
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setOpaque(true);
		panel.add(button);
		
		frame.setSize(new Dimension(300, 300));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.add(panel);
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			frame.dispose();
			NewWindow newWindow = new NewWindow();			
		}
	}
}
