package ba.bitcamp.hajrudin.inheritance.and.polymorphism.exercise;

public class PocketPC extends PortableComputer {
	private boolean isTouch;
	private boolean hasSim;
	private boolean hasMicroSD;

	public PocketPC(boolean isTouch, boolean hasSim, boolean hasMicroSD,
			int weight, int display, boolean hasWifi, String system,
			int memory, double price) {
		super(weight, display, hasWifi, system, memory, price);
		this.hasMicroSD = hasMicroSD;
		this.hasSim = hasSim;
		this.isTouch = isTouch;
	}

	public boolean isTouch() {
		return isTouch;
	}

	public void setTouch(boolean isTouch) {
		this.isTouch = isTouch;
	}

	public boolean isHasSim() {
		return hasSim;
	}

	public void setHasSim(boolean hasSim) {
		this.hasSim = hasSim;
	}

	public boolean isHasMicroSD() {
		return hasMicroSD;
	}

	public void setHasMicroSD(boolean hasMicroSD) {
		this.hasMicroSD = hasMicroSD;
	}

	public String toString() {
		return "Dzepni racunar. PRENOSIVOST/FUNKCIONALNOST. \n";
	}

}
