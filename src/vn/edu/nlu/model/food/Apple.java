package vn.edu.nlu.model.food;

import java.awt.Graphics;

import vn.edu.nlu.model.ImageFactory;
import vn.edu.nlu.model.Snake;

public class Apple extends Food{
	

	public Apple(int screenWidth, int screenHeight, int unit_size) {
		super(screenWidth, screenHeight, unit_size);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Snake eating(Snake snake) {
		if((snake.getX()[0] == xFood) && (snake.getY()[0] == yFood)) {
			snake.setBodySnake(snake.getBodySnake()+1);;
//			appleEating++;
			randomFood();
//			OnVolume.getInstance().sound("..\\Snake_Game_ver2-master\\src\\data\\eatApple.wav");
		}
		return snake;
	}

	@Override
	public void paintFood(Graphics g) {
		ImageFactory manageImage = new ImageFactory();
		iconHeadUp = manageImage.createImageFood("tao");
		g.drawImage(iconHeadUp.getImage(), xFood, yFood, unit_size, unit_size, null);
	}

}
