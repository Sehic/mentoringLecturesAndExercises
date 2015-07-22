package ba.bitcamp.hajrudin.files.exercise;

public class Employee {
	private String name;
	private String surname;
	private String gender;
	private String position;
	private int salary;

	public Employee(String name, String surname, String gender,
			String position, int salary) {
		super();
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.position = position;
		this.salary = salary;
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", surname=" + surname + ", gender="
				+ gender + ", position=" + position + ", salary=" + salary
				+ "\n";
	}

}
