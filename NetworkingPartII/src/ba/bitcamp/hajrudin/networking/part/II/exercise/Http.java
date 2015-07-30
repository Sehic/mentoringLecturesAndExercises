package ba.bitcamp.hajrudin.networking.part.II.exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Http {
	public static void main(String[] args) {
		ServerSocket server = null;
		try {
			server = new ServerSocket(7777);
			Socket client = server.accept();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String address = "public/statistika.html";
		String htmlDoc = "";
		BufferedReader fileReader;
		try {
			fileReader = new BufferedReader(new FileReader(address));
			while (fileReader.ready()) {
			htmlDoc += fileReader.readLine();
			fileReader = new BufferedReader(new FileReader("statistika.txt"));
			while(fileReader.ready()){
				htmlDoc += fileReader.readLine()+ "<br>\n";
			}
			htmlDoc += "</p></body></html>";
		}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
