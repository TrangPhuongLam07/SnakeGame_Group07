package vn.edu.nlu.model.enemy;

import java.awt.Graphics;

import vn.edu.nlu.model.Snake;

public interface CollisionBehavior {
	public Snake collision(Snake snake);
	public void paintEnemy(Graphics g);
}
