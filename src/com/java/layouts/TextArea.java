package com.java.layouts;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class TextArea implements ActionListener{
	
	JTextArea textArea;
	JCheckBox check;

	public static void main(String[] args) {
		
		TextArea obj = new TextArea();
		obj.go();

	}

	private void go() {
			
		JFrame frame = new JFrame("TextArea Demo");
		
		JPanel panel = new JPanel();
		
		textArea = new JTextArea(10,10);
		textArea.setLineWrap(true);
		
		JButton button = new JButton("Click me");
		
		button.addActionListener(this);
		
		check = new JCheckBox("Check box");
		check.addActionListener(new CheckBoxListener());
		
		
		frame.getContentPane().add(check, BorderLayout.WEST);
		
		JScrollPane scroller = new JScrollPane(textArea);	
		
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		panel.add(scroller);
		
		frame.getContentPane().add(BorderLayout.CENTER, panel);
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		
		
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		textArea.append("button clicked \n");
		
	}
	
	class CheckBoxListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String onOrOff = "Off";
			
			if(check.isSelected()){
				onOrOff = "On";
			}
			System.out.println("The checkbox is :"+ onOrOff);
		}
		
	}

}
