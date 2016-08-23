package com.java.intro;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI_3 implements ActionListener{
	
	JButton button;

	public static void main(String[] args) {
		
		GUI_3 obj = new GUI_3();
		obj.go();
	}
	
	public void go(){
		
		JFrame frame = new JFrame();
		
		frame.setVisible(true);
		frame.setSize(400, 400);
		
		button = new JButton("Click me");
		
		frame.getContentPane().add(button);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		button.setText("I've been clicked!");
		button.setBackground(Color.PINK);
		
	}

}
