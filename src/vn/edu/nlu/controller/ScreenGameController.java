package vn.edu.nlu.controller;
import vn.edu.nlu.model.Snake;
import vn.edu.nlu.model.enemy.CollisionBehavior;
import vn.edu.nlu.model.food.EatingBehavior;
import vn.edu.nlu.view.ScreenGame;

public class ScreenGameController {
	static ScreenGame screenGame;
	public static Snake snake;
	private Snake eating;
	private Snake collision;
	public ScreenGameController(ScreenGame screenGame) {
		super();
		this.screenGame = screenGame;
		
		snake = new Snake(screenGame.width, screenGame.height);
}	
}
