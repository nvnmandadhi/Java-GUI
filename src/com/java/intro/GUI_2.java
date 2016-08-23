package com.java.intro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI_2 implements ActionListener {
	
	JButton button;
	
	public static void main(String[] args) {
		
		GUI_2 obj = new GUI_2();
		obj.go();
	}
	

	private void go() {
		
		JFrame frame = new JFrame();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Closes the program when the window is closed
		
		frame.setSize(200, 200);
		frame.setVisible(true); //Set the visibility of the Frame
		
		button = new JButton("Click me"); //Button text
		
		frame.getContentPane().add(button);
		
		button.addActionListener(this); //Register the class with the button, or tell the button that you're interested in the button events
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		button.setText("I've been clicked!");
		System.out.println(e.toString());
	}

}
