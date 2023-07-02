package vn.edu.nlu.panel;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class PanelHelp {
	private ImageIcon iconBack;
	private JButton btBack;
	public PanelHelp() {
		// TODO Auto-generated constructor stub
		//button Back
		ImageIcon iconBack = new ImageIcon("..\\SnakeGame_Group07\\src\\data\\back.png");
		btBack = new JButton(iconBack);
		btBack.setBorderPainted(false);
		btBack.setContentAreaFilled(false);
		btBack.setFocusable(false);
		btBack.setPreferredSize(new Dimension(105,30));
		
		//add components to jPanel
		this.setOpaque(false);
		this.add(btBack);
	}
	
	public JButton getBtBack() {
		return btBack;
	}
	
}
