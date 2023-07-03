package vn.edu.nlu.gameState;

import java.awt.Graphics;

import vn.edu.nlu.interfaceSnake.GameState;
import vn.edu.nlu.view.ScreenGame;
public class StartGame implements GameState{
	private static StartGame instance = new StartGame();
	private StartGame() {
	}
	@Override
	public void paintState(Graphics g) {
		// TODO Auto-generated method stub		
	}
	public static StartGame getInstance() {
		return instance;
	}
	@Override
	public boolean doAction(ScreenGame screenGame) {
		screenGame.setState(this);
		return false;
	}
}
