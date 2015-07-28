package ba.bitcamp.hajrudin.networking.part.I.exercise;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Task1 {
	public static void main(String[] args) {
		URL url1 = null;
		try {
			url1 = new URL("http://www.vagaradio.com/Pozadine/224.jpg");
		} catch (MalformedURLException e) {
			System.out.println("Bad URL");
			System.exit(1);
			e.printStackTrace();
		}
		ImageIcon image = new ImageIcon(url1);
		JFrame frame = new JFrame();
		frame.add(new JLabel(image));
		frame.setSize(800, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		try {
			BufferedImage img = ImageIO.read(url1);
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			URLConnection con = url1.openConnection();
			System.out.println(con.getContent());

			InputStream in = con.getInputStream();
			File file = new File("output.jpg");
			FileOutputStream fileWrite = new FileOutputStream(file);

			byte[] data = new byte[1024];
			int bytesRead;

			while ((bytesRead = in.read(data, 0, data.length)) > 0) {
				fileWrite.write(data, 0, bytesRead);
			}
			fileWrite.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
