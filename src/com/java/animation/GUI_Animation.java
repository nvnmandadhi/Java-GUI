package com.java.animation;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class GUI_Animation {

	JFrame frame;
	JButton button;
	
	int x,y;

	public static void main(String[] args) {

		GUI_Animation obj = new GUI_Animation();
		obj.go();

	}

	private void go() {

		frame = new JFrame("Animation Demo");
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		button = new JButton("Start animation");
		button.addActionListener(new ButtonListener());

		DrawingAnimation animationPanel = new DrawingAnimation();

		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.getContentPane().add(BorderLayout.CENTER, animationPanel);

	}

	class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			for(int i=0;i<80;i++){
				x++;
				y++;
				
				frame.repaint();
				
				try {
					Thread.sleep(5);
					
				} catch (InterruptedException e1) {
					
					e1.printStackTrace();
				}
			}

		}
	}

	@SuppressWarnings("serial")
	public class DrawingAnimation extends JPanel {

		public void paintComponent(Graphics g) {

			g.fillRect(0, 0, this.getWidth(), this.getHeight());

			int red = (int) (Math.random() * 200);
			int green = (int) (Math.random() * 200);
			int blue = (int) (Math.random() * 200);

			Color randomColor = new Color(red, green, blue);
			g.setColor(randomColor);
			g.fillOval(x, y, 20, 20);

		}
	}

}
