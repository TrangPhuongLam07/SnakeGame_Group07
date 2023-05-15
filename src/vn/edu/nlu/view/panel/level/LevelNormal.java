package vn.edu.nlu.view.panel.level;

import java.awt.Graphics;

import vn.edu.nlu.controller.ControllerSnake;

public class LevelNormal extends Level{

	public LevelNormal(ControllerSnake control) {
		super(control);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		controller.paintCharacter(g);
		System.out.println("Normal");
	}

}
