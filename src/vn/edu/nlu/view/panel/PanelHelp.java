package vn.edu.nlu.view.panel;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelHelp extends JPanel{
	private ImageIcon iconBack;
	private ImageIcon iconBgHelp;

	private JButton btBack;
	public PanelHelp() {
		// TODO Auto-generated constructor stub
		//background help
		iconBgHelp = new ImageIcon("helpbg");
		//button Back
		ImageIcon iconBack = new ImageIcon("back");
		btBack = new JButton(iconBack);
		btBack.setBorderPainted(false);
		btBack.setContentAreaFilled(false);
		btBack.setFocusable(false);
		btBack.setPreferredSize(new Dimension(105,30));
		
		//add components to jPanel
		this.setOpaque(false);
		
		this.add(btBack);
	}
	
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.drawImage(iconBgHelp.getImage(), 0, 0,getWidth(), getHeight(), null);
	}
	
	public JButton getBtBack() {
		return btBack;
	}
}
