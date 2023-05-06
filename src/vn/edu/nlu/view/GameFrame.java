package vn.edu.nlu.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import vn.edu.nlu.controller.ControllerSnake;
import vn.edu.nlu.model.Snake;
import vn.edu.nlu.model.Snake.KeyHandler;

public class GameFrame extends JFrame implements Runnable {
	private Thread thread;
	private int width = 500;
	private int height = 500;
	private ControllerSnake controller;

	public GameFrame() {
		setTitle("Game Snake");
		setSize(width, height);// 400 width and 500 height
		setLayout(new BorderLayout());// using no layout managers
		
		// panel run game
		Container contentPane = getContentPane();
		controller = new ControllerSnake(width, height);
		ScreenPanel panel = new ScreenPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		addKeyListener(controller.getSnakeKeyHandle());
		

		
		thread = new Thread(this);
		thread.start();
		// set up frame
		pack();
		this.setVisible(true);// making the frame visible
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// close program
	}

	private class ScreenPanel extends JPanel {

		public ScreenPanel() {
			setPreferredSize(new Dimension(width, height));
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			super.setBackground(Color.BLACK);

			controller.paintGame(g);
			this.setBackground(Color.WHITE);
		}

	}
	
	

	@Override
	public void run() {
		while (true) {
			try {
				thread.sleep(controller.getSpeed());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			controller.startSnake();
			repaint();
		}
	}

}
