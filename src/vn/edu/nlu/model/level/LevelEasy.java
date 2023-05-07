package vn.edu.nlu.model.level;

import java.awt.Graphics;

import javax.swing.ImageIcon;

import vn.edu.nlu.controller.ControllerSnake;
import vn.edu.nlu.model.ImageFactory;

public class LevelEasy extends Level{

	public LevelEasy(ControllerSnake control) {
		super(control);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponents(g);
		controller.paintCharacter(g);
		System.out.println("Easy");
	}

}
