package ba.bitcamp.hajrudin.searching.and.sorting.exercise;
/**
 * Employee class contains employee name, surname
 * ID, salary, gender, Date of birth from class Date
 * @author hajrudin.sehic
 *
 */
public class Employee {
	
	
	//This counter use to generate ID for every new employee
	private static int counter = 1001;
	
	private int ID;
	private String name;
	private String surname;
	private String gender;
	private int salary;
	private Date date;
	
	/**
	 * Date class contains day, month and year which is used 
	 * to represent Date of birth for every employee
	 * @author hajrudin.sehic
	 *
	 */
	public class Date{
		private int day;
		private int month;
		private int year;
		
		public Date(int day, int month, int year){
			this.day=day;
			this.month=month;
			this.year=year;
		}

		public int getDay() {
			return day;
		}

		public int getMonth() {
			return month;
		}

		public int getYear() {
			return year;
		}

		@Override
		public String toString() {
			String s = "";
			s="Date of birth: "+this.day+"."+this.month+"."+this.year+"\n";
			return s;
		}
		
		

	}
	
	public Employee(){
		
	}
	
	public Employee(String name, String surname, String gender, int salary, int day, int month, int year){
		this.ID=counter++;
		this.name=name;
		this.surname=surname;
		this.gender=gender;
		this.salary=salary;
		this.date = new Date(day, month, year);
		
	}

	public int getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getGender() {
		return gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}


	@Override
	public String toString() {
		String s = "";
		s = "Name: "+this.name+" "+this.surname+"\n";
		s+="Gender: "+this.gender+"\n";
		s+="Sallary: "+this.salary+"\n";
		s+=this.date.toString();
		return s;
	}
	
	
	
	
}
