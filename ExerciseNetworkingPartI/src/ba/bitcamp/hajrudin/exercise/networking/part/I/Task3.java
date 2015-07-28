package ba.bitcamp.hajrudin.exercise.networking.part.I;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;


public class Task3 {
	public static void main(String[] args) {
		Socket socket;
		try {
			socket = new Socket("10.0.82.98", 7777);
			FileOutputStream file = new FileOutputStream(new File("file.txt"));
			java.io.InputStream in = socket.getInputStream();
			byte[] data = new byte[1024];
			int bytesRead;

			while ((bytesRead = in.read(data, 0, data.length)) > 0) {
				file.write(data, 0, bytesRead);
			}
			file.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
