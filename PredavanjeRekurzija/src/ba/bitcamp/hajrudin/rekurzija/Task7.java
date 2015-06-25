package ba.bitcamp.hajrudin.rekurzija;

public class Task7 {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,2,3,4,5};
		
		System.out.println(areTheSame(arr1,arr2));
	}
	
	public static boolean areTheSame(int[] arr1, int[] arr2){
		return areTheSame(arr1,arr2,0);
	}

	private static boolean areTheSame(int[] arr1, int[] arr2, int i) {
		if(i==arr1.length){
			return true;
		}
		if(arr1[i]==arr2[i]){
			i+=1;
			return areTheSame(arr1, arr2, i);
		}else {
		return false;
		}
	}
	
	
	
}
