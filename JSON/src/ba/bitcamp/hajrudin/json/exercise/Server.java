package ba.bitcamp.hajrudin.json.exercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

import org.codehaus.jackson.map.ObjectMapper;

public class Server {
	public static void main(String[] args) throws UnknownHostException,
			IOException {
		ServerSocket server = new ServerSocket(8000);
		Socket fromAdnan = server.accept();

		InputStream byteReader = fromAdnan.getInputStream();
		OutputStream byteWriter = new FileOutputStream(new File("Message.json"));

		int line;
		byte[] buffer = new byte[1024];
		while ((line = byteReader.read(buffer, 0, 1024)) > 0) {
			byteWriter.write(buffer, 0, line);
		}
		byteWriter.flush();
		fromAdnan.close();
		System.out.println("File je primio");

		ObjectMapper mapper = new ObjectMapper();
		ArrayList<Msg> s1 = mapper.readValue(new File("Message.json"),
				ArrayList.class);

		System.out.println(s1);

		Socket toZaid = new Socket("10.0.82.230", 8000);

		Msg msg = new Msg("ESAD PLAVI ", "16:30", "KAD JA PODJOH NA MORE !");

		s1.add(msg);

		try {
			mapper.writeValue(new File("Message.json"), s1);
			System.out.println("It worked!");
		} catch (IOException e) {
			e.printStackTrace();
		}

		InputStream reader = new FileInputStream(new File("Message.json"));
		OutputStream writer = toZaid.getOutputStream();

		int line1;
		byte[] buffer1 = new byte[1024];
		while ((line1 = reader.read(buffer1, 0, 1024)) > 0) {
			writer.write(buffer1, 0, line1);
		}
		writer.flush();
		toZaid.close();
		System.out.println("Otislo Zaidu");

	}

}
