package ba.bitcamp.hajrudin.networking.part.I.exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Project {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9393);
			Socket fromBoki = server.accept();
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					fromBoki.getInputStream()));
			String msg = reader.readLine();
			System.out.println("From Boki: " + msg);

			Socket socket = new Socket("10.0.82.31", 1921);
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream()));
			writer.write(msg);
			System.out.println("SENT");
			writer.newLine();
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
