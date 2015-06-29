package ba.bitcamp.hajrudin.graphics.and.painting.and.mouse.events.exercise;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Task6 extends JFrame{
	
	private MyPanel panel = new MyPanel();
	private String s = "";
	
	public Task6(){
		
		
		add(panel);
		panel.addMouseMotionListener(new Mouse());
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
			g.drawString(s, 20,20);
		}
	}
	

	private class Mouse implements MouseMotionListener{

		@Override
		public void mouseDragged(MouseEvent e) {
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			s="X: "+Integer.toString(e.getXOnScreen())+" Y: "+Integer.toString(e.getYOnScreen());
			repaint();
		}
		
	}
	
	
	public static void main(String[] args) {
		Task6 task6 = new Task6();
	}
}
