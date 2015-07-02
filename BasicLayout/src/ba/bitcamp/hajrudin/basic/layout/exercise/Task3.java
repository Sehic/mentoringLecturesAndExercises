package ba.bitcamp.hajrudin.basic.layout.exercise;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Task3 extends JFrame{
	
	private JPanel mainPanel = new JPanel();
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JPanel panel3 = new JPanel();
	private JPanel panel4 = new JPanel();
	private JButton button1 = new JButton("Button 1");
	private JButton button2 = new JButton("Button 2");
	private JLabel label1 = new JLabel("This seems to be label 1");
	private JLabel label2 = new JLabel("This seems to be label 2");
	private JLabel label3 = new JLabel("This seems to be label 3");
	private JTextArea text = new JTextArea();
	
	public Task3(){
		
		mainPanel.setLayout(new BorderLayout());
		add(mainPanel);
		
		mainPanel.add(panel1, BorderLayout.CENTER);
		panel1.setBorder(BorderFactory.createTitledBorder("Center panel"));
		panel1.setLayout(new BorderLayout());
		panel1.add(text, BorderLayout.CENTER);
		
		mainPanel.add(panel2, BorderLayout.EAST);
		panel2.setLayout(new BorderLayout());
		
		panel2.add(panel3,BorderLayout.NORTH);
		panel3.setBorder(BorderFactory.createTitledBorder("Panel1"));
		panel3.setLayout(new GridLayout(3, 1));
		panel3.add(label1);
		panel3.add(label2);
		panel3.add(label3);
		
		panel2.add(panel4,BorderLayout.SOUTH);
		panel4.setBorder(BorderFactory.createTitledBorder("Panel 2"));
		panel4.setLayout(new GridLayout(1,2));
		panel4.add(button1);
		panel4.add(button2);
		
		setTitle("Task 3");
		setSize(400, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Task3();
	}
}
