package ba.bitcamp.hajrudin.searching.and.sorting.exercise;

public class Main {
	public static void main(String[] args) {
		Employee e1 = new Employee("Ime1", "Prezime1", "Male", 1000, 10, 02, 1990);
		Employee e2 = new Employee("Ime2", "Prezime2", "Female", 1050, 10, 02, 1980);
		Employee e3 = new Employee("Ime3", "Prezime3", "Female", 900, 10, 02, 1991);
		Employee e4 = new Employee("Ime4", "Prezime4", "Male", 850, 10, 02, 1983);
		Employee e5 = new Employee("Ime5", "Prezime5", "Male", 2000, 10, 02, 1970);
		
		Company c1 = new Company("Company1");
		
		c1.hireEmployee(e1);
		c1.hireEmployee(e2);
		c1.hireEmployee(e3);
		c1.hireEmployee(e4);
		c1.hireEmployee(e5);
		
		System.out.println(c1.toString());
		
		c1.sortByAge();
		
		System.out.println(c1.toString());
		
		c1.sortByID();
		
		System.out.println(c1.toString());
		
		c1.sortBySalary();
		
		System.out.println(c1.toString());
		
		c1.sortByGender();
		
		System.out.println(c1.toString());
		
		System.out.println(c1.areEmployeesSorteByID());
		
		c1.sortByID();
		
		System.out.println(c1.areEmployeesSorteByID());
		
		Employee ee = c1.getEmployee(1001);
		
		System.out.println(ee);
		
			
		for(Employee eee:c1.getEmployeeList()){
			System.out.println(eee);
		}
		
		c1.sortByAge();
		
		System.out.println(c1.toString());
		
		c1.sortByName();
		
		System.out.println(c1.toString());
	
		
	}
}
