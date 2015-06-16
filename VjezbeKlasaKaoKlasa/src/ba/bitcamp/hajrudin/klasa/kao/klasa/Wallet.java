package ba.bitcamp.hajrudin.klasa.kao.klasa;

public class Wallet {
	private Integer moneyInWallet;
	private CreditCard [] creditCards;
	private Integer maxCapacityOfCards;

	public Wallet(Integer maxCapacityOfCards) {
		super();
		this.maxCapacityOfCards = maxCapacityOfCards;
		this.creditCards = new CreditCard [this.maxCapacityOfCards];
	}
	public Integer getmaxCapacityOfCards() {
		return maxCapacityOfCards;
	}
	
	public Integer getMoneyInWallet() {
		return moneyInWallet;
	}
	public void setMoneyInWallet(Integer moneyInWallet) {
		if(moneyInWallet-this.moneyInWallet>=0)
		this.moneyInWallet = moneyInWallet;
	}
	public CreditCard[] getCreditCards() {
		return creditCards;
	}
	public void setCreditCards(CreditCard creditCards) {
		for(int i=0; i<this.creditCards.length;i++){
			if(this.creditCards[i]==null){
				this.creditCards[i]=creditCards;
				break;
			}
		}
		
	}
	
}
