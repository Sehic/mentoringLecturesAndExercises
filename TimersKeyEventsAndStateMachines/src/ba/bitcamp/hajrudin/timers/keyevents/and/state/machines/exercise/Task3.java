package ba.bitcamp.hajrudin.timers.keyevents.and.state.machines.exercise;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Task3 extends JFrame{
	
	private int temp = 0;
	private MyPanel panel = new MyPanel();
	private int x=0;
	private int y=0;
	
		public Task3(){
			add(panel);
			
			Timer t = new Timer(10, new Action());
			t.start();
			
			setTitle("Task 3");
			setSize(400, 300);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
		}
		
		private class MyPanel extends JPanel {
			private static final long serialVersionUID = -6302911398550823044L;

			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.fillRect(x, y, 30, 30);
			}
		}
		
		private class Action implements ActionListener {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(temp==1){
					x+=1;
					y-=1;
					if(y<0){	
						temp=3;
					}else if(x>=getWidth()-30){	
						temp=0;
					}
					
				}else if(temp==2){
					x-=1;
					y+=1;
					if(x<=0){	
						temp=0;
					}
					else if(y>=getHeight()-30){
						temp=3;
					}
				}else if(temp==0){
				x+=1;
				y+=1;
				if(x>=getWidth()-30){
					temp = 2;
				} 
				else if(y>=getHeight()-30){
					temp = 1;
				}
				} else if(temp==3){
					x-=1;
					y-=1;
					if(x<=0){
						temp = 1;
					} 
					else if(y<=0){
						temp = 2;
					}	
				}
				panel.repaint();
			}
			
		}
		
	public static void main(String[] args) {
		new Task3();
	}
}
