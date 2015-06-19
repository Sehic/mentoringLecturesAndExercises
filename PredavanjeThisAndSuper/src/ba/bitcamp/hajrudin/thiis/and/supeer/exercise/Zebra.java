package ba.bitcamp.hajrudin.thiis.and.supeer.exercise;

public class Zebra extends Animal{
	
	private static final int HEALTY = 0;
	private static final int ILL = 1;
	private static final int DEATH = 2;
	
	private int age;
	private int status;
	
	public Zebra(boolean isAlive, int weight, int food, int age, int status) {
		super(isAlive, weight, food);
		this.age = age;
		this.status = status;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStatus() {
		String s = "";
		switch(this.status){
		case HEALTY: s = "Healty";
		break;
		case ILL: s = "Ill";
		break;
		case DEATH: s= "Death";
		break;
		}
		return s;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Zebra other = (Zebra) obj;
		if (age != other.age)
			return false;
		if (status != other.status)
			return false;
		return true;
	}
	
	@Override
	public String toString(){
		String s = "";
		s = "Age od zebra: "+this.age+"\n";
		s+= "Status of zebra: "+this.getStatus()+"\n";
		return s;
	}
	
	
	
}
