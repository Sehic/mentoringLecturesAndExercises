package ba.bitcamp.hajrudin.the.basic.gui.app.exercise;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Task3 extends JFrame{
	
	private static final long serialVersionUID = -5521460920289474896L;

	Font f = new Font("Calibri", 0, 16);
	Font f1 = new Font("Cambria", Font.BOLD, 18);
	
	private JButton button1 = new JButton("Button1");
	private JButton button2 = new JButton("Button2");
	
	private JLabel text = new JLabel("Press one to disable other...");
	
	private int counter;
	
	public Task3(){
		BorderLayout layout = new BorderLayout();
		setLayout(new BorderLayout());
		
		button1.setFont(f);
		button2.setFont(f);
		text.setFont(f1);
		
		text.setHorizontalAlignment(NORMAL);
		add(text,BorderLayout.CENTER);
		add(button1,BorderLayout.NORTH);
		button1.setEnabled(false);
		add(button2, BorderLayout.SOUTH);
		button1.addActionListener(new Action());
		button2.addActionListener(new Action());
		
		setVisible(true);
		setTitle("Prozor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		Task3 Task3 = new Task3();
	}
	
	private class Action implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==button1){
				button1.setEnabled(false);
				button2.setEnabled(true);
				counter++;
			}
			else if(e.getSource()==button2){
				button2.setEnabled(false);
				button1.setEnabled(true);
				counter++;
			}
			if(counter>5)
				System.exit(0);
			}
			
		}
		
	
}
