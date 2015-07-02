package ba.bitcamp.hajrudin.basic.layout;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Task1 extends JFrame{
	private static final long serialVersionUID = 5670007315866083922L;
	
	private JPanel panel = new JPanel();
	private JButton []buttons = new JButton[5];
	
		public Task1(){
			
			panel.setLayout(new FlowLayout(FlowLayout.LEADING,0,0));
			add(panel);
			
			for(int i =0; i<buttons.length; i++){
				buttons[i] = new JButton("Button "+i);
				//buttons[i].setBorderPainted(false);
				buttons[i].setOpaque(true);
				buttons[i].setBorder(BorderFactory.createRaisedBevelBorder());
				buttons[i].setBackground(new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256)));
				panel.add(buttons[i]);
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
