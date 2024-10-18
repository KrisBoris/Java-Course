package main;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBoxFrame extends JFrame implements ActionListener {

	JComboBox comboBox;
	
	ComboBoxFrame() {
		String[] characters = {"Mage", "Warrior", "Assassin"};
		
		comboBox = new JComboBox(characters);
		comboBox.addActionListener(this);
		comboBox.insertItemAt("Healer", 0);
		comboBox.setSelectedIndex(0);
		comboBox.setEditable(true);
		System.out.println(comboBox.getItemCount());
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(new Dimension(200, 150));
		this.add(comboBox);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == comboBox) {
//			System.out.println(comboBox.getSelectedIndex());
			System.out.println(comboBox.getSelectedItem());
		}
		
	}
}
