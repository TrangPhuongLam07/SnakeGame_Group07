package vn.edu.nlu.view.panel.level;

import java.awt.Graphics;

import vn.edu.nlu.controller.ControllerSnake;

public class LevelHard extends Level{

	public LevelHard(ControllerSnake control) {
		super(control);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		controller.paintCharacter(g);
		System.out.println("Hard");
	}

}
