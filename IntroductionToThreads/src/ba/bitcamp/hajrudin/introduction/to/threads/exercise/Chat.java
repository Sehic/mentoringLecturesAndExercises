package ba.bitcamp.hajrudin.introduction.to.threads.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Chat {
	public static void main(String[] args) {
		ServerSocket selver;
		try {
			selver = new ServerSocket(9999);
			while (true) {
				Socket client = selver.accept();
				MyThread t = new MyThread(client);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static class MyThread implements Runnable {

		private Socket client;

		public MyThread(Socket client) {
			this.client = client;
			Thread t = new Thread(this);
			t.start();
		}

		@Override
		public void run() {
			while (true) {
				try {
					BufferedReader reader = new BufferedReader(
							new InputStreamReader(client.getInputStream()));
					while (reader.ready()) {
						System.out.println(reader.readLine());
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
