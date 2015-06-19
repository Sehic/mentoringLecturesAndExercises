package ba.bitcamp.hajrudin.thiis.and.supeer.exercise;

public class Tiger extends Animal{
	
	private static final int HOUNT = 0;
	private static final int SLEEP = 1;
	private static final int EAT = 2;
	
	private int status;
	private int speed;
	
	public Tiger(boolean isAlive, int weight, int food, int status, int speed) {
		super(isAlive, weight, food);
		this.status = status;
		this.speed = speed;
	}

	public String getStatus() {
		String s = "";
		switch(this.status){
		case HOUNT: s="Hounting";
		break;
		case SLEEP: s = "Sleeping";
		break;
		case EAT: s = "Eating";
		break;
		}
		return s;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
	
}
