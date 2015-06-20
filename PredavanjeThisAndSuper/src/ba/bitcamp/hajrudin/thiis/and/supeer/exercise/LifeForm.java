package ba.bitcamp.hajrudin.thiis.and.supeer.exercise;

public abstract class LifeForm {
	private boolean isAlive;

	public LifeForm(boolean isAlive) {
		super();
		this.isAlive = isAlive;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LifeForm other = (LifeForm) obj;
		if (isAlive != other.isAlive)
			return false;
		return true;
	}
	
	public String toString(){
		String s = "Is alive: "+this.isAlive+"\n";
		return s;
	}

	public void eat(LifeForm l){}
	
	
}
