package ba.bitcamp.hajrudin.inheritance.and.polymorphism.exercise;

public class Laptop extends PortableComputer {
	private int numOfCells;
	private boolean hasBluetooth;
	private boolean hasNumKeyboard;

	public Laptop(int numOfCells, boolean hasBluetooth, boolean hasNumKeyboard,
			int weight, int display, boolean hasWifi, String system,
			int memory, double price) {
		super(weight, display, hasWifi, system, memory, price);
		this.hasBluetooth = hasBluetooth;
		this.hasNumKeyboard = hasNumKeyboard;
		this.numOfCells = numOfCells;
	}

	public int getNumOfCells() {
		return numOfCells;
	}

	public void setNumOfCells(int numOfCells) {
		this.numOfCells = numOfCells;
	}

	public boolean isHasBluetooth() {
		return hasBluetooth;
	}

	public void setHasBluetooth(boolean hasBluetooth) {
		this.hasBluetooth = hasBluetooth;
	}

	public boolean isHasNumKeyboard() {
		return hasNumKeyboard;
	}

	public void setHasNumKeyboard(boolean hasNumKeyboard) {
		this.hasNumKeyboard = hasNumKeyboard;
	}

	public String toString() {
		return "Prenosivi racunar \n";
	}

}