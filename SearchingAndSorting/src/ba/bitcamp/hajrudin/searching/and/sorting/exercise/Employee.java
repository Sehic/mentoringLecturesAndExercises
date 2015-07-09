package ba.bitcamp.hajrudin.searching.and.sorting.exercise;

public class Employee {
	
	private static int counter = 1001;
	
	private int ID;
	private String name;
	private String surname;
	private String gender;
	private int sallary;
	private Date date;
	
	public class Date{
		private int day;
		private int mounth;
		private int year;
		
		public Date(int day, int mounth, int year){
			this.day=day;
			this.mounth=mounth;
			this.year=year;
		}

		public int getDay() {
			return day;
		}

		public int getMounth() {
			return mounth;
		}

		public int getYear() {
			return year;
		}

		@Override
		public String toString() {
			String s = "";
			s="Date of birth: "+this.day+"."+this.mounth+"."+this.year+"\n";
			return s;
		}
		
		

	}
	
	public Employee(){
		
	}
	
	public Employee(String name, String surname, String gender, int sallary, int day, int mounth, int year){
		this.ID=counter++;
		this.name=name;
		this.surname=surname;
		this.gender=gender;
		this.sallary=sallary;
		this.date = new Date(day, mounth, year);
		
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

	public int getSallary() {
		return sallary;
	}

	public void setSallary(int sallary) {
		this.sallary = sallary;
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
		s+="Sallary: "+this.sallary+"\n";
		s+=this.date.toString();
		return s;
	}
	
	
	
	
}
