package ba.bitcamp.hajrudin.basic.layout.exercise;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Task1 extends JFrame{
	private static final long serialVersionUID = -1186953543642654783L;
	
	private JPanel mainPanel = new JPanel();
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JLabel label1 = new JLabel("Label 1");
	private JLabel label2 = new JLabel("Label 2");
	private JButton []buttons = new JButton [9];
	private JTextArea text = new JTextArea();
	
	public Task1(){
		
		mainPanel.setLayout(new GridLayout(1,2));
		add(mainPanel);
		
		mainPanel.add(panel1);
		panel1.setBorder(BorderFactory.createTitledBorder("Panel 1"));
		panel1.setLayout(new BorderLayout());
		panel1.add(label2,BorderLayout.NORTH);
		panel1.add(text, BorderLayout.CENTER);
		panel1.add(label1, BorderLayout.SOUTH);
		
		mainPanel.add(panel2);
		panel2.setBorder(BorderFactory.createTitledBorder("Panel 2"));
		panel2.setLayout(new GridLayout(3,3));
		
		for(int i = 0; i<buttons.length; i++){
			buttons[i]= new JButton("Button "+(i+1));
			panel2.add(buttons[i]);
		}
		
		setTitle("Task 1");
		setSize(400, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);	
	}
	
	public static void main(String[] args) {
		new Task1();
	}
}	
