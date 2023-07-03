package vn.edu.nlu.view;

import java.awt.BorderLayout;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.swing.*;

//import abstractSnakeGame.ScreenGame;
//import controller.NavigationController;
//import interfaceSnakeGame.VolumeState;
import vn.edu.nlu.controller.ControllerSnake;
import vn.edu.nlu.view.panel.PanelNavbar;

public class GameFrame extends JFrame implements Runnable {
	private int width;
	private int height;
	private JPanel screenGame;
	private PanelNavbar navbar;
	private ControllerSnake controller;
	private boolean running = true;

	public GameFrame(ControllerSnake control) {
		// set width, height
		width = control.getWidth();
		height = control.getHeight();

		setTitle("Game Snake");
		setSize(width, height);// 400 width and 500 height
		setLayout(new BorderLayout());// using no layout managers

		Container contentPane = getContentPane();
		controller = control;

		// panel run game
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		screenGame = controller.getScreenGame();
		navbar = controller.getNavbar();
		// add panels
		panel.add(navbar, BorderLayout.NORTH);
		panel.add(screenGame, BorderLayout.CENTER);

		contentPane.add(panel);

		// register listener
		addKeyListener(controller.getSnakeKeyHandle());
		addKeyListener(new KeyHandle());
		navbar.getLbBack().addMouseListener(new MouseHandle());
		// set up frame
		pack();
		setResizable(false);
		setLocationRelativeTo(null);// frame center screen
		setVisible(true);// making the frame visible
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// close program
//		run();
		new Thread(this).start();
	}

	private class KeyHandle implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			if (e.getKeyCode() == KeyEvent.VK_SPACE) {
				controller.setState(!controller.getRunning());
				System.out.println(controller.getRunning());
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub

		}

	}
	
	class MouseHandle implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource().equals(navbar.getLbBack())) {
				returnButton();
			}
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public void returnButton() {
		this.dispose();
		Stop();
		new MenuFrame();
	}
	
public void Stop() {
	this.running = false;
}
	@Override
	public void run() {
		boolean running = true;
		while (this.running) {
			System.out.println("");
			running = controller.getRunning();
			if (running) {
				controller.startSnake();
				repaint();

			}
		}
	}

}
