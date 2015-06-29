package ba.bitcamp.hajrudin.graphics.and.painting.and.mouse.events.exercise;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Task7 extends JFrame{
	
	private int[] arr = {10,20,0,30,40,60,10,50};
	
	
	public Task7(){
		MyPanel panel = new MyPanel();
		add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private class MyPanel extends JPanel {
		private static final long serialVersionUID = -6302911398550823044L;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			int temp = 20;
			for(int i =0; i<arr.length;i++){
				g.fillRect(temp, 100-arr[i], 30, arr[i]);
				temp+=31;
			}
		}
	}
	
	public static void main(String[] args) {
		Task7 task7 = new Task7();
	}
}
