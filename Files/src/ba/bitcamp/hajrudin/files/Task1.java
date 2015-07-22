package ba.bitcamp.hajrudin.files;

import java.io.File;

public class Task1 {
	public static void main(String[] args) {
		File d = new File(System.getProperty("user.home"));
		String[] files;
		if (d.exists()) {
			if (d.isDirectory()) {
				files = d.list();
				for (int i = 0; i < files.length; i++) {
					System.out.println(files[i]);
				}
			} else {
				System.out.println("ERROR");
			}
		} else {
			System.out.println("No such dir");
		}

	}
}
