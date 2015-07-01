package ba.bitcamp.hajrudin.basic.components.exercise;

import java.awt.Checkbox;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Task2 extends JFrame{
	
	private Font f = new Font("", Font.PLAIN, 15);
	private Checkbox box1 = new Checkbox("Italic");
	private Checkbox box2 = new Checkbox("Bold");
	private JLabel label = new JLabel("Neki tekst");
	private JButton button = new JButton("Apply");
	
	public Task2(){
		setLayout(new GridLayout(4, 1, 5, 5));
		label.setFont(f);
		add(label);
		
		add(box1);
		add(box2);
		
		add(button);
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(box1.getState()==true && box2.getState()==false){
					label.setFont(new Font("", Font.ITALIC, 15));
				}else if (box1.getState()==false && box2.getState()==true){
					label.setFont(new Font("", Font.BOLD, 15));
				}else if(box1.getState()==true && box2.getState()==true){
					label.setFont(new Font("", Font.BOLD | Font.ITALIC, 15));
				}else{
					label.setFont(new Font("", Font.PLAIN, 15));
				}
			}
		});
		
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
