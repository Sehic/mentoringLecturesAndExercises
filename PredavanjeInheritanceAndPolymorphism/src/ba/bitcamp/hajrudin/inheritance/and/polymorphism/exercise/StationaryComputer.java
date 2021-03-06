package ba.bitcamp.hajrudin.inheritance.and.polymorphism.exercise;

public abstract class StationaryComputer extends PersonalComputer {
	private double procesorSpeed;
	private int power;
	private int hardDisc;

	public StationaryComputer(double procesorSpeed, int power, int hardDisc,
			String system, int memory, double price) {
		super(system, memory, price);
		this.hardDisc = hardDisc;
		this.power = power;
		this.procesorSpeed = procesorSpeed;
	}

	public double getProcesorSpeed() {
		return procesorSpeed;
	}

	public void setProcesorSpeed(double procesorSpeed) {
		this.procesorSpeed = procesorSpeed;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getHardDisc() {
		return hardDisc;
	}

	public void setHardDisc(int hardDisc) {
		this.hardDisc = hardDisc;
	}

}
