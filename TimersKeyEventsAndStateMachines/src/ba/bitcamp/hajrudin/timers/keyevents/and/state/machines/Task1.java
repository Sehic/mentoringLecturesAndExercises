package ba.bitcamp.hajrudin.timers.keyevents.and.state.machines;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Timer;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Task1 extends JFrame {

	private static final long serialVersionUID = 1768622520288875585L;

	private int s = 0;
	private Font font = new Font("NewFont", Font.BOLD, 99);

	public Task1() {
		
		
		
		MyPanel panel = new MyPanel();
		add(panel);
		
		panel.addMouseListener(new Mouse());
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
			g.setFont(font);
			g.drawString(String.valueOf(s), 100, 100);
			g.drawString(String.valueOf(s), 100, 200);
		}
	}
	
	
	private class Mouse implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			s++;
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
		Task1 task1 = new Task1();
	}

}
