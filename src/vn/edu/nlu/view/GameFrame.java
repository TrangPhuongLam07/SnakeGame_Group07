package vn.edu.nlu.view;
import java.awt.*;
import javax.swing.*;
import vn.edu.nlu.controller.ControllerSnake;


public class GameFrame extends JFrame implements Runnable {
	private int width;
	private int height;
	private JPanel screenGame;
	private ControllerSnake controller;
	private boolean running = true;

	public GameFrame(ControllerSnake control) {
		// set width, height
		width = control.getWidth();
		height = control.getHeight();

		setTitle("Game Snake");
		setSize(width, height);// 400 width and 500 height
		setLayout(new BorderLayout());// using no layout managers

		Container contentPane = getContentPane();
		controller = control;

		// panel run game
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		screenGame = controller.getScreenGame();

		// add panels
		panel.add(screenGame, BorderLayout.CENTER);

		contentPane.add(panel);

		// register listener
		addKeyListener(controller.getSnakeKeyHandle());

		// set up frame
		pack();
		setResizable(false);
		setLocationRelativeTo(null);// frame center screen
		setVisible(true);// making the frame visible
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// close program
//		run();
		new Thread(this).start();
	}



	public void Stop() {
		this.running = false;
	}

	@Override
	public void run() {
		boolean running = true;
		while (this.running) {
			try {
				Thread.sleep(controller.getSnake().getSpeed());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			controller.startSnake();
			repaint();
		}
	}
	
	public static void main(String[] args) {
		new GameFrame(new ControllerSnake(3));
	}

}
