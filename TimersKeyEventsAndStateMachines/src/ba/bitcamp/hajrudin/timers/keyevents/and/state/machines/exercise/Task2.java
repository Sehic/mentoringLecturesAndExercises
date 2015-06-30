package ba.bitcamp.hajrudin.timers.keyevents.and.state.machines.exercise;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Task2 extends JFrame{
	
	private String s = "";
	private JLabel label = new JLabel(s);
	
	public Task2(){
		label.setHorizontalAlignment(NORMAL);
		add(label);
		addKeyListener(new Keyboard());
		requestFocus();
		setTitle("Task 2");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private class Keyboard implements KeyListener{

		@Override
		public void keyTyped(KeyEvent e) {
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode()==KeyEvent.VK_BACK_SPACE){
				String s1 = "";
				for(int i =0; i<s.length()-1; i++){
					s1+=s.charAt(i);
				}
				s=s1;
				label.setText(s);
				repaint();
			} else {
			s+=e.getKeyChar();
			label.setText(s);
			repaint();
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
			
		}
		
	}
	
	public static void main(String[] args) {
		new Task2();
	}
}
