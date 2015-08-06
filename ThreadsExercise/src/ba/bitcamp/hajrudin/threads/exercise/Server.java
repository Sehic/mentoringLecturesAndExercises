package ba.bitcamp.hajrudin.threads.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	static ServerSocket server;
	static Socket client;
	private static ServerGUI sGUI;
	private static int m = 0;
	private static int n = 0;

	public static void main(String[] args) {
		sGUI = new ServerGUI();
		try {
			server = new ServerSocket(9999);
			System.out.println("Waiting for client");
			client = server.accept();
			System.out.println("Request accepted, writing response..");
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					client.getInputStream()));

			while (true) {
				String s = reader.readLine();
				if (s != "" && s != null) {
						m = Integer.parseInt(s);
						s = reader.readLine();
						if (s != "" && s != null) {
						n = Integer.parseInt(s);
						}
						sGUI.paintNew(m, n);
					}
				}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
