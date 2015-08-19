package ba.bitcamp.hajrudin.http.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class HtmlServer {

	private static ServerSocket server;
	private static String webPage;

	public static void loadWebsite() {
		webPage = "";
		try {
			BufferedReader reader = new BufferedReader(new FileReader(
					"exercise.html"));
			while (reader.ready()) {
				webPage += reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Web loaded.");
	}

	public static void startServer() {
		try {
			server = new ServerSocket(9999);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Server started");
	}

	public static void findClients() {
		try {
			Socket client = server.accept();
			new ClientThread(client);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Client accepted");

	}

	public static class ClientThread extends Thread {

		private static Socket client;
		private static BufferedWriter writer;

		public ClientThread(Socket c) {
			this.client = c;
			try {
				this.writer = new BufferedWriter(new OutputStreamWriter(
						client.getOutputStream()));
			} catch (IOException e) {
				e.printStackTrace();
			}
			start();
		}

		@Override
		public void run() {
			try {
				writer.write(webPage);
				writer.newLine();
				writer.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		loadWebsite();
		startServer();
		while (true) {
			findClients();
		}
	}

}
