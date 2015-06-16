package ba.bitcamp.hajrudin.programming.with.objects.exercise;

public class Glass {
	private String type;
	private int currentCapacity;
	private int maxCapacity;
	
	public Glass(String typesOfLiquid, int currentCapacity, int maxCapacity) {
		this.type = typesOfLiquid;
		this.currentCapacity = currentCapacity;
		this.maxCapacity = maxCapacity;
	}

	public String getType() {
		return type;
	}

	public int getCurrentCapacity() {
		return currentCapacity;
	}

	
	public int getMaxCapacity() {
		return maxCapacity;
	}
	/**
	 * Adding liquid in glass
	 * @param type type of liquid (must be same as in the glass)
	 * @param capacity capacity of liquid
	 */
	public void addLiquid(String type, int capacity) {
		if(type.equals(this.type)){
			this.currentCapacity+=capacity;
			if(this.currentCapacity>this.maxCapacity){
				this.currentCapacity=this.maxCapacity;
			}
		}
	}
	/**
	 * spill liquid from glass
	 */
	public void emptyGlass(){
		this.currentCapacity=0;
	}

	
	
	
}
