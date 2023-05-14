package vn.edu.nlu.model;

import java.awt.Graphics;
import java.util.List;

import javax.swing.ImageIcon;

import vn.edu.nlu.controller.ControllerSnake;
import vn.edu.nlu.model.enemy.CollisionBehavior;
import vn.edu.nlu.model.enemy.Swamp;
import vn.edu.nlu.model.enemy.Wall;
import vn.edu.nlu.model.food.Apple;
import vn.edu.nlu.model.food.EatingBehavior;
import vn.edu.nlu.model.food.Lightning;
import vn.edu.nlu.model.food.Mushroom;
import vn.edu.nlu.model.food.Star;
import vn.edu.nlu.view.level.Level;
import vn.edu.nlu.view.level.LevelEasy;
import vn.edu.nlu.view.level.LevelHard;
import vn.edu.nlu.view.level.LevelNormal;

public class LevelFactory {
	private ControllerSnake control;
	private int waitingCurrent;
	private int waitingTime;

	public LevelFactory(ControllerSnake control) {
		waitingTime = 20000;
		waitingCurrent = 0;
		this.control = control;
		createCharacterLevel(control.getLevel());

		// update control
		this.control = control;
	}

	public Level createLevel(int level) {

		switch (level) {
		case 1: {
			return new LevelEasy(control);
		}
		case 2: {
			return new LevelNormal(control);
		}
		case 3: {
			return new LevelHard(control);
		}

		default:
			return new LevelEasy(control);
		}

	}


	// character--------------------

	private void levelEasy() {
		// food
		control.getListEatingBehaviors().add(new Apple(control.getWidth(), control.getHeight(), control.getUnit()));
		control.getListEatingBehaviors().add(new Mushroom(control.getWidth(), control.getHeight(), control.getUnit()));
	}

	private void levelNormal() {
		// food
		control.getListEatingBehaviors().add(new Apple(control.getWidth(), control.getHeight(), control.getUnit()));
		control.getListEatingBehaviors().add(new Mushroom(control.getWidth(), control.getHeight(), control.getUnit()));
		control.getListEatingBehaviors().add(new Lightning(control.getWidth(), control.getHeight(), control.getUnit()));

		// enemy
		control.getListCollisionBehaviors().add(new Swamp(control.getWidth(), control.getHeight(), control.getUnit()));
		//random letter wall
		control.getListCollisionBehaviors().add(new Wall(control.getWidth(), control.getHeight(), control.getUnit()));
		
		// speed giam theo thoi gian
	}

	private void levelHard() {
		// food
		control.getListEatingBehaviors().add(new Apple(control.getWidth(), control.getHeight(), control.getUnit()));
		control.getListEatingBehaviors().add(new Mushroom(control.getWidth(), control.getHeight(), control.getUnit()));
		control.getListEatingBehaviors().add(new Lightning(control.getWidth(), control.getHeight(), control.getUnit()));
		control.getListEatingBehaviors().add(new Star(control.getWidth(), control.getHeight(), control.getUnit()));
		// enemy
		control.getListCollisionBehaviors().add(new Swamp(control.getWidth(), control.getHeight(), control.getUnit()));
		//box wall
		control.getListCollisionBehaviors().add(new Wall(control.getWidth(), control.getHeight(), control.getUnit()));
		
		// speed giam theo thoi gian

	}

	public void createCharacterLevel(int level) {
		switch (level) {
		case 1: {
			levelEasy();
			break;
		}
		case 2: {
			levelNormal();
			break;
		}
		case 3: {
			levelHard();
			break;
		}
		default:
			levelEasy();
			break;
		}
	}

	// effect---------------------------
	private void reduceSpeed() {
		if (waitingCurrent >= waitingTime) {
			control.setSnakeSpeed(control.getSpeed() + 25);
			waitingCurrent = 0;

		} else {
			waitingCurrent += control.getSpeed();
		}
	}

	public void createEffect(int level) {
		switch (level) {
		case 1: {
			control.getSnake().run();
			break;
		}
		case 2: {
			control.getSnake().run();
			reduceSpeed();
			break;
		}
		case 3: {
			control.getSnake().run();
			reduceSpeed();
			break;
		}
		default:
			control.getSnake().run();
			break;
		}
	}

	// paint-------------------------
	public void paintLevel(Graphics g) {
		// paint background
		ImageIcon image = ImageFactory.createImageBackground(control.getLevel());
		g.drawImage(image.getImage(), 0, 0, control.getWidth(), control.getHeight(), null);

		// paint snake
		control.getSnake().paintSnake(g);

		// paint food
		for (EatingBehavior e : control.getListEatingBehaviors()) {
			e.paintFood(g);
		}

		// paint enemy
		for (CollisionBehavior e : control.getListCollisionBehaviors()) {
			e.paintEnemy(g);
		}

	}

}
