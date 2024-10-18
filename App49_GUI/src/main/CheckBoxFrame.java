package main;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxFrame extends JFrame implements ActionListener {
	
	JCheckBox checkBox;
	Button button;
	
	CheckBoxFrame() {
		ImageIcon icon = new ImageIcon("icon.png");
		ImageIcon selectedIcon = new ImageIcon("thumb_up.png");
		
		checkBox = new JCheckBox();
		checkBox.setText("I'm not a robot");
		checkBox.setFont(new Font("Consolas", Font.PLAIN, 24));
		checkBox.setFocusable(false);
		checkBox.setIcon(icon);
		checkBox.setSelectedIcon(selectedIcon);
		
		button = new Button("Submit");
		button.setPreferredSize(new Dimension(100, 50));
		button.addActionListener(this);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.add(button);
		this.add(checkBox);
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			System.out.println(checkBox.isSelected());
		}
	}
	
	
}
