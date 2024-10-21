package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class AnimationPanel extends JPanel implements ActionListener {

	final int PANEL_WIDTH = 800;
	final int PANEL_HEIGHT = 440;
	Image eagle;
	Image background;
	Timer timer;
	int x = 0;
	int y = 0;
	int xVelocity = 2;
	int yVelocity = 1;
	
	AnimationPanel() {
		this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
		this.setBackground(Color.blue);
		eagle = new ImageIcon("eagle.png").getImage();
		background = new ImageIcon("background.png").getImage();
		timer = new Timer(10, this);	
		timer.start();
	}
	
	@Override
	public void paint(Graphics g) {
		
		super.paint(g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.drawImage(background, 0, 0, null);
		g2d.drawImage(eagle, x, y, null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(x + eagle.getWidth(null) >= PANEL_WIDTH || x < 0)
			xVelocity *= -1;
		
		x += xVelocity;
		
		if(y + eagle.getHeight(null) >= PANEL_HEIGHT || y < 0)
			yVelocity *= -1;
		
		y += yVelocity;
		
		repaint();
	}
}
