package ba.bitcamp.hajrudin.lists.and.sets.maps.exercise;

import java.util.HashMap;

public class Task4 {
	public static void main(String[] args) {
		String text = "Napisati kod koji prebroji koliko se svaka rijec u tekstu pojavljuje . Uzeti bilo koji tekst , staviti ga u file i ucitati ga u program . Prebrojane rijeci i broj repeticija staviti u file poredano po abecedi , a zatim u drugi file isto to ispisati ali poredano po broju repeticija .";
		String [] arr = text.split(" ");
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		for(int i = 0; i<arr.length; i++){
			if(hmap.containsKey(arr[i])){
				hmap.put(arr[i], hmap.get(arr[i])+1);
			} else {
			hmap.put(arr[i], 1);
			}
		}
		
		System.out.println(hmap);
	}
}
