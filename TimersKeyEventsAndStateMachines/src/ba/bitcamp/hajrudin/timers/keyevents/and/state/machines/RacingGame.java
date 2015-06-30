package ba.bitcamp.hajrudin.timers.keyevents.and.state.machines;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RacingGame extends JFrame{
	
	private static final long serialVersionUID = 1163247079327743216L;
	
	private Car myCar = new Car(800/2, 600-90, Color.BLUE);
	
	public RacingGame(){
		
		MyPanel panel = new MyPanel();
		add(panel);
		
		addKeyListener(new MyCarControl());
		requestFocus();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private class MyPanel extends JPanel {
		
		private static final long serialVersionUID = -6302911398550823044L;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			myCar.drawCar(g);;
		}
	}
	
	private class MyCarControl extends KeyAdapter{
	
		@Override
		public void keyPressed(KeyEvent e) {
			super.keyPressed(e);
			if(e.getKeyCode() == KeyEvent.VK_LEFT){
				myCar.moveLeft();
			}else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
				myCar.moveRight();
			} 
			repaint();
		}
	}
	
	public static void main(String[] args) {
		RacingGame game = new RacingGame();
	}
}