package ba.bitcamp.hajrudin.networking.part.II.exercise;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Normal {
	public static void main(String[] args) {
		ServerSocket server;
		try {
			server = new ServerSocket(1111);
			while (true) {
				System.out.println("Waiting for client...");
				Socket client = server.accept();
				System.out.println("Connected!");
				BufferedWriter clientWriter = new BufferedWriter(
						new OutputStreamWriter(client.getOutputStream()));

				File file1 = new File("statistika.txt");
				if (!file1.exists()) {
					file1.createNewFile();
				}
				BufferedWriter fileWriter = new BufferedWriter(new FileWriter(
						file1));
				fileWriter.write("Client IP: "
						+ client.getInetAddress().getHostAddress() + "\n");
				fileWriter.newLine();
				fileWriter.close();
				java.io.OutputStream writer = client.getOutputStream();
				FileInputStream clientReader = new FileInputStream(new File(
						"test.txt"));
				
				byte[] buffer = new byte[1024];
				int readBytes;

				while ((readBytes = clientReader.read(buffer, 0, buffer.length)) > 0) {
					writer.write(buffer, 0, readBytes);
				}
				
				writer.close();
				client.close();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
