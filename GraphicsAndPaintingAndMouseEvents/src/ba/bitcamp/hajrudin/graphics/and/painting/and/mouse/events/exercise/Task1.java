package ba.bitcamp.hajrudin.graphics.and.painting.and.mouse.events.exercise;

import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Task1 extends JFrame{

	private static final long serialVersionUID = -6141746459883764297L;
		
	private JLabel label = new JLabel("Not cicked...");
	private Font font = new Font("Aaa", Font.BOLD, 20);
	
		public Task1(){
			
			label.setHorizontalAlignment(NORMAL);
			add(label);
			addMouseListener(new Mouse());
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(200, 200);
			setLocationRelativeTo(null);
			setVisible(true);
		}
		
		private class Mouse implements MouseListener{

			@Override
			public void mouseClicked(MouseEvent e) {
				label.setFont(font);
				label.setText("It is clicked!");
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		}
	
	
	public static void main(String[] args) {
		Task1 task1 = new Task1();
	}
}
