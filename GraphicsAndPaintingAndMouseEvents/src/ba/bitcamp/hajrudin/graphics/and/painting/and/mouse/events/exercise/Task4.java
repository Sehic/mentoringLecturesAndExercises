package ba.bitcamp.hajrudin.graphics.and.painting.and.mouse.events.exercise;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Task4 extends JFrame{
	
	
	
	private JLabel label = new JLabel("LABEL");
	private Font font = new Font("Aa", Font.TYPE1_FONT, 25);
	private Font font1 = new Font("Bb", Font.BOLD, 50);
	
	public Task4(){
		
		label.setHorizontalAlignment(NORMAL);
		label.setFont(font);
		add(label);
		addMouseListener(new Mouse());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 200);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private class Mouse implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			label.setForeground(Color.BLUE);
			repaint();
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			label.setForeground(Color.BLACK);
			repaint();
		}

		@Override
		public void mousePressed(MouseEvent e) {
			label.setFont(font1);
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			label.setFont(font);
		}
	}
	
	public static void main(String[] args) {
		Task4 task4 = new Task4();
	}
}
