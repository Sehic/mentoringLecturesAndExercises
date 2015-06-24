package ba.bitcamp.hajrudin.the.basic.gui.app.exercise;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Task2 extends JFrame{
	
	private JLabel text = new JLabel("Choose one");
	private JButton button1=new JButton("Exit");
	private JButton button2=new JButton("Do not exit");

	
	public Task2(){
		BorderLayout layout = new BorderLayout();
		setLayout(new BorderLayout());
		text.setHorizontalAlignment(JLabel.CENTER);
		add(text,BorderLayout.CENTER);
		add(button1,BorderLayout.SOUTH);
		add(button2,BorderLayout.NORTH);
		button1.addActionListener(new Action());
		button2.addActionListener(new Action());
		setVisible(true);
		setTitle("Task2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		Task2 Task2 = new Task2();
	}
	
	private class Action implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==button1)
			System.exit(0);
			else if(e.getSource()==button2){
				text.setText("It did not exit");
			}
		}
		
	}
	
}
