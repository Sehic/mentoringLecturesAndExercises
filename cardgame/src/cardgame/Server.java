package cardgame;

import java.io.*;
import java.net.*;

public class Server {
	private static Socket[] players = new Socket[2];

	public static void main(String[] args) throws IOException {

		final int port = 1111;
		System.out.println("Server waiting for connection on port " + port);
		ServerSocket ss = new ServerSocket(port);
		players[0] = ss.accept();
		players[1] = ss.accept();
		// System.out.println("Recieved connection from "
		// + clientSocket.getInetAddress() + " on port "
		// + clientSocket.getPort());
		// create two threads to send and recieve from client
		// RecieveFromClientThread recieve = new RecieveFromClientThread(
		// clientSocket);
		// Thread thread = new Thread(recieve);
		// thread.start();

		SendToClientThread send = new SendToClientThread(players[0]);
		SendToClientThread send1 = new SendToClientThread(players[1]);
		Thread thread2 = new Thread(send);
		Thread thread3 = new Thread(send1);
		thread2.start();
		try {
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread3.start();
		try {
			thread3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class RecieveFromClientThread implements Runnable {
	Socket clientSocket = null;
	BufferedReader brBufferedReader = null;

	public RecieveFromClientThread(Socket clientSocket) {
		this.clientSocket = clientSocket;
	}// end constructor

	public void run() {
		try {
			brBufferedReader = new BufferedReader(new InputStreamReader(
					this.clientSocket.getInputStream()));

			String messageString;
			while (true) {
				while ((messageString = brBufferedReader.readLine()) != null) {// assign
																				// message
																				// from
																				// client
																				// to
																				// messageString
					if (messageString.equals("EXIT")) {
						break;// break to close socket if EXIT
					}
					System.out.println("From Client: " + messageString);// print
																		// the
																		// message
																		// from
																		// client
					System.out
							.println("Please enter something to send back to client..");
				}
				this.clientSocket.close();
				System.exit(0);
			}

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}// end class RecieveFromClientThread

class SendToClientThread implements Runnable {
	PrintWriter pwPrintWriter;
	Socket clientSock = null;
	private static Deck d = new Deck();

	public SendToClientThread(Socket clientSock) {
		this.clientSock = clientSock;
		d.shuffle();
	}

	public void run() {
		try {
			pwPrintWriter = new PrintWriter(new OutputStreamWriter(
					this.clientSock.getOutputStream()));// get outputstream

			while (true) {
				String msgToClientString = null;
				BufferedReader input = new BufferedReader(
						new InputStreamReader(System.in));// get userinput
				String s = "";
				for (int i = 0; i < 5; i++) {
					Card c = d.getCards().get(i);
					CardData cd = c.getCardData();
					s += cd.getSuit() + "," + cd.getValue();
					
					// get message to send to
				} // client
					
				pwPrintWriter.println(s);// send message to
											// client with
											// PrintWriter
				pwPrintWriter.flush();// flush the PrintWriter
				clientSock.close();
				// System.out
				// .println("Please enter something to send back to client..");
			}// end while
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}// end run
}// end class SendToClientThread

