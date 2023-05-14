package vn.edu.nlu.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import vn.edu.nlu.model.ImageFactory;
import vn.edu.nlu.model.Observer;
import vn.edu.nlu.model.ScoreData;
import vn.edu.nlu.model.Subject;

public class PanelNavbar extends JPanel implements Observer {
	private JLabel lbAppleScore, lbScore, lbMushroomScore, lbStarScore;
//	private JButton btVolume;
	private int appleScore, mushroomScore, starScore, highScore;
	private static int width, height;
	private Subject sub;

//	private VolumeState volumeState = OnVolume.getInstance();

	public PanelNavbar(Subject sub, int width, int height) {
		this.width = width;
		this.height = height;

		this.appleScore = 0;
		this.mushroomScore = 0;
		this.starScore = 0;
		this.highScore = 0;

		this.sub = sub;
		// register
		sub.register(this);
		// set up panel
		this.setPreferredSize(new Dimension(this.width, this.height / 10));
		this.setBackground(new Color(0, 139, 69));
		SpringLayout layout = new SpringLayout();
		this.setLayout(layout);
		// label
		lbAppleScore = new JLabel(ImageFactory.createImageFood("tao"));
		lbAppleScore.setText("" + appleScore);
		lbAppleScore.setFont(lbAppleScore.getFont().deriveFont(15.0f));
		lbAppleScore.setForeground(Color.WHITE);

		lbMushroomScore = new JLabel(ImageFactory.createImageFood("mushroom"));
		lbMushroomScore.setText("" + mushroomScore);
		lbMushroomScore.setFont(lbMushroomScore.getFont().deriveFont(15.0f));
		lbMushroomScore.setForeground(Color.WHITE);

		lbStarScore = new JLabel(ImageFactory.createImageFood("star"));
		lbStarScore.setText("" + starScore);
		lbStarScore.setFont(lbStarScore.getFont().deriveFont(15.0f));
		lbStarScore.setForeground(Color.WHITE);

		lbScore = new JLabel(ImageFactory.createImageCup());
		lbScore.setText("" + highScore);
		lbScore.setFont(lbScore.getFont().deriveFont(15.0f));
		lbScore.setForeground(Color.WHITE);

		this.add(lbAppleScore);
		this.add(lbMushroomScore);
		this.add(lbStarScore);
		this.add(lbScore);

		// position label
		layout.putConstraint(SpringLayout.WEST, lbAppleScore, 10, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, lbAppleScore, 10, SpringLayout.NORTH, this);

		layout.putConstraint(SpringLayout.WEST, lbMushroomScore, 60, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, lbMushroomScore, 10, SpringLayout.NORTH, this);

		layout.putConstraint(SpringLayout.WEST, lbStarScore, 110, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, lbStarScore, 10, SpringLayout.NORTH, this);

//		layout.putConstraint(SpringLayout.WEST, labelSwampScore, 170, SpringLayout.WEST, this);
//		layout.putConstraint(SpringLayout.NORTH, labelSwampScore, 10, SpringLayout.NORTH, this);

		layout.putConstraint(SpringLayout.WEST, lbScore, 300, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, lbScore, 10, SpringLayout.NORTH, this);

//		layout.putConstraint(SpringLayout.NORTH, btVolume, 10, SpringLayout.NORTH, this);
//		layout.putConstraint(SpringLayout.WEST, btVolume, 360, SpringLayout.WEST, this);
	}

	public void paintNavbar() {
		lbAppleScore.setText(appleScore + "");
		lbMushroomScore.setText(mushroomScore + "");
		lbStarScore.setText(starScore + "");
		lbScore.setText(highScore + "");
	}
	
	public int doHighScore() {
		return  appleScore +(-mushroomScore)+(starScore*10);
	}

	@Override
	public void update(Subject sub) {
		if (sub.equals(this.sub)) {
			ScoreData data = (ScoreData) sub;
			this.appleScore = data.getAppleScore();
			this.mushroomScore = data.getMushroomScore();
			this.starScore = data.getStarScore();
			this.highScore = doHighScore();
			
			display();
		}
	}

	@Override
	public void display() {
		paintNavbar();
		System.out.println("Score:" + appleScore + ", " + mushroomScore + ", " + starScore + ", " + highScore);
	}

}
