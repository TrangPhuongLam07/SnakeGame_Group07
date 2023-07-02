package vn.edu.nlu.gameState;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Timer;
import java.util.TimerTask;

import vn.edu.nlu.view.ScreenGame;
public class GameOver implements GameState {
	private static GameOver instance = new GameOver();

	private GameOver() {
	}
	@Override
	public void paintState(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		g2D.setStroke(new BasicStroke(10));
		g2D.setColor(Color.red);
		g2D.setFont(new Font("Ink Free", Font.BOLD, 30));
		g2D.drawString("GAME OVER :(", 90, 200);
		g2D.drawString("A HI HI!!!", 120, 250);
		System.out.println("im in game over");
	}

	public static GameOver getInstance() {
		return instance;
	}
	@Override
	public boolean doAction(ScreenGame screenGame) {
//		OnVolume.getInstance().sound("..\\SnakeGame_Group07\\src\\data\\Tieng-cuoi-troll.wav");
//		screenGame.setState(this);
//		return false;
		return false;
	}
}
