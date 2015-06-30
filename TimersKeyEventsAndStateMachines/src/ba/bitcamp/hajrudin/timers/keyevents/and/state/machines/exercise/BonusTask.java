package ba.bitcamp.hajrudin.timers.keyevents.and.state.machines.exercise;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BonusTask extends JFrame{
	
		private MyPanel panel = new MyPanel();
		
	public BonusTask(){
		
		
		add(panel);
		setTitle("Bonus Task");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private class MyPanel extends JPanel {
		private static final long serialVersionUID = -6302911398550823044L;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			//g.fillRect(x, y, 30, 30);
		}
	}
	
	private class Action implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {	
		
	}
	}
	
	private class Keyboard implements KeyListener{

		@Override
		public void keyTyped(KeyEvent e) {
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			
		}
		
	}
	
	public static void main(String[] args) {
		new BonusTask();
	}
}
