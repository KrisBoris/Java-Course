package main;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {

		// JFrame - a GUI window to add components to
		
		/*
		 * Lesson 49 - JFrame 
		 */
		
		// or just 'new MyFrame();'
		MyFrame frame = new MyFrame();

		
		/*
		 * Lesson 50 - JLabel
		 */
		
		ImageIcon image = new ImageIcon("icon.png");
		Border border = BorderFactory.createLineBorder(Color.green, 3);
		
		JLabel label = new JLabel();
		label.setText("Hello there");
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);	// set text LEFT, CENTER, RIGHT of the imageicon
		label.setVerticalTextPosition(JLabel.TOP); 	// set text TOP, CENTER, BOTTOM of imageicon
		label.setForeground(new Color(255, 0, 0)); 	// Set color if the text
		label.setFont(new Font("MV Boli", Font.PLAIN, 24));
		label.setIconTextGap(20);	// set gap of text to image
		label.setBackground(Color.black);
		label.setOpaque(true); 	// display background color
		label.setBorder(border); 	// Set border of the label (not image + text)
		label.setVerticalAlignment(JLabel.CENTER);	// set vertical position of text+image in label
		label.setHorizontalAlignment(JLabel.CENTER);	// set horizontal position of text+image in label
//		label.setBounds(100, 100, 400, 400);
		
//		frame.setSize(500, 500);
//		frame.setLayout(null);				
		
		frame.add(label);	
		frame.pack();	// Adjust frame's size to it's content
		
		
		/*
		 * Lesson 51 - JPanel
		 */
		
		ImageIcon image2 = new ImageIcon("thumb_up.png");
		
		JLabel label2 = new JLabel();
		label2.setText("Good job");
		label2.setIcon(image2);
//		label2.setHorizontalAlignment(JLabel.RIGHT);
//		label2.setVerticalAlignment(JLabel.CENTER);
		label2.setBounds(50, 50, 160, 160);
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setLayout(null);
		redPanel.setBounds(0, 0, 400, 400);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setLayout(null);
		greenPanel.setBounds(400, 0, 400, 400);
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setLayout(null);
		bluePanel.setBounds(0, 400, 800, 400);
		
		/*
		 * If using setBounds for panels, you must also use it for labels,
		 * otherwise it doesn't work
		 */
		
		JFrame frame2 = new JFrame();
		
		frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame2.setLayout(null);
		frame2.setSize(900, 900);
		frame2.setVisible(true);
		
		bluePanel.add(label2);
		frame2.add(redPanel);
		frame2.add(greenPanel);
		frame2.add(bluePanel);		
		
		
		/*
		 * Lesson 52 - Buttons
		 */
		
		MyFrameButton frameButton = new MyFrameButton();
		
		
		/*
		 * Lesson 53 - Border layouts
		 */
		
		// Layout manager - Defines the natural layout for components within a container
		
		// BorderLayout - places components in five ares: NORTH, SOUTH, WEST, EAST, CENTER
		//				  all extra space is placed in the central area
		
		JFrame frame3 = new JFrame();
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame3.setSize(600, 600);
		frame3.setLayout(new BorderLayout(10, 10));	// (10, 10) -> margins
		frame3.setVisible(true);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		panel1.setBackground(Color.red);
		panel2.setBackground(Color.yellow);
		panel3.setBackground(Color.green);
		panel4.setBackground(Color.blue);
		panel5.setBackground(Color.pink);
		
		panel1.setPreferredSize(new Dimension(50, 50));
		panel2.setPreferredSize(new Dimension(50, 50));
		panel3.setPreferredSize(new Dimension(50, 50));
		panel4.setPreferredSize(new Dimension(50, 50));
		panel5.setPreferredSize(new Dimension(50, 50));
		
		frame3.add(panel1, BorderLayout.NORTH);
		frame3.add(panel2, BorderLayout.EAST);
		frame3.add(panel3, BorderLayout.SOUTH);
		frame3.add(panel4, BorderLayout.WEST);
		frame3.add(panel5, BorderLayout.CENTER);
		
		
		/*
		 * Lesson 54 - FlowLayout
		 */
		
		// FlowLayout - places components in a row, sized by their preferred size.
		//				If the horizontal space within the container is too small, 		
		//				FlowLayout class uses the next row available row.
		
		JFrame frame4 = new JFrame();
		frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame4.setSize(500, 500);
		frame4.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		
		JPanel panelFlow = new JPanel();		
		panelFlow.setLayout(new FlowLayout());
		panelFlow.setBackground(Color.LIGHT_GRAY);
		panelFlow.setPreferredSize(new Dimension(100, 400));
		
		panelFlow.add(new Button("1"));
		panelFlow.add(new Button("2"));
		panelFlow.add(new Button("3"));
		panelFlow.add(new Button("4"));
		panelFlow.add(new Button("5"));
		panelFlow.add(new Button("6"));
		panelFlow.add(new Button("7"));
		panelFlow.add(new Button("8"));
		panelFlow.add(new Button("9"));
		
		frame4.add(panelFlow);
		frame4.setVisible(true);
		
		
		/*
		 * Lesson 55 - GridLayout
		 * GraidLayout - places components in a grid of cells.
		 * 				 Each component takes all available space within the cell
		 * 				 and each cell is the same size.
		 */
		
		JFrame frame5 = new JFrame();
		frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame5.setSize(500, 500);
		frame5.getContentPane().setBackground(Color.black);
		frame5.setLayout(new GridLayout(3, 3, 10, 10));
		
		frame5.add(new Button("1"));
		frame5.add(new Button("2"));
		frame5.add(new Button("3"));
		frame5.add(new Button("4"));
		frame5.add(new Button("5"));
		frame5.add(new Button("6"));
		frame5.add(new Button("7"));
		frame5.add(new Button("8"));
		frame5.add(new Button("9"));
//		frame5.add(new Button("10"));
		
		frame5.setVisible(true);
		
		
		/*
		 * Lesson 56 - JLayeredPane
		 * JLayeredPane - Swing container that provides a third dimension for
		 * 				  positioning components, ex. depth, Z-index
		 */
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(50, 50, 500, 500);
		
		JPanel layeredPanel1 = new JPanel();
		JPanel layeredPanel2 = new JPanel();
		JPanel layeredPanel3 = new JPanel();
		
		layeredPanel1.setOpaque(true);
		layeredPanel1.setBackground(Color.red);
		layeredPanel1.setBounds(50, 50, 200, 200);
		
		layeredPanel2.setOpaque(true);
		layeredPanel2.setBackground(Color.green);
		layeredPanel2.setBounds(100, 100, 200, 200);
		
		layeredPanel3.setOpaque(true);
		layeredPanel3.setBackground(Color.blue);
		layeredPanel3.setBounds(150, 150, 200, 200);
		
		// First added stays on top
		layeredPane.add(layeredPanel1, Integer.valueOf(0));		
		layeredPane.add(layeredPanel2, Integer.valueOf(1));
		layeredPane.add(layeredPanel3, Integer.valueOf(2));
		
		JFrame frame6 = new JFrame();
		frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame6.setSize(new Dimension(600, 600));
		
		frame6.add(layeredPane);
		
		frame6.setLayout(null);
		frame6.setVisible(true);		
		
		
		/*
		 * Lesson 57 - Open a new window
		 */
		
		LaunchWindow launchWindow = new LaunchWindow();
		
		
		/*
		 * Lesson 58 - JOoptionPane
		 * JOoptionPane - pop up a standard dialog box that prompts user for a value
		 * 				  or informs them about something
		 */
		
//		JOptionPane.showMessageDialog(null, "Hello there", "Title", JOptionPane.PLAIN_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Hello there", "Title", JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Hello there", "Title", JOptionPane.QUESTION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Hello there", "Title", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "Hello there", "Your title is here!", JOptionPane.ERROR_MESSAGE);
				
		int answer = JOptionPane.showConfirmDialog(null, "Show me your motivation!", 
				"Secret message", JOptionPane.YES_NO_CANCEL_OPTION);
		// yes = 0, no = 1, cancel = 2, close = -1
		System.out.println("Answer value:" + answer);
		
		String name = JOptionPane.showInputDialog("What is your name?");
		System.out.println("I'm " + name);
		
		String[] responses = {"Thank you!", "I love you!", "No, YOU are breathtaking!"};
		ImageIcon icon = new ImageIcon("icon.png");
		
		int response = JOptionPane.showOptionDialog(null, "You are breathtaking!", "Love letter", 
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, 
				icon, responses, 0);
		System.out.println("Respose was: " + responses[response]);
		
		
		/*
		 * Lesson 59 - Textfield
		 * Textfield - GUI component that can by used to add, set or get text
		 */
		
		new TextFrame();
		
		
		/*
		 * Lesson 60 - JCheckBox
		 * JCheckBox - a GUI component that can be selected or unselected 
		 */
		
		new CheckBoxFrame();		
		
		
		/*
		 * Lesson 61 - JRadioButton
		 * JRadioButton - One or more buttons in grouping in which only one may be selected per group
		 */
		
		new RadioButtonsFrame();
		
	}
}
