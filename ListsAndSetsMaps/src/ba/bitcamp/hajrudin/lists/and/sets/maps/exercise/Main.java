package ba.bitcamp.hajrudin.lists.and.sets.maps.exercise;

import java.util.ArrayList;
import java.util.EnumSet;

public class Main {
	
	public enum Sort {
		NAME, POPULATION, AREA
	};

	public static void main(String[] args) {
		EnumSet<Sort> set = EnumSet.of(Sort.NAME, Sort.POPULATION);
		Country c1 = new Country("BiH", 100, 300);
		Country c2 = new Country("USA", 700, 1100);
		Country c3 = new Country("UAE", 500, 1300);
		
		ArrayList<Country> list = new ArrayList<Country>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		
		System.out.println(list);
		
		Country.sort(list, set);
		
		System.out.println(list);
		
	}
}
