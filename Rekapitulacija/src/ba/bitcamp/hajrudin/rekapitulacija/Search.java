package ba.bitcamp.hajrudin.rekapitulacija;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class Search {
	private String fileName;
	private String extension;
	private String searchTerm;

	private Queue<File> files;

	public Search(String searchString) {
		String[] parts = searchString.split(" ");
		searchTerm = parts[0];

		String[] fileInfo = parts[1].split("\\.");

		fileName = fileInfo[0];
		extension = fileInfo[1];

		if (fileName.equals("*"))
			fileName = "";
		if (extension.equals("*"))
			extension = "";

		files = new LinkedList<File>();

	}

	public void startSearch() throws FileNotFoundException {
		File root = new File(".");
		enqueueFiles(root);

		SearchThread[] st = new SearchThread[5];

		for (int i = 0; i < st.length; i++) {
			st[i] = new SearchThread();
			st[i].start();
		}
	}

	private synchronized void enqueueFiles(File root) {
		File[] files = root.listFiles(new Filter());
		for (int i = 0; i < files.length; i++) {
			this.files.add(files[i]);
		}
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i].getName());
		}
	}

	private class SearchThread extends Thread {

		@Override
		public void run() {
			while (true) {

				File f = null;

				synchronized (files) {
					if (files.isEmpty())
						return;
					f = files.remove();
				}

				if (f.isDirectory()) {
					enqueueFiles(f);
					continue;
				}

				try {
					BufferedReader br = new BufferedReader(new FileReader(f));
					while (br.ready()) {
						String line = br.readLine();
						if (line.contains(searchTerm)) {
							System.out.println(f.getName() + ": " + line);
						}
					}
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}

			}
		}
	}

	/**
	 * Filter for files by name and extension
	 * 
	 * @author hajrudin.sehic
	 *
	 */
	public class Filter implements FileFilter {

		@Override
		public boolean accept(File pathname) {

			if (pathname.isDirectory()) {
				return true;
			}
			if (fileName.isEmpty() && extension.isEmpty())
				return true;
			String file = fileName + '.' + extension;
			return pathname.getName().contains(file);

		}
	}
}