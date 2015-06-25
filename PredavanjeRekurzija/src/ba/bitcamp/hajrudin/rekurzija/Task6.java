package ba.bitcamp.hajrudin.rekurzija;

public class Task6 {
	public static void main(String[] args) {
		int [] arr = {1,4,3,2,5};
		int n = 1;
		System.out.println(isInArray(arr, n));
	}
	public static boolean isInArray(int arr [], int n){
		return isInArray(arr, n, 0);
	}
	private static boolean isInArray(int[] arr, int n, int i) {
		if(i==arr.length){
			return false;
		}
		if(arr[i]==n){
			return true;
		} else {
			i+=1;
			return isInArray(arr, n, i);
		}
		
	}
	
}
