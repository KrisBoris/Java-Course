package main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBarFrame extends JFrame implements ActionListener {

	JMenuBar menuBar;
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;
	JMenuItem loadItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	
	MenuBarFrame() {
		
		loadItem = new JMenuItem("Load");
		saveItem = new JMenuItem("Save");
		exitItem = new JMenuItem("Exit");
		
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		loadItem.setMnemonic(KeyEvent.VK_L);	// l for load
		saveItem.setMnemonic(KeyEvent.VK_S);	// s for load
		exitItem.setMnemonic(KeyEvent.VK_E);	// e for load
		
		
		fileMenu = new JMenu("File");
		editMenu = new JMenu("Edit");
		helpMenu = new JMenu("Help");
		
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		fileMenu.setMnemonic(KeyEvent.VK_F); 	// Alt + f for file
		editMenu.setMnemonic(KeyEvent.VK_E); 	// Alt + e for file
		helpMenu.setMnemonic(KeyEvent.VK_H); 	// Alt + h for file
		
		
		menuBar = new JMenuBar();
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(500, 500);
		this.setJMenuBar(menuBar);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == loadItem)
			System.out.println("File has been loaded");
		else if(e.getSource() == saveItem) 
			System.out.println("File has been saved");
		else if(e.getSource() == exitItem)
			System.exit(0);
	}
}
