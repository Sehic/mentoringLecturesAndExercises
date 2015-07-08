package ba.bitcamp.hajrudin.array.list.exercise;

import java.util.ArrayList;
import java.util.Arrays;

public class Task10 {
	public static void main(String[] args) {
		ArrayList<String> s = new ArrayList<String>(Arrays.asList("ABC",null,"OAK",null,"JAVA"));
		filled(s);
		System.out.println(s);
	}

	private static void filled(ArrayList<String> s) {
		int tmp=s.indexOf(null); 
		while(tmp!=-1){
			s.remove(tmp);
		  tmp=s.indexOf(null); 
		  }
	}
}
