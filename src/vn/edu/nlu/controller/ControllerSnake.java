package vn.edu.nlu.controller;

import java.awt.Graphics;

import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

import vn.edu.nlu.model.Snake;
import vn.edu.nlu.model.Snake.KeyHandler;
import vn.edu.nlu.model.food.Apple;
import vn.edu.nlu.model.food.EatingBehavior;
import vn.edu.nlu.model.food.Lightning;
import vn.edu.nlu.model.food.Mushroom;

public class ControllerSnake {
	private Snake snake;
	private List<EatingBehavior> listEatingBehaviors;
	
	public ControllerSnake (int width, int height) {
		snake = new Snake(width, height);
		
		levelEasy();
	}

	public void paintGame(Graphics g) {
		//paint snake
		snake.paintSnake(g);
		
		//paint food
		for (EatingBehavior eatingBehavior : listEatingBehaviors) {
			eatingBehavior.paintFood(g);
		}
		
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
		
		snake.eatingFood(listEatingBehaviors);
	}
	
	public List<EatingBehavior> levelEasy() {
		listEatingBehaviors = new ArrayList<EatingBehavior>();
		listEatingBehaviors.add(new Apple(snake.getScreenWidth(), snake.getScreenHeight(), snake.getUnit_size()));
		listEatingBehaviors.add(new Lightning(snake.getScreenWidth(), snake.getScreenHeight(), snake.getUnit_size()));
		listEatingBehaviors.add(new Mushroom(snake.getScreenWidth(), snake.getScreenHeight(), snake.getUnit_size()));
		return listEatingBehaviors;
	}

}
