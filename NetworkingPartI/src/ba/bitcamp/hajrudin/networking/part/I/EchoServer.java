package ba.bitcamp.hajrudin.networking.part.I;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public static final int ECHO_PORT = 12345;

	public static void main(String[] args) {
		ServerSocket server;
		try {
			server = new ServerSocket(ECHO_PORT);
			while (true) {
				System.out.println("Waiting for next request");
				Socket clientSocket = server.accept();
				System.out.println("Request accepted, writing response..");
				OutputStream os = clientSocket.getOutputStream();
				OutputStreamWriter ow = new OutputStreamWriter(os);
				ow.write("OK");
				ow.flush();
				System.out.println("Response flushed, closing connection..");
				ow.close();
				clientSocket.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
