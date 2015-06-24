package ba.bitcamp.hajrudin.the.basic.gui.app.exercise;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main extends JFrame{
	
	private static final long serialVersionUID = -9000859072858187098L;

	
	private JLabel text = new JLabel("Ovo je neki text");
	
	private JButton dugme1=new JButton("Exit");
	private JButton dugme2=new JButton("Left");
	private JButton dugme3=new JButton("Right");
	
	
	public Main(){
		BorderLayout layout = new BorderLayout();
		setLayout(new BorderLayout());
		add(text);
		add(dugme1,BorderLayout.SOUTH);
		add(dugme2,BorderLayout.WEST);
		add(dugme3,BorderLayout.EAST);
		
		dugme1.addActionListener(new Action());
		dugme2.addActionListener(new Action());
		dugme3.addActionListener(new Action());
		
		setVisible(true);
		setTitle("Prozor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setLocationRelativeTo(null);
	}
	
	
	public static void main(String[] args) {
		Main prozor = new Main();
		
	
	}
	
	private class Action implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==dugme1)
			System.exit(0);
			else if(e.getSource()==dugme2){
				text.setText("Pritisnuo si lijevo");
			} else if(e.getSource()==dugme3){
				text.setText("Pritisnuo si desno");
			}
			
		}
		
	}
	
}
