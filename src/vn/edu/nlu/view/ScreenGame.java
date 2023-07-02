package vn.edu.nlu.view;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import vn.edu.nlu.gameState.GameState;
import vn.edu.nlu.controller.*;
import vn.edu.nlu.gameState.*;
import vn.edu.nlu.model.*;

public class ScreenGame extends JFrame implements Runnable {
	public int width;
	public int height;
	private JPanel screenGame;
	private ControllerSnake controller;
	private GameState state = PauseGame.getInstance();
	protected ScreenGameController screenGameController;
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public JPanel getScreenGame() {
		return screenGame;
	}

	public void setScreenGame(JPanel screenGame) {
		this.screenGame = screenGame;
	}

	public ControllerSnake getController() {
		return controller;
	}

	public void setController(ControllerSnake controller) {
		this.controller = controller;
	}

	public GameState getState() {
		return state;
	}

	public void setState(GameState state) {
		this.state = state;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	public class ScreenGameKeyPress implements KeyListener{
		public ScreenGameKeyPress(KeyEvent e) {
			// TODO Auto-generated constructor stub
			keyPressed(e);
			keyTyped(e);
			keyReleased(e);
		}
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
			screenGameController.snakeKeyPress(e);
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			if (e.getKeyCode() == KeyEvent.VK_SPACE) {
				
				if (state.equals(StartGame.getInstance())) {
					state = PauseGame.getInstance();
				}else 
					 if (state.equals(PauseGame.getInstance())) {
					state = StartGame.getInstance();
				}
			}
			screenGameController.snakeKeyPress(e);
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}