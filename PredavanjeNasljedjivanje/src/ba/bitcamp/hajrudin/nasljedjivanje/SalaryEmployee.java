package ba.bitcamp.hajrudin.nasljedjivanje;


public class SalaryEmployee extends Employee {
	private int salary;
	
	public SalaryEmployee (String name, String gender, int salary){
		super (name, gender);
		this.salary=salary;
	}
	
	public String toString(){
		return "Name: "+name+ " Salary class: "+salary;
	}
	
}
