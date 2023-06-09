package vn.edu.nlu.view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import vn.edu.nlu.model.ImageFactory;
import vn.edu.nlu.view.panel.PanelHelp;


public class HelpFrame extends JFrame{
	
	private PanelHelp panelHelp;
	static final int WIDTH = 530, HEIGHT = 646;

	public HelpFrame(int width, int height) {
		// TODO Auto-generated method stub
		setTitle("Help");
		setSize(new Dimension(width, height));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// set borderLayout.
		SpringLayout layout = new SpringLayout();
		setLayout(layout);
		//-------------- Panel Background Help -----------------
		
		setContentPane(new PanelBackground());
		
		
		//----------------- Panel Content Help ----------------------
		panelHelp = new PanelHelp();
		panelHelp.getBtBack().addMouseListener(new handler());
				
				
		layout.putConstraint(SpringLayout.SOUTH, panelHelp, 500, SpringLayout.SOUTH, this);
		layout.putConstraint(SpringLayout.WEST, panelHelp, 200, SpringLayout.WEST, this);
		
		add(panelHelp);
		
		setVisible(true);
	}
	
	public HelpFrame() {
		this(WIDTH, HEIGHT);
	}
	private class PanelBackground extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(ImageFactory.createImageBackgroundHelp().getImage(), 0, 0, getWidth(), getHeight(), null);
		}
	}
	private class handler implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == panelHelp.getBtBack()) {
				backMenuView();
			}
		}

		
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == panelHelp.getBtBack()) {
				ImageIcon iconBack = new ImageIcon("");
				panelHelp.getBtBack().setIcon(iconBack);
				panelHelp.getBtBack().setPreferredSize(new Dimension(120, 45));
			}
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == panelHelp.getBtBack()) {
				ImageIcon iconBack = new ImageIcon("");
				panelHelp.getBtBack().setIcon(iconBack);
				panelHelp.getBtBack().setPreferredSize(new Dimension(105, 30));
				dispose();
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
		
		public void backMenuView() {
			new MenuFrame();
//			this.dispose();
		}
	}
	
	public static void main(String[] args) {
		new HelpFrame();
	}
}
