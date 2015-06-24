package ba.bitcamp.hajrudin.the.basic.gui.app.exercise;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Task4 extends JFrame{
	
	
	private int counter;
	private JButton button1=new JButton("Promjeni text");
	
	String [] texts = {"Text A", "Text B", "Text C"};
	
	private JLabel text = new JLabel(texts[counter]);
	
	public Task4(){
		BorderLayout layout = new BorderLayout();
		
		text.setHorizontalAlignment(NORMAL);
		add(text, BorderLayout.CENTER);
		
		add(button1, BorderLayout.SOUTH);
		button1.addActionListener(new Action());
		
		
		setVisible(true);
		setTitle("Prozor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		Task4 Task4 = new Task4();
	}
	
	private class Action implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(counter==2)
				counter = -1;
			if(e.getSource()==button1)
				text.setText(texts[++counter]);
			
		}
		
	}
	
}
