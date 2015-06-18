package ba.bitcamp.hajrudin.inheritance.and.polymorphism.exercise;

public class Workstation extends StationaryComputer {
	private int numOfDisplays;
	private int numOfCores;
	private boolean hasECCMemory;

	public Workstation(int numOfDisplays, int numOfCores, boolean hasECCMemory,
			double speed, int power, int hardDisc, int memory, String system,
			double price) {
		super(speed, power, hardDisc, system, memory, price);
		this.hasECCMemory = hasECCMemory;
		this.numOfCores = numOfCores;
		this.numOfDisplays = numOfDisplays;
	}

	public int getNumOfDisplays() {
		return numOfDisplays;
	}

	public void setNumOfDisplays(int numOfDisplays) {
		this.numOfDisplays = numOfDisplays;
	}

	public int getNumOfCores() {
		return numOfCores;
	}

	public void setNumOfCores(int numOfCores) {
		this.numOfCores = numOfCores;
	}

	public boolean isHasECCMemory() {
		return hasECCMemory;
	}

	public void setHasECCMemory(boolean hasECCMemory) {
		this.hasECCMemory = hasECCMemory;
	}

	public String toString() {
		return "RADNA STANICA. Istrazivacki radovi. \n";
	}

}
