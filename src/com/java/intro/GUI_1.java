package com.java.intro;

import javax.swing.*;

public class GUI_1 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		JButton button = new JButton("Click me");
		
		frame.getContentPane().add(button);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(200, 200);
		frame.setVisible(true);
		
	}

}
