package main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderFrame implements ChangeListener {

	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	SliderFrame() {
		slider = new JSlider(0, 100, 20);	// lower threshold, upper threshold, start value
		slider.setPreferredSize(new Dimension(50, 200));
		
		slider.setPaintTicks(true);	// small bars
		slider.setMinorTickSpacing(10);	// spacing between them
		
		slider.setPaintTrack(true);	// large bars
		slider.setMajorTickSpacing(25);	// spacing between them
		
		slider.setPaintLabels(true);	// Values of the large bars
		
		slider.setFont(new Font("MV Boli", Font.PLAIN, 12));
				
		slider.setOrientation(SwingConstants.VERTICAL);
		
		slider.addChangeListener(this);
		
		label = new JLabel();
		label.setText(slider.getValue() + " °C");
		label.setFont(new Font("MV Boli", Font.PLAIN, 24));
		
		panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(slider);
		panel.add(label);
		
		frame = new JFrame("SiderDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(60, 300);
		frame.add(panel);
		frame.setVisible(true);
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {		
		label.setText(slider.getValue() + " °C");
	}
	
	
}
