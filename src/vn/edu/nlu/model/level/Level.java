package vn.edu.nlu.model.level;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import vn.edu.nlu.controller.ControllerSnake;

public abstract class Level extends JPanel{
	protected ControllerSnake controller;
	public Level(ControllerSnake control) {
		setPreferredSize(new Dimension(control.getWidth(), control.getHeight()));
		this.controller = control;
	}


	@Override
	protected abstract void paintComponent(Graphics g);
	
}