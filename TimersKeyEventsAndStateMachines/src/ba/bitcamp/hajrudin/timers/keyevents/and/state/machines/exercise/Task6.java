package ba.bitcamp.hajrudin.timers.keyevents.and.state.machines.exercise;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Task6 extends JFrame {
	private MyPanel panel = new MyPanel();
	private int x = 135;
	private int y = 250;
	private int temp = y;
	public Task6() {

		add(panel);
		addKeyListener(new Keyboard());
		requestFocus();
		setTitle("Task6");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private class MyPanel extends JPanel {
		private static final long serialVersionUID = -6302911398550823044L;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLACK);
			g.fillRect(x, y, 30, 30);
		}
	}

	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(y>10){
				y--;
			}
			repaint();
		}
	}

	private class Keyboard implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {

		}

		@Override
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode()==KeyEvent.VK_SPACE){
				Timer t = new Timer(10, new Action());
				t.start();
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {

		}

	}

	public static void main(String[] args) {
		new Task6();
	}
}
