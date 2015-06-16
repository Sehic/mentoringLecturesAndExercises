package ba.bitcamp.hajrudin.klasa.kao.klasa;

public class VjezbeTask1 {

	public static void main(String[] args) {
		Bag b = new Bag(40);
		System.out.println(b.getCapcity());
		b.setCurrentCapcity(20);
		b.setCurrentCapcity(30);
		System.out.println(b.getFreeSpace());
		b.setCurrentCapcity(20);
		System.out.println(b.getCurrentCapcity());
	}

		
}
