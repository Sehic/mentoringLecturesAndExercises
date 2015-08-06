package ba.bitcamp.hajrudin.threads.exercise;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	
	
	
	public static void main(String[] args) {
		ClientGUI cGUI = new ClientGUI();
		
		Socket client = null;
		try {
			client = new Socket("localhost", 9999);
		} catch (UnknownHostException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					client.getOutputStream()));
			while (true) {
				
				writer.write(cGUI.getM());
				writer.newLine();
				writer.write(cGUI.getN());
				writer.newLine();
				writer.flush();

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
