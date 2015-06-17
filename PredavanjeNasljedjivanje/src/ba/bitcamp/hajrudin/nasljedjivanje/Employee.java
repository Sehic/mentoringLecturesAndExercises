package ba.bitcamp.hajrudin.nasljedjivanje;

public class Employee {
	protected String name;
	private String gender;
	
	public Employee(String name, String gender){
		this.name=name;
		this.gender=gender;
	}
	
	public String toString(){
		return "Employee class: "+name + "  "+gender;
	}
	
	
}
