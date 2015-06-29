package ba.bitcamp.hajrudin.graphics.and.painting.and.mouse.events;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PaintPanel extends JPanel{
	
	private PointArray points;
	private Color activeColor;
	private int w;
	
	private static Color[] supportedColors = new Color[] {Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE, Color.PINK};
	
	public PaintPanel(int height, int width){
		super();
		
		points = new PointArray();
		setSize(height,width);
		setBackground(Color.WHITE);
		
		for(int i=0; i<15; i++){
			JButton weight = new JButton(Integer.toString((i+1)*5));
			weight.setName(Integer.toString((i+1)*5));
			
			weight.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					JButton clicked = (JButton)e.getSource();
					String name = clicked.getName();
					w = Integer.parseInt(name);
				}
			});
			
			add(weight);
		}
		
		for(int i=0; i<supportedColors.length; i++){
			JButton color = new JButton("Pick");
			color.setName(Integer.toString(i));
			color.setForeground(supportedColors[i]);
			
			
			color.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					JButton clicked = (JButton)e.getSource();
					
					String name = clicked.getName();
					int index = Integer.parseInt(name);
					activeColor = supportedColors[index];
					
				}
			});
			
			add(color);
			addMouseMotionListener(new MouseHandler());
		}
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for(int i =0; i<points.getLength();i++){
			Point p = points.elementAt(i);
			g.setColor(p.getColor());		
			g.fillOval(p.getX(), p.getY(), p.getWeight(), p.getWeight());
		}
	}
	
	private class MouseHandler implements MouseMotionListener{

		@Override
		public void mouseDragged(MouseEvent e) {
			Point newPoint = new Point(e.getX(), e.getY(), activeColor, w);
			
			if(e.isShiftDown() == true){
				newPoint.setColor(Color.WHITE);
			}
			
			points.addPoint(newPoint);
			repaint();
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			
		}
		
	}
	
	
}
