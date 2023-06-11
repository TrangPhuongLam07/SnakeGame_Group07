package vn.edu.nlu.model;

import javax.swing.ImageIcon;

public class ImageFactory {
	public ImageFactory() {

	}

	public static ImageIcon createImageSnake(String name) {

		// head
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

		// tail
		if ("tailUp".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\Tail_Up.png");
		if ("tailDown".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\Tail_Down.png");
		if ("tailLeft".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\Tail_Left.png");
		if ("tailRight".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\Tail_Right.png");

		System.out.println("No Image");
		return new ImageIcon("..\\SnakeGame_team07\\src\\data\\body.png");
	}

	public static ImageIcon createImageFood(String name) {
		// apple
		if ("tao".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\tao.png");
		if ("tao1".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\tao1.png");
		if ("tao2".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\tao2.png");
		if ("tao3".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\tao3.png");

		// energy
		if ("energy".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\energy.png");

		// mushroom
		if ("mushroom".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\mushroom.png");
		if ("mushroom1".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\mushroom1.png");
		if ("mushroom2".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\mushroom2.png");

		// star
		if ("star".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\star.png");
		if ("star1".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\star1.png");
		if ("start2".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\start2.png");
		if ("star3".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\star3.png");
		System.out.println("No Image");
		return new ImageIcon("..\\SnakeGame_team07\\src\\data\\body.png");

	}

	public static ImageIcon createImageEnemy(String name) {
		if ("tao".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\tao.png");
		if ("tao1".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\tao1.png");
		if ("tao2".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\tao2.png");
		if ("tao3".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\tao3.png");

		// swamp
		if ("swamp".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\swamp.png");
		if ("swamp1".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\swamp.png");
		if ("swamp2".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\swamp.png");
		if ("swamp3".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\swamp.png");
		System.out.println("No Image");
		return new ImageIcon("..\\SnakeGame_team07\\src\\data\\body.png");

	}

	public static ImageIcon createImageBackground(int level) {
		switch (level) {
		case 1: {
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\map_1.png");
		}
		case 2: {
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\map_2.jpg");
		}
		case 3: {
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\map_3.png");
		}
		case 4: {
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\map_3.png");
		}
		default:
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\map_1.png");
		}
	}

	public static ImageIcon createImageCup() {
		return new ImageIcon("..\\SnakeGame_team07\\src\\data\\cup.png");

	}

	public static ImageIcon createImageBackground() {
		return new ImageIcon("..\\SnakeGame_team07\\src\\data\\Background_desktop.png");
	}

	public static ImageIcon createImageBackgroundLevel() {
		return new ImageIcon("..\\SnakeGame_team07\\src\\data\\levelbg.png");
	}

	public static ImageIcon createImageButton(String name) {
		if ("play".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\Play.png");
		if ("level".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\Level.png");
		if ("score".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\Score.png");
		if ("options".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\Options.png");
		if ("help".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\Help.png");
		if ("exit".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\Exit.png");

		if ("play1".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\Play1.png");
		if ("level1".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\Level1.png");
		if ("score1".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\Score1.png");
		if ("options1".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\Options1.png");
		if ("help1".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\Help1.png");
		if ("exit1".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\Exit1.png");
// Level
		if ("easy".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\easy.png");
		if ("normal".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\normal.png");
		if ("hard".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\hard.png");
		if ("back".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\back.png");

		if ("easy1".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\easy1.png");
		if ("normal1".equals(name)) 
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\normal1.png");
		if ("hard1".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\hard1.png");
		if ("back1".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\back1.png");
		
		if ("replay".equals(name))
			return new ImageIcon("..\\SnakeGame_team07\\src\\data\\replay4.png");
		System.out.println("No Image");
		return new ImageIcon("..\\SnakeGame_team07\\src\\data\\body.png");
	}

}
