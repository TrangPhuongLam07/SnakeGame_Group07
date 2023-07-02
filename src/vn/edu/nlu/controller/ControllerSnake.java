import java.awt.Graphics;


import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import vn.edu.nlu.model.Snake;
import vn.edu.nlu.model.enemy.CollisionBehavior;
import vn.edu.nlu.model.food.EatingBehavior;
import vn.edu.nlu.model.level.*;


public class ControllerSnake {
	private Snake snake;
	private List<EatingBehavior> listEatingBehaviors;
	private List<CollisionBehavior> listCollisionBehaviors;

	private LevelFactory levelFactory;
	private JPanel screenGame;
	private int level;
	private int width, height, unit;

	private ControllerSnake() {
		width = 400;
		height = 400;
		snake = new Snake(width, height);
		unit = snake.getUnit_size();

		listEatingBehaviors = new ArrayList<EatingBehavior>();
		listCollisionBehaviors = new ArrayList<CollisionBehavior>();

	}

	public ControllerSnake(int level) {
		this();
		// create level
		this.level = level;
		levelFactory = new LevelFactory(this);
		// set level
		snake.setListEatingBehavior(listEatingBehaviors);
		snake.setLisCollisionBehaviors(listCollisionBehaviors);
		screenGame = levelFactory.createLevel(this.level);
	}

	public int getUnit() {
		return unit;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public List<EatingBehavior> getListEatingBehaviors() {
		return listEatingBehaviors;
	}

	public void setListEatingBehaviors(List<EatingBehavior> listEatingBehaviors) {
		this.listEatingBehaviors = listEatingBehaviors;
	}

	public List<CollisionBehavior> getListCollisionBehaviors() {
		return listCollisionBehaviors;
	}

	public void setListCollisionBehaviors(List<CollisionBehavior> listCollisionBehaviors) {
		this.listCollisionBehaviors = listCollisionBehaviors;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public JPanel getScreenGame() {
		return screenGame;
	}

	public Snake getSnake() {
		return snake;
	}

	public int getSpeed() {
		return snake.getSpeed();
	}

	public void setSnakeSpeed(int speed) {
		snake.setSpeed(speed);
	}

	public KeyListener getSnakeKeyHandle() {
		return snake.new KeyHandler();
	}

	public void startSnake() {
		levelFactory.createEffect(level);
	}

	public void paintCharacter(Graphics g) {
		// paint Level
		levelFactory.paintLevel(g);

	}

	public boolean getRunning() {
		return snake.isRunning();
	}

	public void setState(boolean b) {
		snake.setRunning(!snake.isRunning());
	}

}
