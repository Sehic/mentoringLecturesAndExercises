package ba.bitcamp.hajrudin.lists.and.sets.maps.exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.Iterator;

import ba.bitcamp.hajrudin.lists.and.sets.maps.exercise.Main.Sort;

public class Country {
	private String name;
	private int population;
	private int area;

	public Country(String name, int population, int area) {
		super();
		this.name = name;
		this.population = population;
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public double getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public static void sort(ArrayList<Country> list, EnumSet<Sort> set) {
		Iterator<Sort> it = set.iterator();
		while (it.hasNext()) {
			Sort s = it.next();
			if (s == Sort.NAME) {
				sortByName(list);
			}
			if (s == Sort.AREA) {
				sortByArea(list);
			}
			if (s == Sort.POPULATION) {
				sortByPopulation(list);
			}
		}
	}

	public static void sortByName(ArrayList<Country> list) {
		list.sort(new Comparator<Country>() {
			@Override
			public int compare(Country o1, Country o2) {
				return o1.name.compareTo(o2.name);
			}
		});
	}

	public static void sortByPopulation(ArrayList<Country> list) {
		list.sort(new Comparator<Country>() {
			@Override
			public int compare(Country o1, Country o2) {
				return o1.population - o2.population;
			}

		});
	}

	public static void sortByArea(ArrayList<Country> list) {
		list.sort(new Comparator<Country>() {
			@Override
			public int compare(Country o1, Country o2) {
				return o1.area - o2.area;
			}
		});
	}

	@Override
	public String toString() {
		return "Name = " + name + ", population = " + population
				+ ", area = " + area + "\n";
	}
	
	

}
