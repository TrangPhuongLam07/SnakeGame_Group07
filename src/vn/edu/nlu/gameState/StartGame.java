package vn.edu.nlu.gameState;

import java.awt.Graphics;


public class StartGame implements GameState{
	private static StartGame instance = new StartGame();
	
	private StartGame() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean doAction(ScreenGame screenGame) {
		// TODO Auto-generated method stub
		screenGame.setState(this);
		return true;
	}

	@Override
	public void paintState(Graphics g) {
		// TODO Auto-generated method stub
		
	}

	public static StartGame getInstance() {
		return instance;
	}
	
	

}
