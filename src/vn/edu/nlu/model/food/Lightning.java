package vn.edu.nlu.model.food;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import vn.edu.nlu.model.ImageFactory;
import vn.edu.nlu.model.Snake;

public class Lightning extends Food{

	public Lightning(int screenWidth, int screenHeight, int unit_size) {
		super(screenWidth, screenHeight, unit_size);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Snake eating(Snake snake) {
		int speed = snake.getSpeed();
		if((snake.getX()[0] == xFood) && (snake.getY()[0] == yFood)) {
			//EDIT
			snake.setSpeed(speed - 50);;
		    Timer timer = new Timer(5000, new ActionListener() {
		        @Override
		        public void actionPerformed(ActionEvent e) {
		        	snake.setSpeed(speed + 50);;
		        }
		    });
		    
		    timer.setRepeats(false);
		    timer.start();
			randomFood();
		}
		return snake;
	}

	@Override
	public void paintFood(Graphics g) {
		iconHeadUp = ImageFactory.createImageFood("energy");
		g.drawImage(iconHeadUp.getImage(), xFood, yFood, unit_size, unit_size, null);
		
	}


}
