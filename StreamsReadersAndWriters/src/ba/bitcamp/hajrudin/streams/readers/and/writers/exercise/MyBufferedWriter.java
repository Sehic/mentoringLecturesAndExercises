package ba.bitcamp.hajrudin.streams.readers.and.writers.exercise;

import java.io.IOException;
import java.io.OutputStream;

public class MyBufferedWriter {
	private OutputStream os;

	public MyBufferedWriter(OutputStream os) {
		this.os = os;
	}
	
	public void write(char c){
		try {
			os.write(c);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void write(int i){
		try {
			os.write(i);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void write(String s){
		for(int i = 0; i < s.length(); i++){
			this.write(s.charAt(i));
		}
	}
	
	public void close(){
		try {
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void newLine(){
		try {
			os.write(10);
			os.write(13);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void flush(){
		try {
			os.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		MyBufferedWriter bw = new MyBufferedWriter(System.out);
		bw.write(63);
		bw.flush();
	}
	
	
}
