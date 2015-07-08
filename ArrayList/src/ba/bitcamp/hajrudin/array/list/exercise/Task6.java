package ba.bitcamp.hajrudin.array.list.exercise;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Task6 extends JFrame{
	
	private JPanel panel = new JPanel();
	
	public Task6(){
		add(panel);
		panel.setLayout(new GridLayout(40,1));
		
		for(int i = 0; i<40; i++){
			JLabel label = new JLabel("Text");
			label.setFont(new Font("AA", Font.PLAIN, i));
			panel.add(label);
		}
		
		setTitle("Task 6");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Task6();
	}

}
