package ba.bitcamp.hajrudin.test;

public class WorksOfArt extends Eksponat implements searchable{
	private static final int RENESANSA = 0;
	private static final int NEOKLASIKA = 1;
	private static final int MODERNA = 2;
	private static final int SAVREMENA = 3;

	private String nameOfAuthor;
	private int period;

	public WorksOfArt(String name, String about, String nameOfAuthor, int period) {
		super(name, about);
		this.nameOfAuthor = nameOfAuthor;
		this.period = period;
	}

	public String getNameOfAuthor() {
		return nameOfAuthor;
	}

	public void setNameOfAuthor(String nameOfAuthor) {
		this.nameOfAuthor = nameOfAuthor;
	}

	public String getPeriod() {
		switch (this.period) {
		case 0:
			return "Renesansa";
		case 1:
			return "Neoklasika";
		case 2:
			return "Moderna";
		case 3:
			return "Savremena";
		default:
			return "Other";
		}
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		WorksOfArt other = (WorksOfArt) obj;
		if (nameOfAuthor == null) {
			if (other.nameOfAuthor != null)
				return false;
		} else if (!nameOfAuthor.equals(other.nameOfAuthor))
			return false;
		if (period != other.period)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "WorksOfArt [nameOfAuthor=" + nameOfAuthor + ", period="
				+ this.getPeriod() + "\n";
	}

	@Override
	public boolean fiitsSearch(String s) {
		if(s.equals(nameOfAuthor)){
			return true;
		}else if(s.equals(getPeriod())){
			return true;
		}
		return false;
	}

}
