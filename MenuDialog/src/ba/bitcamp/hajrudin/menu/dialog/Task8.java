package ba.bitcamp.hajrudin.menu.dialog;

public class Task8 {
	public static void Reordering(int...nums){
		int [] arr = new int [nums.length];
		int j = 0;
		for(int i=0; i<nums.length; i++){
			if(i%2==0){
				arr[j]=nums[i];
				j++;
			}
		}
		for(int i=0; i<nums.length; i++){
			if(i%2!=0){
				arr[j]=nums[i];
				j++;
			}
		}
		for(int a:arr){
			System.out.print(a+",");
		}
	}
	
	public static void main(String[] args) {
		Reordering(1,2,3,4,5,6,7,8,9);
	}
}
