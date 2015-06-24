package ba.bitcamp.hajrudin.the.basic.gui.app.exercise;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Task1 extends JFrame{
	
	private static final long serialVersionUID = 7937483512622045353L;

	private JLabel text = new JLabel("Hello world");
	private JButton dugme1=new JButton("Hello");

	
	public Task1(){
		BorderLayout layout = new BorderLayout();
		setLayout(new BorderLayout());
		text.setHorizontalAlignment(JLabel.CENTER);
		add(text,BorderLayout.CENTER);
		add(dugme1,BorderLayout.SOUTH);
		dugme1.addActionListener(new Action());
		setVisible(true);
		setTitle("Task1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setLocationRelativeTo(null);
	}


	public static void main(String[] args) {
		Task1 Task1 = new Task1();
	}
	
	private class Action implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==dugme1){
				JOptionPane.showMessageDialog(null, "Hello");
				System.exit(0);
				}
			}
			
			
			
		}
		
	
}
