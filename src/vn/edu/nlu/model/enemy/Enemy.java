package vn.edu.nlu.model.enemy;

import java.util.Random;

import javax.swing.ImageIcon;

public abstract class Enemy implements CollisionBehavior{
	protected int xEnemy, yEnemy, screenWidth, screenHeight, unit_size;
	protected Random random;
	protected ImageIcon iconHeadUp;
	public Enemy(int screenWidth, int screenHeight, int unit_size) {
		this.screenWidth = screenWidth;
		this.screenHeight = screenHeight;
		this.unit_size = unit_size;
		}
		
	}
