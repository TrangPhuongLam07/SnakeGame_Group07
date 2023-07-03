package vn.edu.nlu.model.enemy;

import java.util.Random;

import javax.swing.ImageIcon;

public abstract class Enemy implements CollisionBehavior {
	protected int xEnemy, yEnemy, screenWidth, screenHeight, unit_size;
	protected Random random;
	protected ImageIcon iconHeadUp;

	public Enemy(int screenWidth, int screenHeight, int unit_size) {
		this.screenWidth = screenWidth;
		this.screenHeight = screenHeight;
		this.unit_size = unit_size;

		random = new Random();
		randomEnemy();
	}

	public void randomEnemy() {
		int sumOfSquareWidth = screenWidth / unit_size;
		int sumOfSquareHeight = screenHeight / unit_size;
		xEnemy = random.nextInt((int) (sumOfSquareWidth)) * unit_size;
		yEnemy = random.nextInt((int) (sumOfSquareHeight)) * unit_size;
	}

	public void clearFood() {
		xEnemy = -200;
		yEnemy = -200;
	}
}
