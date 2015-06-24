package ba.bitcamp.hajrudin.the.basic.gui.app.exercise;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


//Program nije uradjen do kraja

public class Task5 extends JFrame{

	private static final long serialVersionUID = 8057892128167856785L;
	
	private char c = ' ';
	String s = "Neki_text";
	private JButton button1=new JButton("REMOVE");
	private JButton button2=new JButton(">");
	private JButton button3=new JButton("<");
	
	
	public JLabel text = new JLabel(s);
	
	public Task5(){
		BorderLayout layout = new BorderLayout();
		
		text.setHorizontalAlignment(NORMAL);
		text.setFont(new Font("Courier New", Font.BOLD, 18));
		add(text, BorderLayout.CENTER);
		
		add(button1, BorderLayout.SOUTH);
		button1.addActionListener(new Action());
		
		add(button2, BorderLayout.EAST);
		button2.addActionListener(new Action());
		
		add(button3, BorderLayout.WEST);
		button3.addActionListener(new Action());
		
		setVisible(true);
		setTitle("Prozor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		Task5 Task5 = new Task5();
	}
	
	private class Action implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			char c1 = '_';
			String s1="";
			if(e.getSource()==button1){
				for(int i=0;i<s.length();i++){
					if(s.charAt(i)=='_'){
						i+=1;
						c=s.charAt(i);
						s1+=c1;
					} else {
					s1+=s.charAt(i);
					}
				}
				s=s1;
				text.setText(s);
				} else if(e.getSource()==button2){
					for(int i=0;i<s.length();i++){
						if(s.charAt(i)=='_'){
							s1+=c;
							i=i+1;
							c=s.charAt(i);
							s1+="_";
						}else {
							s1+=s.charAt(i);
						}
					}
					s=s1;
					text.setText(s);
				} else if(e.getSource()==button3){
					for(int i=s.length()-1;i>=0;i--){
						if(s.charAt(i)=='_'){
							s1=c+s1;
							i=i-1;
							c=s.charAt(i);
							s1="_"+s1;
						}else {
							s1=s.charAt(i)+s1;
						}
					}
					s=s1;
					text.setText(s);
				}
			
			
		}
		
	}
}
