package ba.bitcamp.hajrudin.programming.with.objects.exercise;

public class Temperature {
	private double temp;

	public Temperature(double temp) {
		this.temp = temp;
	}

	public double getTempInC() {
		return temp;
	}
/**
 * convert temp from c to k
 * @return temp in kelvins
 */
	public double getTempInK() {
		return this.temp+274.15;
	}
	/**
	 * convert temp from c to f
	 * @return temp in fahrenheits
	 */
	public double getTempInF(){
		return this.temp*1.8+32;
	}
	
	
	public void setTemp(double temp){
		this.temp=temp;
	}
	
	
	
}
