package ba.bitcamp.hajrudin.thiis.and.supeer.exercise;

public abstract class Animal extends LifeForm{
	
	protected static final int ANIMALS = 0;
	protected static final int PLANT = 1;
	
	private int weight;
	private int food;
	private int health;
	
	public Animal(boolean isAlive, int weight, int food, int health) {
		super(isAlive);
		this.weight = weight;
		this.food = food;
		if(health<=0){
			this.health=0;
			this.setAlive(false);
		} else if(health>=100){
			this.health=100;
		} else {
		this.health=health;
		}
	}
	
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		if(health<=0){
			this.health=0;
			this.setAlive(false);
		} else if(health>=100){
			this.health=100;
		} else {
		this.health+=health;
		}
	}



	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getFood() {
		String s = "";
		switch(this.food){
		case ANIMALS: s = "Animals";
		break;
		case PLANT: s="Plants";
		break;
		}
		return s;
	}

	public void setFood(int food) {
		this.food = food;
	}
	
	@Override
	public void eat(LifeForm l){}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (food != other.food)
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}
	
	@Override
	public String toString(){
		String s = "";
		s = "Weight of animal: "+this.weight+"\n";
		s+= "Food: "+this.getFood()+"\n";
		return s;
	}
	
	
	
	
}