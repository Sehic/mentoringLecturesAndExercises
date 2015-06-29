package ba.bitcamp.hajrudin.graphics.and.painting.and.mouse.events;


import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		
		JFrame window = new JFrame("Our little program");
		PaintPanel pp = new PaintPanel(500,500);
	
		
		window.add(pp);
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(500, 500);
		window.setVisible(true);
		
		
	}
}
