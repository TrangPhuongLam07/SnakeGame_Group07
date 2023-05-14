package vn.edu.nlu.view;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//import abstractSnakeGame.ScreenGame;
//import controller.NavigationController;
//import interfaceSnakeGame.VolumeState;
import vn.edu.nlu.controller.ControllerSnake;
import vn.edu.nlu.model.ScoreData;
import vn.edu.nlu.model.Snake;
import vn.edu.nlu.model.Snake.KeyHandler;
import vn.edu.nlu.model.Subject;
//import volumeState.OnVolume;

public class GameFrame extends JFrame implements Runnable {
	private int width;
	private int height;
	private JPanel screenGame, navbar;
	private ControllerSnake controller;

	public GameFrame(ControllerSnake control) {
		setTitle("Game Snake");
		setSize(width, height);// 400 width and 500 height
		setLayout(new BorderLayout());// using no layout managers

		// panel run game
		Container contentPane = getContentPane();
		controller = control;
		// set width, height
		width = control.getWidth();
		height = control.getHeight();

		screenGame = controller.getScreenGame();
		navbar = controller.getNavbar();
		
		Subject sub = new ScoreData();
		PanelNavbar pnNavbar = new PanelNavbar(sub, width, height);
		contentPane.add(navbar, BorderLayout.NORTH);
		contentPane.add(screenGame, BorderLayout.CENTER);
		addKeyListener(controller.getSnakeKeyHandle());

		// set up frame
		pack();
		this.setVisible(true);// making the frame visible
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// close program
	}

	private class PanelNavbarf extends JPanel {
		private JLabel labelAppleScore, labelMaxAppleScore, labelEnergyScore, labelMushroomScore, labelSwampScore;
		private JButton btVolume;
		public int heightNavigation = 0;
		private int appleScore = 0, energyScore = 0, mushroomScore = 0, swampScore = 0, highScore = 0;
		private Thread thread;
//		private ScreenGame screenGame;
		private static int width = 0, height = 0;

//		private VolumeState volumeState = OnVolume.getInstance();

	}

	@Override
	public void run() {
		while (true) {
			controller.startSnake();
			repaint();

		}
	}

}
