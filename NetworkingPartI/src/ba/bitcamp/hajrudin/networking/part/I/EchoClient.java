package ba.bitcamp.hajrudin.networking.part.I;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class EchoClient {
	public static final String HOST = "localhost";
	
	public static void main(String[] args) {
		try {
			Socket client = new Socket("localhost", EchoServer.ECHO_PORT);
			InputStream is = client.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			System.out.println(br.readLine());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
