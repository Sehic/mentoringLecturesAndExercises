package ba.bitcamp.hajrudin.files.exercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Task2 {
	public static void main(String[] args) {
		int i = 0;
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		BufferedReader bf;
		JFileChooser open = new JFileChooser();
		File f;
		int action = open.showOpenDialog(null);
		if (action == JFileChooser.APPROVE_OPTION) {
			f = open.getSelectedFile();
			try {
				bf = new BufferedReader(new FileReader(f));
				
				while(bf.ready()){
					String line = bf.readLine();
					char c = line.charAt(line.length()-1);
					if(c == '3'){
					i++;
					}
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(i);
	}
}
