package ba.bitcamp.hajrudin.graphics.and.painting.and.mouse.events;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicTabbedPaneUI.MouseHandler;

public class DrawPanel extends JPanel{
	
	private Color bcColor = Color.RED;
	
	public DrawPanel(int height, int width){
		setSize(height,width);
		JButton blue = new JButton("Blue");
		
		blue.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				bcColor = Color.BLUE;
			}
		});
		
		add(blue);
		addMouseListener(new MouseHandler());
		addMouseMotionListener(new MouseHandler());
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(bcColor);
		g.fillOval(20, 20, 10, 10);
		
		
	}
	
	
	public void drawSquare(){
		
		Graphics g = super.getGraphics();
		
		g.fillRect(50, 50, 100, 100);
		
	}
	
	private class MouseHandler implements MouseListener, MouseMotionListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			Graphics g = getGraphics();
			g.fillOval(e.getX(), e.getY(), 20, 20);
		}

		@Override
		public void mousePressed(MouseEvent e) {
			System.out.println("Mouse pressed");
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			System.out.println("Mouse released");
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			Graphics g = getGraphics();
			g.setColor(bcColor);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			Graphics g = getGraphics();
			g.setColor(Color.BLACK);
			
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			Graphics g = getGraphics();
			g.fillOval(e.getX(), e.getY(), 20, 20);
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			Graphics g = getGraphics();
			g.fillOval(e.getX(), e.getY(), 20, 20);
		}
		
	}
	
}
