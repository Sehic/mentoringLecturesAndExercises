package ba.bitcamp.hajrudin.homework22.task02;

public class UniqueStackInt {
	private int[] arr;

	public UniqueStackInt() {
		arr = new int[0];
	}

	public void push(int value) {
		boolean temp = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				System.out.println("ERROR");
				temp = true;
			}
		}
		if (!temp) {
			int[] tmp = new int[arr.length + 1];
			for (int i = 0; i < arr.length; i++) {
				tmp[i] = arr[i];
			}
			tmp[arr.length] = value;
			arr = tmp;
		}
	}

	public int pop() {
		int tmp = arr[arr.length - 1];
		int[] temp = new int[arr.length - 1];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = arr[i];
		}
		arr = temp;
		return tmp;
	}
	
	public boolean isIncreasing(){
		int tmp = arr[arr.length-1];
		for(int i = arr.length-2; i >= 0; i--){
			if(tmp < arr[i]){
				return false;
			}
			tmp = arr[i];
		}
		return true;
	}
}
