package ba.bitcamp.hajrudin.files.exercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Task3 {
	public static void main(String[] args) {
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
					StringTokenizer st = new StringTokenizer(line, " ");
					
					while(st.hasMoreTokens()){
						try{
						int a = Integer.parseInt(st.nextToken());
						System.out.println(a);
						}catch(NumberFormatException e){}
					}
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
