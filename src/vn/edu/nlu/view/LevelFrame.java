package vn.edu.nlu.view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import vn.edu.nlu.controller.ControllerMenu;
import vn.edu.nlu.controller.ControllerSnake;
import vn.edu.nlu.model.ImageFactory;
import vn.edu.nlu.view.panel.PanelLevel;

public class LevelFrame extends JFrame {
	static final int width = 300, height = 400;
	private PanelLevel pnLevel;
	private ControllerSnake controllerSnake;

	public LevelFrame() {
		controllerSnake = new ControllerSnake(1);
		setTitle("Level");
		setSize(new Dimension(width, height));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// set border layout
		SpringLayout layout = new SpringLayout();

		// ----------------- Panel Content Level ----------------
		pnLevel = new PanelLevel();

		pnLevel.getBtMap1().addMouseListener(new MouseHandle());
		pnLevel.getBtMap2().addMouseListener(new MouseHandle());
		pnLevel.getBtMap3().addMouseListener(new MouseHandle());
		pnLevel.getBtBack().addMouseListener(new MouseHandle());

		setContentPane(new PanelBackground());
		layout.putConstraint(SpringLayout.NORTH, pnLevel, this.height / 5, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, pnLevel, this.width / 4, SpringLayout.WEST, this);
		setLayout(layout);

		add(pnLevel);
		setVisible(true);
		setResizable(false);
	}

	private class PanelBackground extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(ImageFactory.createImageBackgroundLevel().getImage(), 0, 0, getWidth(), getHeight(), null);
		}
	}

	private class MouseHandle implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == pnLevel.getBtMap1()) {
				startGameWithLevel(1);
			}

			if (e.getSource() == pnLevel.getBtMap2()) {
				startGameWithLevel(2);
			}

			if (e.getSource() == pnLevel.getBtMap3()) {
				startGameWithLevel(3);
			}

			if (e.getSource() == pnLevel.getBtBack()) {
				backMenuView();
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
			// TODO Auto-generated method stub
			if (e.getSource() == pnLevel.getBtMap1()) {
				pnLevel.getBtMap1().setIcon(ImageFactory.createImageButton("easy1"));
				pnLevel.getBtMap1().setPreferredSize(new Dimension(120, 45));
			}

			if (e.getSource() == pnLevel.getBtMap2()) {
				pnLevel.getBtMap2().setIcon(ImageFactory.createImageButton("normal1"));
				pnLevel.getBtMap2().setPreferredSize(new Dimension(120, 45));
			}

			if (e.getSource() == pnLevel.getBtMap3()) {
				pnLevel.getBtMap3().setIcon(ImageFactory.createImageButton("hard1"));
				pnLevel.getBtMap3().setPreferredSize(new Dimension(120, 45));
			}

			if (e.getSource() == pnLevel.getBtBack()) {
				pnLevel.getBtBack().setIcon(ImageFactory.createImageButton("back1"));
				pnLevel.getBtBack().setPreferredSize(new Dimension(105, 40));
			}
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == pnLevel.getBtMap1()) {
				pnLevel.getBtMap1().setIcon(ImageFactory.createImageButton("easy"));
				pnLevel.getBtMap1().setPreferredSize(new Dimension(105, 30));
			}

			if (e.getSource() == pnLevel.getBtMap2()) {
				pnLevel.getBtMap2().setIcon(ImageFactory.createImageButton("normal"));
				pnLevel.getBtMap2().setPreferredSize(new Dimension(105, 30));
			}

			if (e.getSource() == pnLevel.getBtMap3()) {
				pnLevel.getBtMap3().setIcon(ImageFactory.createImageButton("hard"));
				pnLevel.getBtMap3().setPreferredSize(new Dimension(105, 30));
			}

			if (e.getSource() == pnLevel.getBtBack()) {
				pnLevel.getBtBack().setIcon(ImageFactory.createImageButton("back"));
				pnLevel.getBtBack().setPreferredSize(new Dimension(105, 30));
			}
		}

	}

	private void startGameWithLevel(int level) {
		controllerSnake = new ControllerSnake(level);
		new GameFrame(controllerSnake);
		this.dispose();
	}

	public void backMenuView() {
		new MenuFrame();
		this.dispose();
	}
}
