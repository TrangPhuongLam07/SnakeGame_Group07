package test;


import org.junit.jupiter.api.Test;

import vn.edu.nlu.controller.ControllerSnake;
import vn.edu.nlu.view.GameFrame;

class TestSnake {
	
	
	@Test
	public void gameframe() {
		ControllerSnake control = new ControllerSnake(2);
		GameFrame frame = new GameFrame(control);
		frame.run();
		
		
	}
	
	@Test
	public void levelFactory() {
		ControllerSnake control = new ControllerSnake(1);
		System.out.println(control.getListEatingBehaviors().size());
	}
	

}
