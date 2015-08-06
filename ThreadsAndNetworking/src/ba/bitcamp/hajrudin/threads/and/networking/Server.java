package ba.bitcamp.hajrudin.threads.and.networking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class Server {

	private static LinkedBlockingQueue<MyClient> clients;
	private static LinkedBlockingQueue<Message> messages;
	private static ExecutorService pool = Executors.newFixedThreadPool(8);

	public static void main(String[] args) {
		clients = new LinkedBlockingQueue<MyClient>();
		messages = new LinkedBlockingQueue<Message>();
		pool.submit(new Listener());
		pool.submit(new Listener());
		pool.submit(new Listener());
		pool.submit(new Listener());
		pool.submit(new Listener());
		pool.submit(new Sender());
		pool.submit(new Sender());
		pool.submit(new Sender());

		ServerSocket server;
		try {
			server = new ServerSocket(6815);

			Socket client;

			while (true) {
				client = server.accept();
				System.out.println("Conected");
				clients.add(new MyClient(client));

				new Thread(new Listener()).start();
				new Thread(new Sender()).start();

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static class Listener implements Runnable {
		@Override
		public void run() {
			MyClient c = null;
			try {
				c = clients.take();

				BufferedReader reader = c.getReader();

				StringBuilder sb = new StringBuilder();

				while (reader.ready()) {
					sb.append(reader.readLine());
					Message msg = new Message(c.getId(), sb.toString());
					messages.add(msg);
				}
				clients.add(c);

			} catch (InterruptedException | IOException e) {
				clients.remove(c);
				e.printStackTrace();
			}
			pool.execute(this);
		}
	}

	private static class Sender implements Runnable {
		@Override
		public void run() {
			Message msg = null;
			try {
				msg = messages.take();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			MyClient[] clientArr = null;
			synchronized (clients) {
				clientArr = new MyClient[clients.size()];
				for (int i = 0; i < clientArr.length; i++) {
					try {
						clientArr[i] = clients.take();
						clients.add(clientArr[i]);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

			for (int i = 0; i < clientArr.length; i++) {
				BufferedWriter writer = clientArr[i].getWriter();
				try {
					writer.write(msg.getMessage());
					writer.flush();
				} catch (IOException e) {
					e.printStackTrace();
				}
				pool.execute(this);
			}

		}

	}

}
