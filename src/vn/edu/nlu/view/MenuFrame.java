package vn.edu.nlu.view;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import vn.edu.nlu.controller.ControllerMenu;
import vn.edu.nlu.model.ImageFactory;
import vn.edu.nlu.panel.PanelMenu;

public class MenuFrame extends JFrame{
	static final int WIDTH = 530, HEIGHT = 646;
	private PanelMenu pnMenu;
	private ControllerMenu controllerMenu;

	public MenuFrame() {
		setTitle("Snake Game");
		setSize(new Dimension(WIDTH, HEIGHT));

		controllerMenu = new ControllerMenu(this);
		// panel
		pnMenu = new PanelMenu();
		pnMenu.getBtPlay().addMouseListener(new MouseHandle());
		pnMenu.getBtLevel().addMouseListener(new MouseHandle());
		pnMenu.getBtScore().addMouseListener(new MouseHandle());
		pnMenu.getBtHelp().addMouseListener(new MouseHandle());
		pnMenu.getBtExit().addMouseListener(new MouseHandle());

		setContentPane(new PanelBackground());

		
		add(pnMenu, BorderLayout.CENTER);
		setLocationRelativeTo(null);// frame center screen
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private class PanelBackground extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(ImageFactory.createImageBackground().getImage(), 0, 0, getWidth(), getHeight(), null);
		}
	}


	private class MouseHandle implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getSource().equals(pnMenu.getBtPlay())) {
				controllerMenu.newGame();
			}

			if (e.getSource() == pnMenu.getBtLevel()) {
				controllerMenu.levelGame();
			}

			if (e.getSource() == pnMenu.getBtHelp()) {
				controllerMenu.helpGame();
			}

			if (e.getSource() == pnMenu.getBtScore()) {
				controllerMenu.scoreGame();
			}

			if (e.getSource() == pnMenu.getBtExit()) {
				controllerMenu.exitGame();
			}
			
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			if (e.getSource() == pnMenu.getBtPlay()) {
				pnMenu.getBtPlay().setIcon(ImageFactory.createImageButton("play1"));
				pnMenu.getBtPlay().setPreferredSize(new Dimension(120, 45));
			}

			if (e.getSource() == pnMenu.getBtHelp()) {
				pnMenu.getBtHelp().setIcon(ImageFactory.createImageButton("help1"));
				pnMenu.getBtHelp().setPreferredSize(new Dimension(120, 45));
			}

			if (e.getSource() == pnMenu.getBtLevel()) {
				pnMenu.getBtLevel().setIcon(ImageFactory.createImageButton("level1"));
				pnMenu.getBtLevel().setPreferredSize(new Dimension(120, 45));
			}

			if (e.getSource() == pnMenu.getBtScore()) {
				pnMenu.getBtScore().setIcon(ImageFactory.createImageButton("score1"));
				pnMenu.getBtScore().setPreferredSize(new Dimension(120, 45));
			}

			if (e.getSource() == pnMenu.getBtExit()) {
				pnMenu.getBtExit().setIcon(ImageFactory.createImageButton("exit1"));
				pnMenu.getBtExit().setPreferredSize(new Dimension(120, 45));
			}
		}

		@Override
		public void mouseExited(MouseEvent e) {
			if (e.getSource() == pnMenu.getBtPlay()) {
				pnMenu.getBtPlay().setIcon(ImageFactory.createImageButton("play"));
				pnMenu.getBtPlay().setPreferredSize(new Dimension(105, 30));
			}

			if (e.getSource() == pnMenu.getBtHelp()) {
				pnMenu.getBtHelp().setIcon(ImageFactory.createImageButton("help"));
				pnMenu.getBtHelp().setPreferredSize(new Dimension(105, 30));
			}

			if (e.getSource() == pnMenu.getBtLevel()) {
				pnMenu.getBtLevel().setIcon(ImageFactory.createImageButton("level"));
				pnMenu.getBtLevel().setPreferredSize(new Dimension(105, 30));
			}

			if (e.getSource() == pnMenu.getBtScore()) {
				pnMenu.getBtScore().setIcon(ImageFactory.createImageButton("score"));
				pnMenu.getBtScore().setPreferredSize(new Dimension(105, 30));
			}

			if (e.getSource() == pnMenu.getBtExit()) {
				pnMenu.getBtExit().setIcon(ImageFactory.createImageButton("exit"));
				pnMenu.getBtExit().setPreferredSize(new Dimension(105, 30));
			}
		}

	}


}

