package vn.edu.nlu.model.enemy;
import java.awt.Graphics;
import vn.edu.nlu.model.Snake;
public class BodyCollision extends Enemy {
	public BodyCollision(int screenWidth, int screenHeight, int unit_size) {
		super(screenWidth, screenHeight, unit_size);
	}
	@Override
	public Snake collision(Snake snake) {
		for (int i = snake.getBodySnake() - 1; i > 0; i--) {
			if ((snake.getX()[0] == xEnemy) && (snake.getY()[0] == yEnemy)) {
				// Head snake appear
				snake.getX()[0] = snake.getX()[1];
				snake.getY()[0] = snake.getY()[1];
				snake.getX()[1] = snake.getX()[2];
				snake.getY()[1] = snake.getY()[2];
				snake.setRunning(false);
				// running = false;
				System.out.println("Game Over!");
				// OnVolume.getInstance().sound("..\\Snake_Game_ver2-master\\src\\data\\boom.wav");
			}
			return snake;
		}
		return snake;
	}
	@Override
	public void paintEnemy(Graphics g) {
		// TODO Auto-generated method stub
	}
}
