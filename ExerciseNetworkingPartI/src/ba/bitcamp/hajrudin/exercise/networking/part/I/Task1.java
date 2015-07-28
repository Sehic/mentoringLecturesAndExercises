package ba.bitcamp.hajrudin.exercise.networking.part.I;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Task1 {
	public static void main(String[] args) {
		Socket socket;
		try {
			socket = new Socket("10.0.82.98", 8888);
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream()));
			writer.write("Hajrudin");
			writer.newLine();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
