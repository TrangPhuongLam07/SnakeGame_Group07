package vn.edu.nlu.gameState;

import java.awt.Graphics;

import vn.edu.nlu.view.GameFrame;
public interface GameState {

	public boolean doAction(GameFrame screenGame);
	public void paintState(Graphics g);
}
