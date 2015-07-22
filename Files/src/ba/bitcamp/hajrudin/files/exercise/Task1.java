package ba.bitcamp.hajrudin.files.exercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Task1 {
	public static void main(String[] args) {
		Employee[] employees = new Employee[7];
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
			int count = 0;
			try {
				bf = new BufferedReader(new FileReader(f));
				bf.readLine();
				while(bf.ready()){
					String line = bf.readLine();
					String[]arr = line.split(",");
					employees[count] = new Employee(arr[0], arr[1], arr[2], arr[3], Integer.parseInt(arr[4]));
					count++;
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(Arrays.toString(employees));
		for(int i = 1; i<employees.length; i++){
			Employee e = employees[i];
			int j;
			for(j = i-1; j>=0; j--){
				if(employees[j].getName().compareTo(e.getName())<0){
					break;
				} 
					employees[j+1] = employees[j];
			}
			employees[j+1] = e;
		}
		System.out.println(Arrays.toString(employees));
	}
	
}
