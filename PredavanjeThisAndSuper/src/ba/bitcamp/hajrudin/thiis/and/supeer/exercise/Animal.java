package ba.bitcamp.hajrudin.thiis.and.supeer.exercise;

public class Animal extends LifeForm{
	
	private static final int ANIMALS = 0;
	private static final int PLANT = 1;
	
	private int weight;
	private int food;
	
	public Animal(boolean isAlive, int weight, int food) {
		super(isAlive);
		this.weight = weight;
		this.food = food;
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
	
	public void eat(LifeForm l){
		
	}

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
