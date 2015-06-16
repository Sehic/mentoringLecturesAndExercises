package ba.bitcamp.hajrudin.klasa.kao.klasa;

public class Bag {
	private Integer capcity;
	private Integer currentCapcity=0;
	
	public Bag(Integer capcity) {
		super();
		this.capcity = capcity;
	}
	
	public Integer getCapcity() {
		return capcity;
	}
	public Integer getCurrentCapcity() {
		return currentCapcity;
	}
	public Integer getFreeSpace(){
		return this.capcity-this.currentCapcity;
	}
	public void setCurrentCapcity(Integer currentCapcity) {
		if(currentCapcity+this.currentCapcity<=this.capcity)
		this.currentCapcity += currentCapcity;
	}
	
	
	
}
