package ba.bitcamp.hajrudin.networking.part.II;

import java.io.BufferedWriter;
import java.io.IOException;

public class Result {

	private static void response(BufferedWriter writer, String responseCode,
			String responseContent) throws IOException {
		writer.write(String.format("HTTP/1.1 %s \n", responseCode));
		writer.write("content-type: text/html \n");
		writer.newLine();
		writer.write(responseContent);
		writer.newLine();
		writer.flush();
	}

	public static void ok(BufferedWriter writer, String content)
			throws IOException {
		response(writer, "200 OK", content);
	}

	public static void notFound(BufferedWriter writer) throws IOException {
		response(writer, "404 Not Found", "File Not Found");
	}

	public static void serverError(BufferedWriter writer) throws IOException {
		response(writer, "500 Server Error", "Bug");
	}
}
