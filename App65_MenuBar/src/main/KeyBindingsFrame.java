package main;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.KeyStroke;

public class KeyBindingsFrame {

	JFrame frame;
	JLabel label;
	Action upAction;
	Action downAction;
	Action leftAction;
	Action rightAction;
	
	
	KeyBindingsFrame() {
		
		upAction = new UpAction();
		downAction = new DownAction();
		leftAction = new LeftAction();
		rightAction = new RightAction();
		
		label = new JLabel();
		label.setBounds(100, 100, 100, 100);
		label.setBackground(Color.red);
		label.setOpaque(true);
		
		label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAction");
		label.getActionMap().put("upAction", upAction);
		label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction");
		label.getActionMap().put("downAction", downAction);
		label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAction");
		label.getActionMap().put("leftAction", leftAction);
		label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
		label.getActionMap().put("rightAction", rightAction);
		
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(400, 400);
		frame.setTitle("Key bindings");
		frame.add(label);
		frame.setVisible(true);
	}
	
	public class UpAction extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(label.getY() >= 10)
				label.setLocation(label.getX(), label.getY() - 10);			
		}		
	}
	
	public class DownAction extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(label.getY() + 110 <= 370)
				label.setLocation(label.getX(), label.getY() + 10);			
		}		
	}
	
	public class LeftAction extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(label.getX() >= 10)
				label.setLocation(label.getX() - 10, label.getY());			
		}		
	}
	
	public class RightAction extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(label.getX() + 110 <= 390)
			label.setLocation(label.getX() + 10, label.getY());			
		}		
	}
}
