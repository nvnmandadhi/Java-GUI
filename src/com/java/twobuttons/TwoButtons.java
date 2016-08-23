package com.java.twobuttons;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

import com.java.drawing.*;

public class TwoButtons {
	
	JFrame frame;
	JLabel label;

	public static void main(String[] args) {
		
		TwoButtons obj = new TwoButtons();
		obj.go();

	}

	public void go() {
		
		frame = new JFrame();
		
		frame.setSize(400, 400);
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton colorbutton = new JButton("Change colors");
		JButton labelButton = new JButton("Change label");
		label = new JLabel("I'm a label");
		
		MyDrawPanel drawPanel = new MyDrawPanel();
		
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		frame.getContentPane().add(BorderLayout.WEST, label);
		frame.getContentPane().add(BorderLayout.SOUTH, colorbutton);
		frame.getContentPane().add(BorderLayout.EAST, labelButton);
		
		colorbutton.addActionListener(new ButtonListener());
		labelButton.addActionListener(new LabelListener());
		
	}
	
	public class LabelListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setText("I'm a changed label");
			
		}
		
	}
	public class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			frame.repaint();
		}
		
	}

}
