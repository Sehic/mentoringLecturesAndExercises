package ba.bitcamp.hajrudin.inheritance.and.polymorphism.exercise;

public abstract class PortableComputer extends PersonalComputer {
	private int weight;
	private int display;
	private boolean hasWifi;

	public PortableComputer(int weight, int display, boolean hasWifi,
			String system, int memory, double price) {
		super(system, memory, price);
		this.display = display;
		this.hasWifi = hasWifi;
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getDisplay() {
		return display;
	}

	public void setDisplay(int display) {
		this.display = display;
	}

	public boolean isHasWifi() {
		return hasWifi;
	}

	public void setHasWifi(boolean hasWifi) {
		this.hasWifi = hasWifi;
	}

}
