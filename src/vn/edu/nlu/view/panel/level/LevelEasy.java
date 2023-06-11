package vn.edu.nlu.view.panel.level;

import java.awt.Graphics;

import javax.swing.ImageIcon;

import vn.edu.nlu.controller.ControllerSnake;
import vn.edu.nlu.model.ImageFactory;

public class LevelEasy extends Level{

	public LevelEasy(ControllerSnake control) {
		super(control);
		
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		controller.paintCharacter(g);
		System.out.println("Easy");
	}

}
