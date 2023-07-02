package vn.edu.nlu.view;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import vn.edu.nlu.controller.*;
import vn.edu.nlu.gameState.*;
import vn.edu.nlu.model.*;

public class ScreenGame extends JFrame implements Runnable {
	public int width;
	public int height;
	private JPanel screenGame;
	private ControllerSnake controller;
	private GameState state = PauseGame.getInstance();
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

}