package vn.edu.nlu.controller;

import java.awt.Graphics;
import java.awt.event.KeyListener;

import vn.edu.nlu.model.Snake;
import vn.edu.nlu.model.Snake.KeyHandler;

public class ControllerSnake {
	private Snake snake;
	
	public ControllerSnake (int width, int height) {
		snake = new Snake(width, height);
	}

	public void paintSnake(Graphics g) {
		// TODO Auto-generated method stub
		snake.paintSnake(g);
	}

	public KeyListener getSnakeKeyHandle() {
		// TODO Auto-generated method stub
		
		return snake.new KeyHandler();
	}

	public long getSpeed() {
		// TODO Auto-generated method stub
		return snake.getSpeed();
	}

	public void startSnake() {
		snake.moving();
		snake.returnSnake();
	}

}
