package ba.bitcamp.hajrudin.thiis.and.supeer.exercise;

public class Plant extends LifeForm{
	
	protected static final int SMALL = 0;
	protected static final int MEDIUM = 1;
	protected static final int HARD = 2;
	
	private boolean isOtrovna;
	private int quantity;
	
	public Plant(boolean isAlive, boolean isOtrovna, int quantity) {
		super(isAlive);
		this.isOtrovna = isOtrovna;
		this.quantity = quantity;
	}

	public boolean isOtrovna() {
		return isOtrovna;
	}

	public void setOtrovna(boolean isOtrovna) {
		this.isOtrovna = isOtrovna;
	}
	
	public int getquantity(){
		return this.quantity;
	}
	
	public String getQuantity() {
		String s = "";
		switch(this.quantity){
		case SMALL: s = "Small";
		break;
		case MEDIUM: s = "Medium";
		break;
		case HARD: s = "Hard";
		break;
		}
		return s;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plant other = (Plant) obj;
		if (isOtrovna != other.isOtrovna)
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	}
	
	@Override
	public String toString(){
		String s = super.toString();
		s+= "Is otrovna: "+this.isOtrovna+"\n";
		s+= "Quantity: "+this.getQuantity()+"\n";
		return s;
	}
	
	
	
	
}	