package ba.bitcamp.hajrudin.rekurzija;

public class Task3 {
	public static int sum;
	
	
	public static void main(String[] args) {
		System.out.println(getSum(100));
	}
	public static int getSum(int num){
		if(num<0){
			return sum;
		}
		sum+=num;
		return getSum(num-1);
		
	}
}
