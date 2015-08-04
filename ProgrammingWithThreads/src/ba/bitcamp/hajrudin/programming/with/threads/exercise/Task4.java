package ba.bitcamp.hajrudin.programming.with.threads.exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Task4 {
	public static void main(String[] args) {
		try {
			ServerSocket selver = new ServerSocket(9999);
			Socket client = selver.accept();
			Thread t = new Thread(new MyThread(client));
			t.start();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static class MyThread implements Runnable {
		Socket client;

		public MyThread(Socket client) {
			this.client = client;
		}

		@Override
		public void run() {
			try {
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(client.getInputStream()));
				String s = convert(reader.readLine());
				BufferedWriter writer = new BufferedWriter(new FileWriter(
						new File("logger.txt"), true));
				if (s != "")
					writer.write(s);
				else
					writer.write("Pogresan unos");
				writer.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		private String convert(String readLine) {
			String[] arr = readLine.split(" ");
			switch (arr[0]) {
			case "1":
				return "Temperature" + arr[1] + " C";
			case "2":
				return "Presure" + arr[1] + " hP";
			case "3":
				return "Movement " + arr[1];
			case "4":
				return "Error " + readLine.substring(1, readLine.length());
			default:
				return "";
			}
		}

	}
}
