package vn.edu.nlu.controller;

import javax.swing.JOptionPane;

import vn.edu.nlu.model.Menu;
import vn.edu.nlu.view.GameFrame;
import vn.edu.nlu.view.LevelFrame;
import vn.edu.nlu.view.MenuFrame;
import vn.edu.nlu.view.panel.level.LevelEasy;

public class ControllerMenu implements Menu {
	private ControllerSnake controllerSnake;
	private GameFrame gameFrame;
	private MenuFrame menuFrame;

	public ControllerMenu(MenuFrame frame) {
		this.menuFrame = frame;
	}

	@Override
	public void newGame() {
		System.out.println("New Game");
		menuFrame.dispose();
		GameFrame frame = new GameFrame(new ControllerSnake(1));

	}

	@Override
	public void levelGame() {
		System.out.println("Level Game");
		menuFrame.dispose();
		new LevelFrame();
	}

	@Override
	public void scoreGame() {
		System.out.println("Score Game");
	}

	@Override
	public void helpGame() {
		System.out.println("Help Game");
	}

	@Override
	public void exitGame() {
		if (JOptionPane.showConfirmDialog(menuFrame, "Are you sure to Exit the Game", "Exit Game!!!",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_NO_OPTION)
			System.exit(0);
	}

}
