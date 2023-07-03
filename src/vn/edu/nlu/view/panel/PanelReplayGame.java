package vn.edu.nlu.view.panel;

import java.awt.*;
import javax.swing.*;

public class PanelReplayGame extends JPanel {
	private JButton btReplay, btHome;
	private ImageIcon iconReplay, iconHome;
	private int width = 400, height = 200;

	public PanelReplayGame() {
		setLayout(new GridLayout(1, 1));
		setPreferredSize(new Dimension(width, height));

		// --------------- Button Replay ----------------
		iconReplay = new ImageIcon();
		btReplay = new JButton();
		btReplay.setIcon(resizeImage("..\\SnakeGame_Group07\\src\\data\\replay.png", 60, 60));
		btReplay.setContentAreaFilled(false);
		btReplay.setBorderPainted(false);
		btReplay.setFocusable(false);
		btReplay.setPreferredSize(new Dimension(60, 60));

		iconHome = new ImageIcon("..\\SnakeGame_Group07\\src\\data\\hard.png");
		btHome = new JButton();
		btHome.setIcon(resizeImage("..\\SnakeGame_Group07\\src\\data\\home.png", 60, 60));
		btHome.setContentAreaFilled(false);
		btHome.setBorderPainted(false);
		btHome.setFocusable(false);
		btHome.setPreferredSize(new Dimension(60, 60));

		setOpaque(false);

		add(btReplay);
		add(btHome);
	}

	public JButton getBtReplay() {
		return btReplay;
	}

	public JButton getBtHome() {
		return btHome;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public ImageIcon resizeImage(String pathIcon, int width, int height) {
		Image image = new ImageIcon(pathIcon).getImage();
		Image imageResize = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
		ImageIcon icon = new ImageIcon(imageResize);

		return icon;
	}
}
