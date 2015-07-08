package ba.bitcamp.hajrudin.array.list.exercise;

import java.util.Arrays;



public class Task3 {
	public static void main(String[] args) {
		String[] arr = getArr("ABC",null, "OAK",null,"JAVA");
		System.out.println(Arrays.toString(arr));
	}

	private static String[] getArr(String...arr) {
		int counter=0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i]!=null){
				counter++;
			}
			}
		String [] s = new String [counter];
		counter = 0;
		for(int i = 0; i<arr.length; i++){	
			if(arr[i]!=null){
				s[counter]=arr[i];
				counter++;
			}
		}
		return s;
	}
	
	
}
