package test;


import vn.edu.nlu.controller.ControllerSnake;
import vn.edu.nlu.view.GameFrame;
import vn.edu.nlu.view.MenuFrame;

class TestSnake {
	
	

	public void gameframe() {
		ControllerSnake control = new ControllerSnake(3);
		GameFrame frame = new GameFrame(control);
		
		
		
	}
	

	public void levelFactory() {
		ControllerSnake control = new ControllerSnake(1);
		System.out.println(control.getListEatingBehaviors().size());
	}
	

	public void MenuFrametTest() {
		MenuFrame frame = new MenuFrame();
	}

}
