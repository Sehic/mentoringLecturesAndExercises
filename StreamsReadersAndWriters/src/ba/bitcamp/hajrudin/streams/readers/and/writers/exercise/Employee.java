package ba.bitcamp.hajrudin.streams.readers.and.writers.exercise;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Employee implements Serializable {
	private static final long serialVersionUID = -2695889207997525926L;
	private String name;
	private int salary;

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		Employee e1 = new Employee("Name 1", 1000);
		Employee e2 = new Employee("Name 2", 2000);
		Employee e3 = new Employee("Name 3", 3000);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(new File(
					"employees.txt")));
			oos.writeObject(list);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
