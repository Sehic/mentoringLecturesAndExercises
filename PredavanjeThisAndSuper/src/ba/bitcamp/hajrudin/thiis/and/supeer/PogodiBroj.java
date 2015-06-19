package ba.bitcamp.hajrudin.thiis.and.supeer;

public class PogodiBroj {
	private int maxBroj;
	private int maxBrojPokusaja;
	private int broj;
	
	public PogodiBroj(int maxBroj, int maxBrojPokusaja) {
		super();
		this.maxBroj = maxBroj;
		this.maxBrojPokusaja = maxBrojPokusaja;
		this.broj=(int)(Math.random()*maxBroj+1);
	}
	
	public int getMaxBroj() {
		return maxBroj;
	}

	public void setMaxBroj(int maxBroj) {
		this.maxBroj = maxBroj;
	}

	public int getMaxBrojPokusaja() {
		return maxBrojPokusaja;
	}

	public void setMaxBrojPokusaja(int maxBrojPokusaja) {
		this.maxBrojPokusaja = maxBrojPokusaja;
	}

	public int getBroj() {
		return broj;
	}
	
	
}
