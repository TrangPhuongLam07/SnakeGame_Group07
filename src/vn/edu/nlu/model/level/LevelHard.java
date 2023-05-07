package vn.edu.nlu.model.level;

import java.awt.Graphics;

import vn.edu.nlu.controller.ControllerSnake;

public class LevelHard extends Level{

	public LevelHard(ControllerSnake control) {
		super(control);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		controller.paintCharacter(g);
		System.out.println("Hard");
	}

}
