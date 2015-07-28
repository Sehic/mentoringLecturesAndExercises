package ba.bitcamp.hajrudin.networking.part.I.exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		try {
			System.out.println("Client app started");
			Socket socket = new Socket("127.0.0.1",9999);
			System.out.println("Client connected to localhost");
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			System.out.println("I/O Operating aailable now");
			System.out.println(reader.readLine());
			writer.write("Nema nista");
			writer.newLine();
			writer.flush();
			
			
			Scanner input = new Scanner(System.in);
			boolean end = false;
			while(!end){
				System.out.print("MSG: ");
				writer.write(input.nextLine());
				writer.newLine();
				writer.flush();
				System.out.println("Server: "+reader.readLine());
			}
			//System.out.println("Server: "+ reader.readLine());
			//System.out.print("Msg: ");
			//writer.write(input.nextLine());
			//writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		};
	}
}
