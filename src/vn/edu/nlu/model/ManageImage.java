package vn.edu.nlu.model;

import javax.swing.ImageIcon;

public class ManageImage {
	public ManageImage() {

	}

	public ImageIcon getImageSnake(String name) {
		//head		
		if ("headUp".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\Head_Up.png");
		if ("headDown".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\Head_Down.png");
		if ("headLeft".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\Head_Left.png");
		if ("headRight".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\Head_Right.png");

		if ("body".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\body.png");

		//tail
		if ("tailUp".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\Tail_Up.png");
		if ("tailDown".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\Tail_Down.png");
		if ("tailLeft".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\Tail_Left.png");
		if ("tailRight".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\Tail_Right.png");

		return new ImageIcon("..\\SnakeGame_team07\\src\\data\\body.png");
	}
}
