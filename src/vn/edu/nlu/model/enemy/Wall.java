package vn.edu.nlu.model.enemy;

import java.awt.Graphics;


import vn.edu.nlu.model.ImageFactory;
import vn.edu.nlu.model.Snake;

public class Wall extends Enemy{

	public Wall(int screenWidth, int screenHeight, int unit_size) {
		super(screenWidth, screenHeight, unit_size);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Snake collision(Snake snake) {
		if((snake.getX()[0] == xEnemy) && (snake.getY()[0] == yEnemy)) {
			snake.setRunning(false);
			
		}
		return null;
	}

	@Override
	public void paintEnemy(Graphics g) {
		// TODO Auto-generated method stub
		iconHeadUp = ImageFactory.createImageFood("wall");
		g.drawImage(iconHeadUp.getImage(), xEnemy, yEnemy, unit_size, unit_size, null);

	}

}
