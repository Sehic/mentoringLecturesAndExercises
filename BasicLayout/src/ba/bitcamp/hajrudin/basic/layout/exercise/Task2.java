package ba.bitcamp.hajrudin.basic.layout.exercise;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Task2 extends JFrame{
	
	private JPanel mainPanel = new JPanel();
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JLabel[] labels = new JLabel[4];
	private JLabel label5 = new JLabel("Label 1");
	private JButton []buttons = new JButton [4];
	private JButton button = new JButton("Button 1");
	
	public Task2(){
		
		mainPanel.setLayout(new BorderLayout());
		add(mainPanel);
		
		mainPanel.add(panel1,BorderLayout.CENTER);
		panel1.setLayout(new GridLayout(4,2));
		panel1.setBorder(BorderFactory.createTitledBorder("Center panel"));
		for(int i =0; i<buttons.length; i++){
			labels[i]=new JLabel("Label"+(i+1));
			panel1.add(labels[i]);
			buttons[i]= new JButton("Button "+(i+1));
			panel1.add(buttons[i]);
		}
		
		mainPanel.add(panel2, BorderLayout.SOUTH);
		panel2.setLayout(new FlowLayout(FlowLayout.CENTER));
		panel2.setBorder(BorderFactory.createTitledBorder("South panel"));
		panel2.add(label5);
		panel2.add(button);
		
		
		setTitle("Task 2");
		setSize(400, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Task2();
	}
}
