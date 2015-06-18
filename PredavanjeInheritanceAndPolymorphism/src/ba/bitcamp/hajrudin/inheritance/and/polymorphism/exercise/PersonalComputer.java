package ba.bitcamp.hajrudin.inheritance.and.polymorphism.exercise;

public abstract class PersonalComputer {
	private String sistem;
	private int memory;
	private double price;
	
	public PersonalComputer(String system, int memory, double price){
		this.sistem=system;
		this.memory=memory;
		this.price=price;
	}
	public String getSistem() {
		return sistem;
	}
	public void setSistem(String sistem) {
		this.sistem = sistem;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
