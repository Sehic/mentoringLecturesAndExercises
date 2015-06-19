package ba.bitcamp.hajrudin.thiis.and.supeer;

public class IgrajPogodiBroj extends PogodiBroj{
	private int brojPokusaja;

	public IgrajPogodiBroj(int maxBroj, int maxBrojPokusaja) {
		super(maxBroj, maxBrojPokusaja);
		this.brojPokusaja = 0;
	}
	
	public IgrajPogodiBroj(int maxBroj){
		this(maxBroj,((maxBroj/100)+1));
	}
	
	public IgrajPogodiBroj(){
		this(1000, 10);
	}
	
	public boolean pogodi(int broj){
		boolean temp = false;
		if(broj==this.getBroj()){
			System.out.println("Pogodjeno!!!");
			return true;
		} else{
			this.brojPokusaja+=1;
			if(this.brojPokusaja<super.getMaxBrojPokusaja()){
				System.out.println("Pokusajte ponovo. Imate jos "+(super.getMaxBrojPokusaja()-this.brojPokusaja)+" pokusaja.");
				return false;
			} else{
				System.out.println("Niste pogodili!");
				return true;
			}
		}
	}
	
	public int getBrojPokusaja(){
		return this.brojPokusaja;
	}
	
}
