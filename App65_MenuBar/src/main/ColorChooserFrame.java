package main;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ColorChooserFrame extends JFrame implements ActionListener {

	Button button;
	JLabel label;
	
	ColorChooserFrame() {
		
		button = new Button("Choose color");
		button.setPreferredSize(new Dimension(80, 40));
		button.addActionListener(this);
		
		label = new JLabel();
		label.setText("Choose your color");
		label.setFont(new Font("Comic Sans", Font.PLAIN, 36));
		label.setForeground(Color.black);
		label.setBackground(Color.white);
		label.setOpaque(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(500, 200);
		this.add(button);
		this.add(label);
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			JColorChooser colorChooser = new JColorChooser();
			
			Color color = colorChooser.showDialog(null, "Choose your color", Color.black);
			
//			label.setBackground(color);
			label.setForeground(color);
		}		
	}
}
