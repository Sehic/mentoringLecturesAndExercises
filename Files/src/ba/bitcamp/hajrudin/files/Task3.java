package ba.bitcamp.hajrudin.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;

public class Task3 {
	public static void main(String[] args) {
		JFileChooser jfc = new JFileChooser(System.getProperty("user.home"));
		File f = null;
		int tmp = jfc.showOpenDialog(null);
		if(tmp == JFileChooser.APPROVE_OPTION){
			f = jfc.getSelectedFile();
		}
		if(f.exists() && f.isFile()){
			try {
				FileReader fr = new FileReader(f);
				char c;
				do{
					c = (char) fr.read();
					System.out.print(c);
				}while(c != 10);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("ERROR");
		}
		
	}
}
