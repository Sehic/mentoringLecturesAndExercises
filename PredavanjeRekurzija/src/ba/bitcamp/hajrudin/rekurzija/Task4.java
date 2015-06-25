package ba.bitcamp.hajrudin.rekurzija;

public class Task4 {
	public static int fibonacci=0;
	public static int temp1 = 1;
	public static int temp2 = 0;
	
	public static void main(String[] args) {
		System.out.println(getFibonacciNumber(9));
	}
	
	public static int getFibonacciNumber(int num){
		if(num==0){
			return fibonacci;
		}
		fibonacci = temp1+temp2;
		temp1 = temp2;
		temp2 = fibonacci;
		return getFibonacciNumber(num-1);
	}
}
