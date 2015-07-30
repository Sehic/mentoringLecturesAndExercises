package ba.bitcamp.hajrudin.networking.part.II;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

	public static void main(String[] args) {
		ServerSocket server;
		try {
			server = new ServerSocket(7321);
			while (true) {
				Socket client = server.accept();
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(client.getInputStream()));
				String line = "";
				String requestType = "";
				String requestRoute = "";
				while ((line = reader.readLine()) != null) {
					System.out.println(line);
					if (line.contains("GET") || line.contains("POST")) {
						String[] parts = line.split(" ");
						requestType = parts[0];
						requestRoute = parts[1];
						break;
					}
				}
				BufferedWriter writer = new BufferedWriter(
						new OutputStreamWriter(client.getOutputStream()));
				try {
					String htmlContent = FileHandler.getContent(requestRoute);
					Result.ok(writer, htmlContent);
				} catch (FileNotFoundException e) {
					Result.notFound(writer);
				} catch (IOException e1) {
					Result.serverError(writer);
				}
				client.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
