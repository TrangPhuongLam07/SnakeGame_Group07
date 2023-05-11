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
	private int width;
	private int height;
	private JPanel screenGame;
	private ControllerSnake controller;
	public GameFrame(ControllerSnake control) {
		setTitle("Game Snake");
		setSize(width, height);// 400 width and 500 height
		setLayout(new BorderLayout());// using no layout managers
		
		// panel run game
		Container contentPane = getContentPane();
		controller = control;
		//set width, height
		width = control.getWidth();
		height = control.getHeight();
		
		screenGame = controller.getScreenGame();
		contentPane.add(screenGame, BorderLayout.CENTER);
		addKeyListener(controller.getSnakeKeyHandle());
		

		
		// set up frame
		pack();
		this.setVisible(true);// making the frame visible
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// close program
	}



	@Override
	public void run() {
		while (true) {
			controller.startSnake();
			repaint();
			
			
		}
	}

}
