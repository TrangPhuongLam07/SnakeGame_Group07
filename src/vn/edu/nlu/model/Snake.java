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

public class Snake {
	private boolean running;
	private int bodySnake;
	private static int screenWidth;
	private static int screenHeight;
	private static int unit_size;
	private static int GAME_UNIT;
	private int[] x;
	private int[] y;
	private int speed;

	private char direction = 'L';

	private ImageIcon iconHeadUp, iconHeadDown, iconHeadLeft, iconHeadRight, iconBody, iconHead;
	private ImageIcon iconTailUp, iconTailDown, iconTailLeft, iconTailRight, iconTail;

	private List<EatingBehavior> listEatingBehavior;
	private List<CollisionBehavior> lisCollisionBehaviors;
	public Snake(int width, int height) {
		running = true;
		speed = 0;
		bodySnake = 3;
		speed = 500;
		screenWidth = width;
		screenHeight = height;
		
		

		// Image snake
		ImageFactory manageImage = new ImageFactory();
		iconHeadUp = manageImage.createImageSnake("headUp");
		iconHeadDown = manageImage.createImageSnake("headDown");
		iconHeadLeft = manageImage.createImageSnake("headLeft");
		iconHeadRight = manageImage.createImageSnake("headRight");
		iconBody = manageImage.createImageSnake("body");

		// head when start
		iconHead = iconHeadLeft;

		iconTailUp = manageImage.createImageSnake("tailUp");
		iconTailDown = manageImage.createImageSnake("tailDown");
		iconTailLeft = manageImage.createImageSnake("tailLeft");
		iconTailRight = manageImage.createImageSnake("tailRight");

		// tail when start
		iconTail = iconTailRight;

		unit_size = iconHeadUp.getIconWidth();
		GAME_UNIT = (screenWidth * screenHeight) / (unit_size * unit_size);// the number of cells in game
		x = new int[GAME_UNIT];
		y = new int[GAME_UNIT];
		
		snakePositionInitial();
	}

	public static int getScreenWidth() {
		return screenWidth;
	}

	public static int getScreenHeight() {
		return screenHeight;
	}

	public static int getUnit_size() {
		return unit_size;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
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
		// TODO Auto-generated method stub

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

	public boolean isRunning() {
		return running;
	}

	public void setRunning(boolean running) {
		this.running = running;
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
	}

	public int[] getX() {
		return x;
	}

	public int[] getY() {
		return y;
	}

	public void eatingFood(List<EatingBehavior> list) {
		listEatingBehavior= list;
		for (EatingBehavior eatingBehavior : listEatingBehavior) {
			eatingBehavior.eating(this);
		}
	}

	public class KeyHandler implements KeyListener {

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

}
