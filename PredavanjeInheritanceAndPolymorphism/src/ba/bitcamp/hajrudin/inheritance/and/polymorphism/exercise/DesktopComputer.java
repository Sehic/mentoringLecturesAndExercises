package ba.bitcamp.hajrudin.inheritance.and.polymorphism.exercise;

public class DesktopComputer extends StationaryComputer {
	private int placesForRAM;
	private boolean isOverlock;
	private boolean hasOpticalDrive;

	public DesktopComputer(int placesForRAM, boolean isOverlock,
			boolean hasOpticalDrive, double speed, int power, int hardDisc,
			int memory, String system, double price) {
		super(speed, power, hardDisc, system, memory, price);
		this.placesForRAM = placesForRAM;
		this.isOverlock = isOverlock;
		this.hasOpticalDrive = hasOpticalDrive;
	}

	public int getPlacesForRAM() {
		return placesForRAM;
	}

	public void setPlacesForRAM(int placesForRAM) {
		this.placesForRAM = placesForRAM;
	}

	public boolean isOverlock() {
		return isOverlock;
	}

	public void setOverlock(boolean isOverlock) {
		this.isOverlock = isOverlock;
	}

	public boolean isHasOpticalDrive() {
		return hasOpticalDrive;
	}

	public void setHasOpticalDrive(boolean hasOpticalDrive) {
		this.hasOpticalDrive = hasOpticalDrive;
	}

	public String toString() {
		return "Desktop racunar mogucnost konfiguracije \n";
	}

}
