package vn.edu.nlu.model.enemy;

import java.awt.Graphics;

import vn.edu.nlu.model.Snake;

public class Wall extends Enemy{

	public Wall(int screenWidth, int screenHeight, int unit_size) {
		super(unit_size, unit_size, unit_size);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Snake collision(Snake snake) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void paintEnemy(Graphics g) {
		// TODO Auto-generated method stub
		
	}

}
