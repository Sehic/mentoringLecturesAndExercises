package ba.bitcamp.hajrudin.rekurzija;

public class Task2 {
	public static void main(String[] args) {
		printEverySecondNumber(10);
	}
	
	public static void printEverySecondNumber(int num){
		if(num<1){
			return;
		}
		System.out.println(num);
		printEverySecondNumber(num-2);
	}
}
