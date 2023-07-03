package vn.edu.nlu.model.food;

import java.awt.Graphics;
import vn.edu.nlu.model.Snake;

public interface EatingBehavior {
	public Snake eating(Snake snake);
	public void paintFood(Graphics g);
}
