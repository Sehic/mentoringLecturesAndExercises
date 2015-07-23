package ba.bitcamp.hajrudin.test;

public class Eksponat implements Comparable<Eksponat>, searchable {
	private int ID;
	private String name;
	private String about;
	private int counter = 0;

	public Eksponat(String name, String about) {
		super();
		this.ID = counter++;
		this.name = name;
		this.about = about;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Eksponat other = (Eksponat) obj;
		if (ID != other.ID)
			return false;
		if (about == null) {
			if (other.about != null)
				return false;
		} else if (!about.equals(other.about))
			return false;
		if (counter != other.counter)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Eksponat [ID=" + ID + ", name=" + name + ", about=" + about
				+ "\n";
	}

	@Override
	public int compareTo(Eksponat o) {
		return (this.getName().compareTo(o.getName()));

	}

	@Override
	public boolean fiitsSearch(String s) {
		if (s.equals(name)) {
			return true;
		} else if (this.about.indexOf(s) != -1) {
			return true;
		} else {
			try {
				int a = Integer.parseInt(s);
				if (a == this.ID) {
					return true;
				}
			} catch (Exception e) {
			}
		}
		return false;
	}

}
