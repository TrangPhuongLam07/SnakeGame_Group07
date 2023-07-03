package vn.edu.nlu.model;

import java.awt.Color;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import javax.swing.ImageIcon;

import vn.edu.nlu.model.enemy.CollisionBehavior;
import vn.edu.nlu.model.food.EatingBehavior;

public class Snake implements Runnable {
	public boolean running;
	private int bodySnake;
	private int screenWidth;
	private int screenHeight;
	private int unit_size;
	private int GAME_UNIT;
	private int[] x;
	private int[] y;
	private int speed;

	private char direction = 'L';

	private ImageIcon iconHeadUp, iconHeadDown, iconHeadLeft, iconHeadRight, iconBody, iconHead;
	private ImageIcon iconTailUp, iconTailDown, iconTailLeft, iconTailRight, iconTail;

	private List<EatingBehavior> listEatingBehavior;
	private List<CollisionBehavior> lisCollisionBehaviors;
	
	private int apples, mushrooms, stars;

	public Snake(int width, int height) {
		running = false;
		speed = 0;
		bodySnake = 4;
		speed = 400;
		screenWidth = width;
		screenHeight = height;
		
		apples = 0;
		mushrooms = 0;
		stars = 0;
		
		// Image snake
		iconHeadUp = ImageFactory.createImageSnake("headUp");
		iconHeadDown = ImageFactory.createImageSnake("headDown");
		iconHeadLeft = ImageFactory.createImageSnake("headLeft");
		iconHeadRight = ImageFactory.createImageSnake("headRight");
		iconBody = ImageFactory.createImageSnake("body");

		// head when start
		iconHead = iconHeadLeft;

		iconTailUp = ImageFactory.createImageSnake("tailUp");
		iconTailDown = ImageFactory.createImageSnake("tailDown");
		iconTailLeft = ImageFactory.createImageSnake("tailLeft");
		iconTailRight = ImageFactory.createImageSnake("tailRight");

		// tail when start
		iconTail = iconTailRight;

		unit_size = iconHeadUp.getIconWidth();
		GAME_UNIT = (screenWidth * screenHeight) / (unit_size * unit_size);// the number of cells in game
		x = new int[GAME_UNIT];
		y = new int[GAME_UNIT];

		snakePositionInitial();
	}
	

	public int getApples() {
		return apples;
	}


	public void setApples(int apples) {
		this.apples = apples;
	}


	public int getMushrooms() {
		return mushrooms;
	}


	public void setMushrooms(int mushrooms) {
		this.mushrooms = mushrooms;
	}


	public int getStars() {
		return stars;
	}


	public void setStars(int stars) {
		this.stars = stars;
	}


	public int getScreenWidth() {
		return screenWidth;
	}

	public int getScreenHeight() {
		return screenHeight;
	}

	public int getUnit_size() {
		return unit_size;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setScreenWidth(int screenWidth) {
		this.screenWidth = screenWidth;
	}

	public void setScreenHeight(int screenHeight) {
		this.screenHeight = screenHeight;
	}

	public void setLisCollisionBehaviors(List<CollisionBehavior> lisCollisionBehaviors) {
		this.lisCollisionBehaviors = lisCollisionBehaviors;
	}

	public boolean isRunning() {
		return running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}

	public void setX(int[] x) {
		this.x = x;
	}

	public void setY(int[] y) {
		this.y = y;
	}

	public int getSpeed() {
		return this.speed;
	}

	public void setListEatingBehavior(List<EatingBehavior> listEatingBehavior) {
		this.listEatingBehavior = listEatingBehavior;
	}

	public int getBodySnake() {
		return bodySnake;
	}

	public void setBodySnake(int bodySnake) {
		this.bodySnake = bodySnake;
		moving();
	}

	public int[] getX() {
		return x;
	}

	public int[] getY() {
		return y;
	}

	public void snakePositionInitial() {
		int sumOfSquare = (screenWidth / unit_size) / 2;
		Random random = new Random();
		int rNum = random.nextInt(sumOfSquare);
		for (int i = 0; i < bodySnake; i++) {
			x[i] = rNum * unit_size + (i * unit_size);
			y[i] = rNum * unit_size;
		}
//		System.out.println(Arrays.toString(x));
//		System.out.println(Arrays.toString(y));
	}

	public void moving() {
		// moving body
		for (int i = bodySnake - 1; i > 0; i--) {
			x[i] = x[i - 1];
			y[i] = y[i - 1];
//			System.out.println(i + ":  " + x[i] + " - " + y[i]);
		}
		// moving head
		switch (direction) {
		case 'U':
			y[0] = y[0] - unit_size;
			iconHead = iconHeadUp;
			break;
		case 'D':
			y[0] = y[0] + unit_size;
			iconHead = iconHeadDown;
			break;
		case 'L':
			x[0] = x[0] - unit_size;
			iconHead = iconHeadLeft;
			break;
		case 'R':
			x[0] = x[0] + unit_size;
			iconHead = iconHeadRight;
			break;
		}

		// moving tail
		int indexTail = bodySnake - 1;
		int nextIndextTail = bodySnake - 2;
		// x[bodySnake - 2] == x[bodySnake - 1] => up or down, compare y
		if (x[nextIndextTail] == x[indexTail]) {
			if (y[nextIndextTail] < y[indexTail]
					& (y[nextIndextTail] > unit_size & y[nextIndextTail] < this.screenHeight - unit_size)) {
				iconTail = iconTailDown;
				return;
			}

			if (y[nextIndextTail] > y[indexTail]
					& (y[nextIndextTail] > unit_size & y[nextIndextTail] < this.screenHeight - unit_size)) {
				iconTail = iconTailUp;
				return;
			}
			// x[bodySnake - 2] != x[bodySnake - 1] => left or right, compare x
		} else {
			if (x[nextIndextTail] < x[indexTail]
					& (x[nextIndextTail] > unit_size & x[nextIndextTail] < this.screenWidth - unit_size)) {
				iconTail = iconTailRight;
				return;
			}

			if (x[nextIndextTail] > x[indexTail]
					& (x[nextIndextTail] > unit_size & x[nextIndextTail] < this.screenWidth - unit_size)) {
				iconTail = iconTailLeft;
				return;
			}
		}

	}

	public void paintSnake(Graphics g) {
		for (int i = 0; i < bodySnake; i++) {
			if (i == 0) {
				g.drawImage(iconHead.getImage(), x[i], y[i], unit_size, unit_size, null);
			} else if (i != 0 && i != bodySnake - 1) {
				g.drawImage(iconBody.getImage(), x[i], y[i], unit_size, unit_size, null);
			} else {
				g.drawImage(iconTail.getImage(), x[i], y[i], unit_size, unit_size, null);
			}

		}
	}

	public void returnSnake() {
		for (int i = 0; i < bodySnake; i++) {
			if (x[i] == screenWidth) {
				x[i] = 0;
			}
		}

		for (int i = 0; i < bodySnake; i++) {
			if (x[i] == (0 - unit_size)) {
				x[i] = screenWidth - unit_size;
			}
		}

		for (int i = 0; i < bodySnake; i++) {
			if (y[i] == screenHeight) {
				y[i] = 0;
			}
		}

		for (int i = 0; i < bodySnake; i++) {
			if (y[i] == (0 - unit_size)) {
				y[i] = screenWidth - unit_size;
			}
		}
	}

	public void eatingFood() {
		for (EatingBehavior eatingBehavior : listEatingBehavior) {
			eatingBehavior.eating(this);
			
		}
	}

	public void collisionEnemy() {
		for (CollisionBehavior e : lisCollisionBehaviors) {
			e.collision(this);
		}
	}

	public class KeyHandler implements KeyListener {
		public KeyHandler(KeyEvent e) {
			keyPressed(e);
			keyTyped(e);
			keyReleased(e);
		}
		
		public KeyHandler() {
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyPressed(KeyEvent e) {
			switch (e.getKeyCode()) {
			case KeyEvent.VK_LEFT:
				if (direction != 'R') {
					direction = 'L';
					

				}
				break;
			case KeyEvent.VK_RIGHT:
				if (direction != 'L') {
					direction = 'R';
				}
				break;
			case KeyEvent.VK_UP:
				if (direction != 'D') {
					direction = 'U';
				}
				break;
			case KeyEvent.VK_DOWN:
				if (direction != 'U') {
					direction = 'D';
				}
				break;

			default:
				break;
			}

		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub

		}

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(speed);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		moving();
		returnSnake();
		eatingFood();
		collisionEnemy();
		System.out.println(speed);
	}

}