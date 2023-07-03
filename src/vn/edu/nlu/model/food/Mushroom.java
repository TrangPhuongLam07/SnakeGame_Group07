package vn.edu.nlu.model.food;

import java.awt.Graphics;
import vn.edu.nlu.model.ImageFactory;
import vn.edu.nlu.model.Snake;

public class Mushroom extends Food {
	public Mushroom(int screenWidth, int screenHeight, int unit_size) {
		super(screenWidth, screenHeight, unit_size);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Snake eating(Snake snake) {
		if (snake.getBodySnake() < 2) {

			snake.setRunning(false);
			System.out.println("Game Over!");
//System.out.println("Apple eating: " + appleEating);
//System.out.println("Mushroom eating: " + mushroomEating);

		} else if ((snake.getX()[0] == xFood) && (snake.getY()[0] == yFood)) {
			snake.setBodySnake(snake.getBodySnake() - 1);
//			mushroomEating++;
//			appleEating--;
//			running = false;
//			System.out.println("Game Over!");
//			System.out.println("Apple eating: " + appleEating);
//			System.out.println("Mushroom eating: " + mushroomEating);
		}else 
			if((snake.getX()[0] == xFood) && (snake.getY()[0] == yFood)) {
			snake.setBodySnake(snake.getBodySnake()-1);
			snake.setMushrooms(snake.getMushrooms()+1);
			randomFood();
//			OnVolume.getInstance().sound("..\\Snake_Game_ver2-master\\src\\data\\eatMushroom.wav");
		}
		return null;
	}

	@Override
	public void paintFood(Graphics g) {
		iconHeadUp = ImageFactory.createImageFood("mushroom");
		g.drawImage(iconHeadUp.getImage(), xFood, yFood, unit_size, unit_size, null);
	}
}
