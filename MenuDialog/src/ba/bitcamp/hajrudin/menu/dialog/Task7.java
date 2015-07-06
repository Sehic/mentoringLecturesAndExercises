package ba.bitcamp.hajrudin.menu.dialog;

public class Task7 {
	
	public static int getNum(int num, int...nums){
		int counter =0;
		for(int a:nums){
			if(a==num)
				counter++;
		}
		return counter;
	}
	
	public static void main(String[] args) {
		System.out.println(getNum(1, 1,2,3,4,1,5,6,1));
	}
}
