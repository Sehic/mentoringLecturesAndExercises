package ba.bitcamp.hajrudin.generic.programming.in.java.exercise;

import java.util.Arrays;
import java.util.Comparator;

public class Planet implements Comparable<Planet>{
	private String name;
	private int diameter;
	private int mass;
	private int distance;
	
	public Planet(String name, int diameter, int mass, int distance) {
		super();
		this.name = name;
		this.diameter = diameter;
		this.mass = mass;
		this.distance = distance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public int getMass() {
		return mass;
	}

	public void setMass(int mass) {
		this.mass = mass;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	@Override
	public int compareTo(Planet o) {
		return this.name.compareTo(o.name);
	}
	
	public static void sortByMass(Planet[] array) {		
		Arrays.sort(array, new Comparator<Planet>() {
			@Override
			public int compare(Planet o1, Planet o2) {
				return o1.mass - o2.mass;
			}
			
		});
		}

	@Override
	public String toString() {
		return "Planet [name=" + name + ", diameter=" + diameter + ", mass="
				+ mass + ", distance=" + distance + "] \n";
	}
	
	
	
	
	
}
