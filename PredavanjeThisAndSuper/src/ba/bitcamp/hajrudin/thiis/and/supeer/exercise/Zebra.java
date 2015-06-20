package ba.bitcamp.hajrudin.thiis.and.supeer.exercise;

public class Zebra extends Animal{
	
	protected static final int HEALTY = 0;
	protected static final int ILL = 1;
	protected static final int DEATH = 2;
	
	private int age;
	private int status;

	public Zebra(boolean isAlive, int weight, int food, int age, int status, int health) {
		super(isAlive, weight, food, health);
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
	
	public int getstatus(){
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public void eat(LifeForm l){
		if(this.isAlive()==false){
			System.out.println("Zebra je mrtva!");
		} else {
			if(l instanceof Plant == true && l.isAlive()==true){
				Plant p = (Plant) l;
				if(p.isOtrovna()==false){
				switch(p.getquantity()){
				case Plant.HARD:
					System.out.println("Zebra je pojela veoma hranjivu biljku");
					this.setHealth(30);
					break;
				case Plant.MEDIUM:
					System.out.println("Zebra je pojela srednje hranjivu biljku");
					this.setHealth(20);
					break;
				default:
					System.out.println("Zebra je pojela veoma malo hranjivu biljku");
					this.setHealth(10);
				}
			}else{
					System.out.println("Zebra je pojela otrovnu biljku!");
					if(p.getquantity()==Plant.HARD){
						this.setHealth(-60);
					}else if(p.getquantity()==Plant.MEDIUM){
						this.setHealth(-40);
					}else {
						this.setHealth(-20);
					}
					if(this.getHealth()==0){
						this.setAlive(false);
					}
				}
				} else {
					System.out.println("Zebra moze jesti samo zive biljke!");
				}
		}
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
