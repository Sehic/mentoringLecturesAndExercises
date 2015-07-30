package ba.bitcamp.hajrudin.introduction.to.threads.exercise;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Socket client = null;
		try {
			client = new Socket("10.0.82.40",3333);
		} catch (UnknownHostException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			Scanner in = new Scanner(System.in);
			while(true){
				
				writer.write(in.nextLine());
				writer.newLine();
				writer.flush();
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
