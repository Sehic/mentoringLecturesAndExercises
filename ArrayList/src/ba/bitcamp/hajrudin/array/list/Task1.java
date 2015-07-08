package ba.bitcamp.hajrudin.array.list;

import java.util.ArrayList;

public class Task1 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 11; i++) {
			list.add(i);
		}
		System.out.println(list.toString());
		/**
		 * int tmp=list.indexOf(2); while(tmp!=-1){ list.remove(tmp);
		 * tmp=list.indexOf(2); }
		 **/

		//long start = System.currentTimeMillis();
		/**ArrayList<Integer> list2 = new ArrayList<Integer>();
		for (int i = list.size() - 1; i >= 0; i--) {
			list2.add(list.get(i));
		}**/
		
		for(int i = 0; i<list.size()-1; i+=2){
			int tmp = list.get(i);
			list.set(i, list.get(i+1));
			list.set(i+1, tmp);
		}
		
		//System.out.println(System.currentTimeMillis() - start);
		System.out.println(list.toString());

	}
}
