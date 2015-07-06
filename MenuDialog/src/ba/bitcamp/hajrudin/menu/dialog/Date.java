package ba.bitcamp.hajrudin.menu.dialog;

public class Date {
	private int day;
	private int mounth;
	private int year;
	
	public Date(){
		this.day=1;
		this.mounth=1;
		this.year=2000;
	}
	
	public Date (int day, int mounth, int year){
		this.day=day;
		this.mounth=mounth;
		this.year=year;
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", mounth=" + mounth + ", year=" + year
				+ "]";
	}
	
	
}
