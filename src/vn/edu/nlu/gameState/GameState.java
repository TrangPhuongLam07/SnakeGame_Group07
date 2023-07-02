package vn.edu.nlu.gameState;

import java.awt.Graphics;
import vn.edu.nlu.view.ScreenGame;
public interface GameState {

	public boolean doAction(ScreenGame screenGame);
	public void paintState(Graphics g);
}
