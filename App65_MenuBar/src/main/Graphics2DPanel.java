package main;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Graphics2DPanel extends JPanel {
	
	Image image;
	
	Graphics2DPanel() {
		image = new ImageIcon("icon.png").getImage();
		this.setPreferredSize(new Dimension(500, 500));
	}
	
	@Override
	public void paint(Graphics g) {
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setPaint(Color.blue);	// Line's color
		g2d.setStroke(new BasicStroke(5));	// Line's width
		g2d.drawLine(0, 0, 500, 500);
		
		g2d.setPaint(Color.red);
//		g2d.drawRect(0, 0, 100, 200);
//		g2d.fillRect(0, 0, 100, 200);	// filled rectangle
				
		g2d.setPaint(Color.red);
//		g2d.fillArc(0, 0, 100, 100, 0, 180);
		g2d.setPaint(Color.black);
//		g2d.drawArc(0, 0, 100, 100, 0, 180);
		
		int[] xPoints = { 150, 250, 350 };
		int[] yPoints = { 250, 100, 250 };
		
//		g2d.drawPolygon(xPoints, yPoints, 3);
		g2d.fillPolygon(xPoints, yPoints, 3);
		
		g2d.setPaint(Color.green);
		g2d.setFont(new Font("Ink Free", Font.ITALIC, 24));
//		g2d.drawString("Hello there", 50, 50);	// for (0, 0) it's hidden under the top bar
		
		g2d.drawImage(image, 0, 0, null);
	}
}
