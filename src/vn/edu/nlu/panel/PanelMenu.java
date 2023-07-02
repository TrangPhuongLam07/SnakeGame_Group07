package vn.edu.nlu.panel;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

	public class PanelMenu extends JPanel{
		private JButton btPlay, btLevel, btScore, btPlayer, btHelp, btExit;
		private ImageIcon iconPlay, iconLevel, iconScore, iconPlayer, iconHelp, iconExit;
		private final int WIDTH = 102, HEIGHT = 300;
		
		public PanelMenu() {
			// TODO Auto-generated constructor stub
			this.setLayout(new GridLayout(6, 1));
			this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
			
			iconPlay = new ImageIcon("..\\Snake_Game_ver2-master\\src\\data\\Play.png");
			btPlay = new JButton(iconPlay);
			btPlay.setBorderPainted(false);
			btPlay.setContentAreaFilled(false);
			btPlay.setFocusable(false);
			btPlay.setPreferredSize(new Dimension(87, 35));

			iconLevel = new ImageIcon("..\\Snake_Game_ver2-master\\src\\data\\Level.png");
			btLevel = new JButton(iconLevel);
			btLevel.setBorderPainted(false);
			btLevel.setContentAreaFilled(false);
			btLevel.setFocusable(false);
			btLevel.setPreferredSize(new Dimension(87, 35));

			iconScore = new ImageIcon("..\\Snake_Game_ver2-master\\src\\data\\Score.png");
			btScore = new JButton(iconScore);
			btScore.setBorderPainted(false);
			btScore.setContentAreaFilled(false);
			btScore.setFocusable(false);
			btScore.setPreferredSize(new Dimension(87, 35));
			
			iconPlayer = new ImageIcon("..\\Snake_Game_ver2-master\\src\\data\\Options.png");
			btPlayer = new JButton(iconPlayer);
			btPlayer.setBorderPainted(false);
			btPlayer.setContentAreaFilled(false);
			btPlayer.setFocusable(false);
			btPlayer.setPreferredSize(new Dimension(87, 35));

			iconHelp = new ImageIcon("..\\Snake_Game_ver2-master\\src\\data\\Help.png");
			btHelp = new JButton(iconHelp);
			btHelp.setBorderPainted(false);
			btHelp.setContentAreaFilled(false);
			btHelp.setFocusable(false);
			btHelp.setPreferredSize(new Dimension(87, 35));

			iconExit = new ImageIcon("..\\Snake_Game_ver2-master\\src\\data\\Exit.png");
			btExit = new JButton(iconExit);
			btExit.setBorderPainted(false);
			btExit.setContentAreaFilled(false);
			btExit.setFocusable(false);
			btExit.setPreferredSize(new Dimension(87, 35));
			
			this.setOpaque(false);
			
			this.add(btPlay);
			this.add(btLevel);
			this.add(btScore);
			this.add(btPlayer);
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

