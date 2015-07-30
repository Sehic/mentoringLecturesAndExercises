package ba.bitcamp.hajrudin.networking.part.II;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler {

	private static final String PATH_TO_PUBLIC = "./public";

	public static String getContent(String route) throws FileNotFoundException,
			IOException {
		String fullPath = routeBuilder(route);
		BufferedReader reader = new BufferedReader(new FileReader(fullPath));
		StringBuilder sb = new StringBuilder();
		while (reader.ready()) {
			sb.append(reader.readLine());
		}
		return sb.toString();
	}

	private static String routeBuilder(String route) {
		if (route.equals("/")) {
			route = "/index.html";
		}
		return PATH_TO_PUBLIC + route;
	}
}
