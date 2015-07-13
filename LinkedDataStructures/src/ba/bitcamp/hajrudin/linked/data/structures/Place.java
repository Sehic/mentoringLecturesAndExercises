package ba.bitcamp.hajrudin.linked.data.structures;

public class Place {
	private String name;
	private Place nextPlace;

	public Place(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Place getNextPlace() {
		return nextPlace;
	}

	public void setNextPlace(Place nextPlace) {
		this.nextPlace = nextPlace;
	}

	@Override
	public String toString() {
		String s = "";
		s = "  " + this.name;
		if (this.nextPlace != null) {
			s += this.nextPlace.toString();
		}
		return s;
	}

}
