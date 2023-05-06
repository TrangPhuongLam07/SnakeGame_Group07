package vn.edu.nlu.view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import vn.edu.nlu.controller.ControllerSnake;
import vn.edu.nlu.model.Snake;
import vn.edu.nlu.model.Snake.KeyHandler;

public class GameFrame extends JFrame implements Runnable {
	private int width = 500;
	private int height = 500;
	private ControllerSnake controller;

	public GameFrame() {
		setTitle("Game Snake");
		setSize(width, height);// 400 width and 500 height
		setLayout(new BorderLayout());// using no layout managers
		controller = new ControllerSnake(width, height);

		// panel run game
		ScreenPanel panel = new ScreenPanel();
		Container contentPane = getContentPane();
		contentPane.add(panel, BorderLayout.CENTER);
		addKeyListener(controller.getSnakeKeyHandle());
		;
		// set up frame
		this.setVisible(true);// making the frame visible
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// close program
	}

	private class ScreenPanel extends JPanel {

		public ScreenPanel() {

		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			controller.paintSnake(g);
		}

	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(controller.getSpeed());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			controller.startSnake();
			repaint();
		}
	}

}
