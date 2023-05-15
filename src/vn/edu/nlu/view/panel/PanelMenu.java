package vn.edu.nlu.view.panel;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import vn.edu.nlu.model.ImageFactory;

public class PanelMenu extends JPanel{
	private JButton btPlay, btLevel, btScore, btPlayer, btHelp, btExit;
	private final int WIDTH = 102, HEIGHT = 300;
	
	public PanelMenu() {
		this.setLayout(new GridLayout(6, 1));
		this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		
		btPlay = new JButton(ImageFactory.createImageButton("play"));
		btPlay.setBorderPainted(false);
		btPlay.setContentAreaFilled(false);
		btPlay.setFocusable(false);
		btPlay.setPreferredSize(new Dimension(87, 35));

		btLevel = new JButton(ImageFactory.createImageButton("level"));
		btLevel.setBorderPainted(false);
		btLevel.setContentAreaFilled(false);
		btLevel.setFocusable(false);
		btLevel.setPreferredSize(new Dimension(87, 35));

		btScore = new JButton(ImageFactory.createImageButton("score"));
		btScore.setBorderPainted(false);
		btScore.setContentAreaFilled(false);
		btScore.setFocusable(false);
		btScore.setPreferredSize(new Dimension(87, 35));
		

		btHelp = new JButton(ImageFactory.createImageButton("help"));
		btHelp.setBorderPainted(false);
		btHelp.setContentAreaFilled(false);
		btHelp.setFocusable(false);
		btHelp.setPreferredSize(new Dimension(87, 35));

		btExit = new JButton(ImageFactory.createImageButton("exit"));
		btExit.setBorderPainted(false);
		btExit.setContentAreaFilled(false);
		btExit.setFocusable(false);
		btExit.setPreferredSize(new Dimension(87, 35));
		
		this.setOpaque(false);
		
		this.add(btPlay);
		this.add(btLevel);
		this.add(btScore);
		this.add(btHelp);
		this.add(btExit);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
	}

	public JButton getBtPlay() {
		return btPlay;
	}

	public JButton getBtLevel() {
		return btLevel;
	}

	public JButton getBtScore() {
		return btScore;
	}
	
	public JButton getBtPlayer() {
		return btPlayer;
	}

	public JButton getBtHelp() {
		return btHelp;
	}

	public JButton getBtExit() {
		return btExit;
	}

}
