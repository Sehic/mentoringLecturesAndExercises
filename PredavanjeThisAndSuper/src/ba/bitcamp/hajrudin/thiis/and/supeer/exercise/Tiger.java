package ba.bitcamp.hajrudin.thiis.and.supeer.exercise;

public class Tiger extends Animal{
	
	protected static final int HOUNT = 0;
	protected static final int SLEEP = 1;
	protected static final int EAT = 2;
	
	private int status;
	private int speed;
	
	public Tiger(boolean isAlive, int weight, int food, int status, int speed, int health) {
		super(isAlive, weight, food, health);
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
	
	public int getstatus(){
		return this.status;
	}
	
	@Override
	public void eat(LifeForm l){
		if(this.isAlive()==false){
			System.out.println("Tigar je mrtav!");
		} else {
		if(l instanceof Zebra == true && this.getstatus()==HOUNT){
			Zebra z = (Zebra) l;
			switch(z.getstatus()){
			case Zebra.ILL:
				System.out.println("Tigar je pojeo bolesnu zebru i umro!");
				this.setAlive(false);
			break;
			case Zebra.HEALTY:
				System.out.println("Tigar jede!");
				this.setHealth((int)(z.getWeight()*0.1));
				this.setStatus(EAT);
			break;
			default: 
				System.out.println("Tigar je pojeo tesko bolesnu zebru i umro");
				this.setAlive(false);
				break;
			}
		} else {
			System.out.println("Tigar moze jesti samo zebru kad je u stanju lova");
		}
		}
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
