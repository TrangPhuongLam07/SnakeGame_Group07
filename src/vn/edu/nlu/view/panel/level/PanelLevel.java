package vn.edu.nlu.view.panel.level;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import vn.edu.nlu.model.ImageFactory;
import vn.edu.nlu.view.LevelFrame;
import vn.edu.nlu.view.MenuFrame;

public class PanelLevel extends JPanel {
	private JButton btMap1, btMap2, btMap3, btBack;
	private final int WIDTH = 150, HEIGHT = 300;

	public PanelLevel() {
		// TODO Auto-generated constructor stub
		this.setLayout(new GridLayout(6, 1));
		this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		
		btMap1 = new JButton(ImageFactory.createImageButton("easy"));
		btMap1.setBorderPainted(false);
		btMap1.setContentAreaFilled(false);
		btMap1.setFocusable(false);
		btMap1.setPreferredSize(new Dimension(105, 30));
//		btMap1.addMouseListener(levelController);

		// create button Normal,  hidden background button Normal and event button Normal

		btMap2 = new JButton(ImageFactory.createImageButton("normal"));
		btMap2.setBorderPainted(false);
		btMap2.setContentAreaFilled(false);
		btMap2.setFocusable(false);
		btMap2.setPreferredSize(new Dimension(105, 30));
//		btMap2.addMouseListener(levelController);

		// create button Hard, hidden background button hard and event button Hard

		btMap3 = new JButton(ImageFactory.createImageButton("hard"));
		btMap3.setBorderPainted(false);
		btMap3.setContentAreaFilled(false);
		btMap3.setFocusable(false);
		btMap3.setPreferredSize(new Dimension(105, 30));
//		btMap3.addMouseListener(levelController);

		// create button Exit...

		btBack = new JButton(ImageFactory.createImageButton("back"));
		btBack.setBorderPainted(false);
		btBack.setContentAreaFilled(false);
		btBack.setFocusable(false);
		btBack.setPreferredSize(new Dimension(105, 30));
//		btBack.addMouseListener(levelController);

		// no bug for hidden background button

		this.setOpaque(false);

		// add button to the panel

		this.add(btMap1);
		this.add(btMap2);
		this.add(btMap3);
		this.add(btBack);
	}

	public JButton getBtBack() {
		return btBack;
	}

	public JButton getBtMap1() {
		return btMap1;
	}

	public JButton getBtMap2() {
		return btMap2;
	}

	public JButton getBtMap3() {
		return btMap3;
	}

	public int getWIDTH() {
		return WIDTH;
	}

	public int getHEIGHT() {
		return HEIGHT;
	}
}
