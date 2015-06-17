package ba.bitcamp.hajrudin.nasljedjivanje;


public class HourlyEmployee extends Employee{
	private int hourlyRate;
	
	public HourlyEmployee(String name, String gender, int rate){
		super(name, gender);
		this.hourlyRate=rate;
	}
}
