package ba.bitcamp.hajrudin.inheritance.and.polymorphism;

public class Main {

	public static void main(String[] args) {
		University u = new University();
		u.name="IUS";
		u.isPublic=false;
		u.numOfFaculties=3;
		u.area=3923;
		u.location="fdsas";
		u.population=1234;
		System.out.println(u.getPopulation());
		
		Hospital h = new Hospital();
		h.area=4545;
		h.isItPublic=true;
		h.location="street";
		h.numOfBeds=123566;
		h.numOfSurgens=33;
		h.population=4321;
		System.out.println(h.getPopulation());
		
		
	}

}
