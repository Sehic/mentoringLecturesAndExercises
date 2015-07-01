package ba.bitcamp.hajrudin.basic.components.exercise;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Task7 extends JFrame{
	private static final long serialVersionUID = -5042334053184942314L;
	
	private int size = 0;
	private int x;
	private int y;
	private JSlider slider = new JSlider(0,400,0);
	private MyPanel panel = new MyPanel();
		public Task7(){
			BorderLayout layout = new BorderLayout();
			setLayout(new BorderLayout());
			
			add(slider, BorderLayout.SOUTH);
			
			add(panel);
			panel.addMouseListener(new Mouse());
			
			slider.addChangeListener(new ChangeListener() {
				@Override
				public void stateChanged(ChangeEvent e) {
					Graphics g =getGraphics();
					size=slider.getValue();
					panel.paintComponent(g);
					
				}
			});
			
			setTitle("Task 7");
			setSize(400, 600);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
		}
		
		private class Mouse implements MouseListener{

			@Override
			public void mouseClicked(MouseEvent e) {
				Graphics g =getGraphics();
				x=e.getX();
				y=e.getY();
				panel.paintComponent(g);
				
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
		
		private class MyPanel extends JPanel {
			private static final long serialVersionUID = -6302911398550823044L;
			

			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.setColor(Color.BLACK);
				g.drawOval(x-size/2, y-size/2, size, size);
			}
		}
	
	public static void main(String[] args) {
		new Task7();
	}
}
