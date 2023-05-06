package vn.edu.nlu.model.food;

import java.awt.Graphics;

import vn.edu.nlu.model.ImageFactory;
import vn.edu.nlu.model.Snake;

public class Lightning extends Food{

	public Lightning(int screenWidth, int screenHeight, int unit_size) {
		super(screenWidth, screenHeight, unit_size);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Snake eating(Snake snake) {
		if((snake.getX()[0] == xFood) && (snake.getY()[0] == yFood)) {
			if (snake.getSpeed() > 100) {
				snake.setSpeed(snake.getSpeed()-25);
			}
//			energyEating++;
			randomFood();
//			OnVolume.getInstance().sound("..\\Snake_Game_ver2-master\\src\\data\\beep-3.wav");
		}
		return snake;
	}

	@Override
	public void paintFood(Graphics g) {
		ImageFactory manageImage = new ImageFactory();
		iconHeadUp = manageImage.createImageFood("energy");
		g.drawImage(iconHeadUp.getImage(), xFood, yFood, unit_size, unit_size, null);
		
	}


}