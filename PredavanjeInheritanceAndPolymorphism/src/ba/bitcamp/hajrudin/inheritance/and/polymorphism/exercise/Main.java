package ba.bitcamp.hajrudin.inheritance.and.polymorphism.exercise;

public class Main {
	public static void main(String[] args) {
		DesktopComputer d = new DesktopComputer(3, true, true, 1.7, 50, 1, 160, "Windows", 1000);
		System.out.println(d.toString());
		System.out.println("Hard disc: "+d.getHardDisc());
		System.out.println("Memory: "+d.getMemory());
		System.out.println("Places for RAM: "+d.getPlacesForRAM());
		System.out.println("Power: "+d.getPower());
		System.out.println("Price: "+d.getPrice());
		System.out.println("Procesor speed: "+d.getProcesorSpeed());
		System.out.println("System: "+d.getSistem());
		
	}
	
}
