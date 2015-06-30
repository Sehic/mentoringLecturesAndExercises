package ba.bitcamp.hajrudin.timers.keyevents.and.state.machines.exercise;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Task1 extends JFrame{
	private static final long serialVersionUID = -816779960958320328L;
	
	private JLabel label = new JLabel("Focused");
	
	public Task1(){
		
		add(label);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		addFocusListener(new Focus());
		
		setTitle("Task 1");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private class Focus implements FocusListener {

		@Override
		public void focusGained(FocusEvent arg0) {
			label.setText("In focus");
		}

		@Override
		public void focusLost(FocusEvent arg0) {
			label.setText("Not in focus");
		}
	}
	
	public static void main(String[] args) {
		new Task1();
	}
}
