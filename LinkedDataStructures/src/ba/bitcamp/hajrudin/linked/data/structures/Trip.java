package ba.bitcamp.hajrudin.linked.data.structures;

public class Trip {
	private Place start;
	private Place end;

	public Trip(Place start) {
		this.start = start;
	}

	public Place getStart() {
		return start;
	}

	public void setStart(Place start) {
		this.start = start;
	}

	public void addPlace(Place p) {
		if (this.start == null) {
			this.start = p;
			this.end = p;
		} else {
			end.setNextPlace(p);
			end = p;
		}
	}

	@Override
	public String toString() {
		return "Trip: " + start;
	}

}
