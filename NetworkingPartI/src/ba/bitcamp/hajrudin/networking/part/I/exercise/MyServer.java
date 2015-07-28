package ba.bitcamp.hajrudin.networking.part.I.exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class MyServer {
	public static void main(String[] args) {
		try {
			URL url1 = new URL("http://www.vagaradio.com/Pozadine/224.jpg");
			URLConnection con = url1.openConnection();
			InputStream in = con.getInputStream();
			File file = new File("output.jpg");
			FileOutputStream fileWrite = new FileOutputStream(file);

			byte[] data = new byte[1024];
			int bytesRead;

			while ((bytesRead = in.read(data, 0, data.length)) > 0) {
				fileWrite.write(data, 0, bytesRead);
			}
			fileWrite.close();
			
			ServerSocket server = new ServerSocket(7777);
			System.out.println("Waiting for client...");
			Socket client = server.accept();
			System.out.println("Connected!");
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					client.getInputStream()));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					client.getOutputStream()));
			Scanner input = new Scanner(System.in);

			boolean end = false;
			FileOutputStream out = new FileOutputStream("output.jpg");
			//while (fileReader.ready()) {
				//writer.write(fileReader.read());
				writer.flush();
				
				
				//System.out.print("MSG: ");
				//writer.write(input.nextLine());
				//writer.newLine();
				//writer.flush();
				//System.out.println("Client: " + reader.readLine());
		//	}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
