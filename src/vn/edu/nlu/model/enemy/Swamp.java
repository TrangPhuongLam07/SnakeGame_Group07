package vn.edu.nlu.model.enemy;

import java.awt.Graphics;

import vn.edu.nlu.model.ImageFactory;
import vn.edu.nlu.model.Snake;
public class Swamp extends Enemy{

	public Swamp(int screenWidth, int screenHeight, int unit_size) {
		super(screenWidth, screenHeight, unit_size);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Snake collision(Snake snake) {
		// TODO Auto-generated method stub
		if((snake.getX()[0] == xEnemy) && (snake.getY()[0] == yEnemy)) {
//			if (speed > -100) {
//				speed -= 50;			
//			swampEating++;
//			swamp.randomBarrier();
	//		OnVolume.getInstance().sound("..\\SnakeGame_Group07\\src\\data\\eatMushroom.wav");
		}
		return snake;}
	

	@Override
	public void paintEnemy(Graphics g) {
		// TODO Auto-generated method stub
		iconHeadUp = ImageFactory.createImageFood("swamp");
		g.drawImage(iconHeadUp.getImage(), xEnemy, yEnemy, unit_size, unit_size, null);
	}

}
