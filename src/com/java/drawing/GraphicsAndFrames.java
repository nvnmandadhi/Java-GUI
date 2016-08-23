package com.java.drawing;

import javax.swing.*; //for frame	
import java.awt.*; //for graphics object
import java.awt.event.*; //for listener

public class GraphicsAndFrames implements ActionListener{
	
	MyDrawPanel drawPanel = new MyDrawPanel();
	
	JButton button;
	JFrame frame;
	
	public static void main(String[] args){
		GraphicsAndFrames obj = new GraphicsAndFrames();
		obj.go();
	}
	
	private void go() {
		
		//Create a frame
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Create a button and register as listener
		button = new JButton("Change Colors");
		button.addActionListener(this);
		
		//add button to the frame
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.repaint();
		
	}

}
