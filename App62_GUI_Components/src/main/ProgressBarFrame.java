package main;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressBarFrame extends JFrame {
	
	JProgressBar progressBar;
	
	ProgressBarFrame() throws InterruptedException {
		
		progressBar = new JProgressBar(0, 100);
		progressBar.setBounds(0, 0, 420, 50);
		progressBar.setStringPainted(true);
		progressBar.setFont(new Font("MV Boli", Font.BOLD, 24));
		progressBar.setBackground(Color.lightGray);
		progressBar.setForeground(Color.green);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(440, 100);
		this.add(progressBar);
		this.setVisible(true);
		
		fillBar();
	}

	private void fillBar() throws InterruptedException {		
		
		int counter = 0;
		
		while(counter <= 100) {
			progressBar.setValue(counter);
			
			try {
				Thread.sleep(100);	
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			counter++;			
		}
		
		progressBar.setString("Virus uploaded successfully");
	}
}
