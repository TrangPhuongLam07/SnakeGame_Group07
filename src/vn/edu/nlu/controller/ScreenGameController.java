package vn.edu.nlu.controller;
import java.awt.*;
import java.awt.event.*;

import javax.swing.ImageIcon;
import vn.edu.nlu.model.Snake;
import vn.edu.nlu.view.ScreenGame;
import vn.edu.nlu.view.panel.PanelReplayGame;
public class ScreenGameController {
	static ScreenGame screenGame;
	public static Snake snake;
	public ScreenGameController(ScreenGame screenGame) {
		super();
		this.screenGame = screenGame;
		
		snake = new Snake(screenGame.width, screenGame.height);
	}
	
	public ScreenGameController() {
		this(screenGame);
	}
	
	
//	public void paintMap(Graphics g, String playerDecoratorName, String paintMapName) {
//		playerChose.setPlayerDecoratorName(playerDecoratorName);
//		paintMapObserver.chosePaintMap(g, paintMapName);
//	}


	public void startSnake() {
		if(snake.running) {
			snake.moving();
			snake.eatingFood();
			snake.collisionEnemy();
		snake.returnSnake();
		}
	}
	
	public PanelReplayGame replayGame() {
		PanelReplayGame panelReplayGame = new PanelReplayGame();
		screenGame.add(panelReplayGame);
		return panelReplayGame;
	}
	
	public int speedSnake() {
		return snake.getSpeed();
	}
	
	public void snakeKeyPress(KeyEvent e) {
		Snake.KeyHandler handlerKeyPress = snake.new KeyHandler(e);
		System.out.println("snake key press");
	}
	
	public int getScreenWidth() {
		return screenGame.width;
	}
	
	public int getScreenHeight() {
		return screenGame.height;
	}

	public static Snake getSnake() {
		return snake;
	}
}
