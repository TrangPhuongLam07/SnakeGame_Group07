package vn.edu.nlu.gameState;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import vn.edu.nlu.view.ScreenGame;
public class PauseGame implements GameState{
	private static PauseGame instance = new PauseGame();

	private PauseGame() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void paintState(Graphics g) {
		// TODO Auto-generated method stub
		Graphics2D g2D = (Graphics2D) g;	
		g2D.setStroke(new BasicStroke(5));	
		g2D.setColor(Color.red);
		g2D.setFont(new Font("Ink Free", Font.BOLD, 30));
		g2D.drawString("PRESS SPACE TO PLAY!", 30, 200);
		
//		System.out.println("im in pause game");
	}
	

	public static PauseGame getInstance() {
		return instance;
	}

	@Override
	public boolean doAction(ScreenGame screenGame) {
		screenGame.setState(this);
		return false;
	}	
}
