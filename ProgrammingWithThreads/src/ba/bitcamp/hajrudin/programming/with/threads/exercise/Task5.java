package ba.bitcamp.hajrudin.programming.with.threads.exercise;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Task5 extends JFrame {

	public Task5() {

		DrawPanel panel = new DrawPanel();
		add(panel);

		setLocationRelativeTo(null);
		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Task5();
	}

	public class DrawPanel extends JPanel {
		private BufferedImage image;

		public DrawPanel() {
			try {
				image = ImageIO.read(new File("pic.jpg"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		public void paintComponent(Graphics g) {

			g.drawImage(image, 3, 4, this);
		}
	}
}
