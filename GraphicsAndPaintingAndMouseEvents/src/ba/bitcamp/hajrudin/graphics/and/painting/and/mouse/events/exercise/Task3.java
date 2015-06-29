package ba.bitcamp.hajrudin.graphics.and.painting.and.mouse.events.exercise;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Task3 extends JFrame{
	
	private String s = "";
	
	public Task3(){
		
		MyPanel panel = new MyPanel();
		add(panel);
		addMouseListener(new Mouse());
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
	
	private class Mouse implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			if(e.getButton()==1){
				s="Last pressed: Left";
			} else if(e.getButton()==3){
				s="Last pressed: Right";
			} else {
				s="Last pressed: Middle";
			}
			repaint();
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public static void main(String[] args) {
		Task3 task3 = new Task3();
	}
}
