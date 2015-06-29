package ba.bitcamp.hajrudin.graphics.and.painting.and.mouse.events.exercise;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Task2 extends JFrame{
	
	
	public Task2(){
		
		MyPanel p = new MyPanel();
		add(p);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 200);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private class MyPanel extends JPanel {
			private static final long serialVersionUID = -6302911398550823044L;

			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				Graphics2D g2d = (Graphics2D) g;
				g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
				g2d.setStroke(new BasicStroke(10));
				g2d.drawLine(0, 0, getWidth(), getHeight());
				g2d.drawLine(0, getHeight(), getWidth(), 0);
			}
		}
	
	public static void main(String[] args) {
		Task2 task2 = new Task2();
	}
}
