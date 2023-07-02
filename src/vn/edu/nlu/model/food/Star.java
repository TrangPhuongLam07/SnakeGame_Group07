package vn.edu.nlu.model.food;

import java.awt.Graphics;

import vn.edu.nlu.model.ImageFactory;
import vn.edu.nlu.model.Snake;

public class Star extends Food {
	private long starVisibleStartTime = 0;
	private long starVisibleDuration = 5000; // 5 giây
	private long starNextAppearanceTime = 0;
	private long starAppearanceInterval = 30000; // 30 giây

	public Star(int screenWidth, int screenHeight, int unit_size) {
		super(screenWidth, screenHeight, unit_size);
		// TODO Auto-generated constructor stub
	}
	public Snake eating(Snake snake) {
		if ((snake.getX()[0] == xFood) && (snake.getY()[0] == yFood)) {
			snake.setBodySnake(snake.getBodySnake() + 1); 			
			snake.setStars(snake.getStars()+1);
//			OnVolume.getInstance().sound("..\\SnakeGame_team07\\src\\data\\eatApple.wav"); // Phát âm thanh khi ăn
			// ngôi sao
			starVisibleStartTime = System.currentTimeMillis(); // Cập nhật thời gian bắt đầu hiển thị ngôi sao
			starNextAppearanceTime = starVisibleStartTime + starAppearanceInterval; 
// Cập nhật thời gian xuất hiện ngôi sao tiếp theo
			clearFood();
		} else {
			if (!isStarVisible()) {
				if (isStarAvailable()) {
					randomFood();
					starVisibleStartTime = System.currentTimeMillis(); // Cập nhật thời gian bắt đầu hiển thị ngôi sao
					starNextAppearanceTime = starVisibleStartTime + starAppearanceInterval; // Cập nhật thời gian xuất hiện ngôi sao tiếp theo
				} else {
					clearFood();
				}
			}
		}
		return snake;
	}

	public boolean isStarVisible() {
		long currentTime = System.currentTimeMillis();
		return currentTime < starVisibleStartTime + starVisibleDuration;
	}

	public boolean isStarAvailable() {
		long currentTime = System.currentTimeMillis();
		return currentTime >= starNextAppearanceTime;
	}
	@Override
	public void paintFood(Graphics g) {
		// TODO Auto-generated method stub
		iconHeadUp = ImageFactory.createImageFood("star");
		g.drawImage(iconHeadUp.getImage(), xFood, yFood, unit_size, unit_size, null);
	}
}


				
