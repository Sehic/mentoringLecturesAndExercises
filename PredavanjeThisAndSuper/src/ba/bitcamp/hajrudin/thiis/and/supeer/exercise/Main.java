package ba.bitcamp.hajrudin.thiis.and.supeer.exercise;

public class Main {

	public static void main(String[] args) {
		LifeForm p = new Plant(true, false, Plant.MEDIUM);
		LifeForm t = new Tiger(true, 100, Animal.ANIMALS, Tiger.HOUNT, 50, 100);
		LifeForm z = new Zebra(true, 100, Animal.PLANT, 10, Zebra.HEALTY, 10);
		z.eat(p);
		z.eat(t);
		z.eat(z);
		
		

	}

}
