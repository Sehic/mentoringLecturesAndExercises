package ba.bitcamp.hajrudin.menu.dialog;

public class Task9 {
	
	public static void ispis(char[] arr,int...nums){
		
		for(char a:arr){
			System.out.print(a);
		}
	}
	
	public static void main(String[] args) {
		char[] arr = {'A','B','C','D'};
		ispis(arr, 1,2,3,4);
	}
}
