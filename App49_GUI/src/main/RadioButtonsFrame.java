package main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonsFrame extends JFrame implements ActionListener {

	JRadioButton mage;
	JRadioButton warrior;
	JRadioButton assassin;
	
	RadioButtonsFrame() {
		mage = new JRadioButton("Mage");
		warrior = new JRadioButton("Warrior");
		assassin = new JRadioButton("Assassin");
		
		mage.addActionListener(this);
		warrior.addActionListener(this);
		assassin.addActionListener(this);
		
		ButtonGroup group = new ButtonGroup();
		group.add(mage);
		group.add(warrior);
		group.add(assassin);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.add(mage);
		this.add(warrior);
		this.add(assassin);
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == mage) 
			System.out.println("You chose mage");
		else if(e.getSource() == warrior)
			System.out.println("You chose warrior");
		else if(e.getSource() == assassin)
			System.out.println("You chose assassin");		
	}

}
