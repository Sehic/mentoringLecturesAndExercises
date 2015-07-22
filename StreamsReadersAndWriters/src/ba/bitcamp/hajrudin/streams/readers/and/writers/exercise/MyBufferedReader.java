package ba.bitcamp.hajrudin.streams.readers.and.writers.exercise;

import java.io.IOException;
import java.io.InputStream;

public class MyBufferedReader {
	private InputStream is;

	public MyBufferedReader(InputStream is) {
		this.is = is;
	}

	public void read() {
		try {
			System.out.println((char)is.read());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void readLine() throws IOException {
		char c = ' ';
		do {
			try {
				c = (char)is.read();
				System.out.print(c);
			} catch (IOException e) {
				e.printStackTrace();
			}

		} while (c != 13);
	}
	
	public void read(char[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]);
		}
	}
	
	public void read(char[] arr, int off, int len){
		int i = off;
		int count = 0;
		while(count > len){
			System.out.print(arr[i]);
			i++;
		}
	}
	
	public void close(){
		try {
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**public boolean ready(){
		
	}**/

}
