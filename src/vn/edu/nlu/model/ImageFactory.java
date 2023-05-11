package vn.edu.nlu.model;

import javax.swing.ImageIcon;

public class  ImageFactory {
	public ImageFactory() {

	}

	public static ImageIcon createImageSnake(String name) {

		// head
		if ("headUp".equals(name))
			return new ImageIcon("..\\SnakeGame_Group07\\src\\data\\Head_Up.png");
		if ("headDown".equals(name))
			return new ImageIcon("..\\SnakeGame_Group07\\src\\data\\Head_Down.png");
		if ("headLeft".equals(name))
			return new ImageIcon("..\\SnakeGame_Group07\\src\\data\\Head_Left.png");
		if ("headRight".equals(name))
			return new ImageIcon("..\\SnakeGame_Group07\\src\\data\\Head_Right.png");

		if ("body".equals(name))
			return new ImageIcon("..\\SnakeGame_Group07\\src\\data\\body.png");

		// tail
		if ("tailUp".equals(name))
			return new ImageIcon("..\\SnakeGame_Group07\\src\\data\\Tail_Up.png");
		if ("tailDown".equals(name))
			return new ImageIcon("..\\SnakeGame_Group07\\src\\data\\Tail_Down.png");
		if ("tailLeft".equals(name))
			return new ImageIcon("..\\SnakeGame_Group07\\src\\data\\Tail_Left.png");
		if ("tailRight".equals(name))
			return new ImageIcon("..\\SnakeGame_Group07\\src\\data\\Tail_Right.png");

		System.out.println("No Image");
		return new ImageIcon("..\\SnakeGame_Group07\\src\\data\\body.png");
	}

	public static ImageIcon createImageFood(String name) {
		//apple
		if ("tao".equals(name))
			return new ImageIcon("..\\SnakeGame_Group07\\src\\data\\tao.png");
		if ("tao1".equals(name))
			return new ImageIcon("..\\SnakeGame_Group07\\src\\data\\tao1.png");
		if ("tao2".equals(name))
			return new ImageIcon("..\\SnakeGame_Group07\\src\\data\\tao2.png");
		if ("tao3".equals(name))
			return new ImageIcon("..\\SnakeGame_Group07\\src\\data\\tao3.png");
		
		//energy
		if ("energy".equals(name))
			return new ImageIcon("..\\SnakeGame_Group07\\src\\data\\energy.png");
		
		//mushroom
		if ("mushroom".equals(name))
			return new ImageIcon("..\\SnakeGame_Group07\\src\\data\\mushroom.png");
		if ("mushroom1".equals(name))
			return new ImageIcon("..\\SnakeGame_Group07\\src\\data\\mushroom1.png");
		if ("mushroom2".equals(name))
			return new ImageIcon("..\\SnakeGame_Group07\\src\\data\\mushroom2.png");
		System.out.println("No Image");
		return new ImageIcon("..\\SnakeGame_Group07\\src\\data\\body.png");

	}
	
	public static ImageIcon createImageEnemy(String name) {
		if ("tao".equals(name))
			return new ImageIcon("..\\SnakeGame_Group07\\src\\data\\tao.png");
		if ("tao1".equals(name))
			return new ImageIcon("..\\SnakeGame_Group07\\src\\data\\tao1.png");
		if ("tao2".equals(name))
			return new ImageIcon("..\\SnakeGame_Group07\\src\\data\\tao2.png");
		if ("tao3".equals(name))
			return new ImageIcon("..\\SnakeGame_Group07\\src\\data\\tao3.png");
		if ("wall".equals(name))
			return new ImageIcon("..\\SnakeGame_Group07\\src\\data\\wall.png");
		if ("swamp".equals(name))
			return new ImageIcon("..\\SnakeGame_Group07\\src\\data\\swamp.png");
		System.out.println("No Image");
		return new ImageIcon("..\\SnakeGame_Group07\\src\\data\\body.png");

	}
	
	public static ImageIcon createImageBackground(int level) {
		switch (level) {
		case 1: {
			return new ImageIcon("..\\SnakeGame_Group07\\src\\data\\map_1.png");
		}
		case 2: {
			return new ImageIcon("..\\SnakeGame_Group07\\src\\data\\map_2.jpg");
		}
		case 3: {
			return new ImageIcon("..\\SnakeGame_Group07\\src\\data\\map_3.png");
		}
		default:
			return new ImageIcon("..\\SnakeGame_Group07\\src\\data\\map_1.png");
		}
	}
}


