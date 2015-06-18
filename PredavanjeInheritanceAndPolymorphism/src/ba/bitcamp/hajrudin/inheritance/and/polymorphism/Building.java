package ba.bitcamp.hajrudin.inheritance.and.polymorphism;

public abstract class Building {
	public String location;
	public int population;
	public int area;
	
	public double getPopulation(){
		return (double) population /area;
	}
	
	
}
