package vn.edu.nlu.model.food;

import java.awt.Graphics;
import java.util.Random;

import javax.swing.ImageIcon;

import vn.edu.nlu.model.ImageFactory;

public abstract class Food implements EatingBehavior {
	protected int xFood, yFood, screenWidth, screenHeight, unit_size;
	protected Random random;
	protected ImageIcon iconHeadUp;

	public Food(int screenWidth, int screenHeight, int unit_size) {
		// TODO Auto-generated constructor stub
		this.screenWidth = screenWidth;
		this.screenHeight = screenHeight;
		this.unit_size = unit_size;
		
		random = new Random();
		randomFood();

	}

	public void randomFood() {
		int sumOfSquareWidth = screenWidth / unit_size;
		int sumOfSquareHeight = screenHeight / unit_size;
		xFood = random.nextInt((int) (sumOfSquareWidth)) * unit_size;
		yFood = random.nextInt((int) (sumOfSquareHeight)) * unit_size;
	}
	public void clearFood() {
		xFood = -200;
		yFood = -200;
	}
}


