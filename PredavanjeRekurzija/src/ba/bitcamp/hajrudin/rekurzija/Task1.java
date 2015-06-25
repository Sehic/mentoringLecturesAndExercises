package ba.bitcamp.hajrudin.rekurzija;

public class Task1 {
	public static void main(String[] args) {
		print("Cersei", 3);
	}
	
	public static void print(String name, int n){
		if(n==0){
			return;
		}
		System.out.println(name);
		print(name, n-1);
	}
}
