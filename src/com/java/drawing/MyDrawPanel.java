package com.java.drawing;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MyDrawPanel extends JPanel{
		
		public void paintComponent(Graphics g){
		
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
			
			int red = (int) (Math.random()*200);
			int green = (int) (Math.random()*200);
			int blue = (int) (Math.random()*200);
			
			Color randomColor = new Color(red, green, blue);
			g.setColor(randomColor);
			g.fillOval(20, 40, 100, 100);
			
		}
	}
