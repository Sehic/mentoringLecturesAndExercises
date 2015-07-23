package ba.bitcamp.hajrudin.test;

public class Employee implements searchable {
	private String nameOfEmployee;
	private int salary;

	public Employee(String nameOfEmployee, int salary) {
		super();
		this.nameOfEmployee = nameOfEmployee;
		this.salary = salary;
	}

	public String getNameOfEmployee() {
		return nameOfEmployee;
	}

	public void setNameOfEmployee(String nameOfEmployee) {
		this.nameOfEmployee = nameOfEmployee;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [nameOfEmployee=" + nameOfEmployee + ", salary="
				+ salary + "\n";
	}

	@Override
	public boolean fiitsSearch(String s) {
		if (s.equals(nameOfEmployee)) {
			return true;
		} else {
			try {
				int a = Integer.parseInt(s);
				if (a == this.salary) {
					return true;
				}
			} catch (Exception e) {
			}
		}
		return false;
	}

}
