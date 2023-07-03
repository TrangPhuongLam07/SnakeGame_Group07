package vn.edu.nlu.model.enemy;

import java.awt.Graphics;

import vn.edu.nlu.model.ImageFactory;
import vn.edu.nlu.model.Snake;

public class Swamp extends Enemy {
	private boolean isSlowedDown;
	private long slowDownStartTime;
	private int numDecrease;

	public Swamp(int screenWidth, int screenHeight, int unit_size) {
		super(screenWidth, screenHeight, unit_size);
		this.numDecrease = 100;
	}

	@Override
	public Snake collision(Snake snake) {
		//decrease speed
		if ((snake.getX()[0] == xEnemy) && (snake.getY()[0] == yEnemy)) {
			if (isSlowedDown==false) {
				isSlowedDown = true;
				slowDownStartTime = System.currentTimeMillis();
				snake.setSpeed(snake.getSpeed() + numDecrease);
			}
			randomEnemy();
		}
		
		//return speed original after 5s
		if (isSlowedDown && System.currentTimeMillis() - slowDownStartTime >= 5000) {
			isSlowedDown = false;
			snake.setSpeed(snake.getSpeed() - numDecrease);
		}
		return snake;
	}

	@Override
	public void paintEnemy(Graphics g) {
		// TODO Auto-generated method stub
		iconHeadUp = ImageFactory.createImageEnemy("swamp");

		g.drawImage(iconHeadUp.getImage(), xEnemy, yEnemy, unit_size, unit_size, null);
	}

}
