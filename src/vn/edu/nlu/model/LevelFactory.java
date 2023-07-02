package vn.edu.nlu.model;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import vn.edu.nlu.controller.*;
import vn.edu.nlu.model.enemy.*;
import vn.edu.nlu.model.food.*;
import vn.edu.nlu.model.level.*;

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
		//food
		control.getListEatingBehaviors().add(new Apple(control.getWidth(), control.getHeight(), control.getUnit()));
		control.getListEatingBehaviors().add(new Mushroom(control.getWidth(), control.getHeight(), control.getUnit()));
		control.getListEatingBehaviors().add(new Lightning(control.getWidth(), control.getHeight(), control.getUnit()));
		control.getListEatingBehaviors().add(new Star(control.getWidth(), control.getHeight(), control.getUnit()));
		//enemy
		control.getListCollisionBehaviors().add(new Swamp(control.getWidth(), control.getHeight(), control.getUnit()));
		control.getListCollisionBehaviors().add(new Wall(control.getWidth(), control.getHeight(), control.getUnit()));
	}

	private void levelHard() {
		//food
		control.getListEatingBehaviors().add(new Apple(control.getWidth(), control.getHeight(), control.getUnit()));
		control.getListEatingBehaviors().add(new Mushroom(control.getWidth(), control.getHeight(), control.getUnit()));
		control.getListEatingBehaviors().add(new Lightning(control.getWidth(), control.getHeight(), control.getUnit()));
		control.getListEatingBehaviors().add(new Star(control.getWidth(), control.getHeight(), control.getUnit()));
		//enemy
		control.getListCollisionBehaviors().add(new Swamp(control.getWidth(), control.getHeight(), control.getUnit()));
		control.getListCollisionBehaviors().add(new Wall(control.getWidth(), control.getHeight(), control.getUnit()));
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
			new Thread(control.getSnake()).start();
			break;
		}
		case 2: {
			new Thread(control.getSnake()).start();
			reduceSpeed();
			break;
		}
		case 3: {
			new Thread(control.getSnake()).start();
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
		System.out.println("paint Level");
	}

}

