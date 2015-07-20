package ba.bitcamp.hajrudin.writing.generic.classes.and.methods.exercise;

public class Application{
	private String name;
	private int year;
	private int ver;
	private int size;
	
	public Application(String name, int year, int ver, int size) {
		super();
		this.name = name;
		this.year = year;
		this.ver = ver;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getVer() {
		return ver;
	}

	public void setVer(int ver) {
		this.ver = ver;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Application [name=" + name + ", year=" + year + ", ver=" + ver
				+ ", size=" + size + "]";
	}
	
	
	
	
}
