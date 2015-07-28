package ba.bitcamp.hajrudin.exercise.networking.part.I;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class Mapa {
	public static void main(String[] args) throws FileNotFoundException {
		HashMap<String, String> map = new HashMap<String, String>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(
					"file.txt"));
			while (reader.ready()) {
				String s = reader.readLine();
				String[] arr = s.split(" ");
				map.put(arr[0], arr[1]);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ServerSocket server;
		Socket socketZaid;
		Socket randomSocket = null;
		String s = "";
		try {
			server = new ServerSocket(8888);
			System.out.println("Waiting for a client..");
			Socket client = server.accept();
			System.out.println("Client found!");
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					client.getInputStream()));
			String p = reader.readLine();
			System.out.println(p);
			reader.close();

			while (true) {
				try {
					s += getIP(map);
					randomSocket = new Socket(s, 8888);
					System.out.println(map.get(s));
					break;
				} catch (ConnectException e1) {
					System.out.println("Not found");
				}
				
			}
			BufferedWriter writer1 = new BufferedWriter(new OutputStreamWriter(
					randomSocket.getOutputStream()));
			Scanner input = new Scanner(System.in);
			String s1 = input.nextLine();
			writer1.write(p + s1);
			writer1.newLine();
			writer1.close();

			socketZaid = new Socket("10.0.82.98", 8888);
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					socketZaid.getOutputStream()));
			writer.write(p + s1);
			writer.newLine();
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static String getIP(HashMap<String, String> map) {
		Collection<String> set = map.keySet();
		Object[] arr = set.toArray();
		return (String) arr[(int) (Math.random() * arr.length)];
	}
}
