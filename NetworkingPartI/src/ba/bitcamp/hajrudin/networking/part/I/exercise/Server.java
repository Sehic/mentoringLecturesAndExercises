package ba.bitcamp.hajrudin.networking.part.I.exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) {
		try {
			System.out.println("App started");
			ServerSocket server = new ServerSocket(9999);
			System.out.println("Server socket made");
			
			System.out.println("Listening for a client..");
			Socket client = server.accept();
			System.out.println("Client found!");
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			System.out.println("I/O Operating aailable now");
			writer.write("Sta ima?");
			writer.newLine();
			writer.flush();
			System.out.println(reader.readLine());
			Scanner input = new Scanner(System.in);
			
			boolean end = false;
			while(!end){
				System.out.print("MSG: ");
				writer.write(input.nextLine());
				writer.newLine();
				writer.flush();
				System.out.println("Client: "+reader.readLine());
			}
			
			
			System.out.print("Msg: ");
			writer.write(input.nextLine());
			writer.flush();		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
