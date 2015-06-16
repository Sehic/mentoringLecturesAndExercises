package ba.bitcamp.hajrudin.klasa.kao.klasa;

public class CreditCard {
	private Integer cardID;
	private String bank;
	private Integer issueMounth;
	private Integer issueYear;
	private Integer moneyOnCard;
	private static Integer currentMounth;
	private static Integer currentYear;
	
	
	
	public CreditCard() {
		super();
		this.currentMounth=6;
		this.currentYear=2015;
		this.moneyOnCard=0;
	}
	public Integer getMoneyOnCard() {
		return moneyOnCard;
	}
	public void setMoneyOnCard(Integer moneyOnCard) {
		if(this.issueYear<this.currentYear){
			System.out.println("Your card has expired");
		} else if(this.issueYear.equals(this.currentYear) && this.issueMounth<this.currentMounth){
			System.out.println("Your card has expired");
		}else {
		this.moneyOnCard += moneyOnCard;
		}
	}
	public Integer getCardID() {
		return cardID;
	}
	public void setCardID(Integer cardID) {
		this.cardID = cardID;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public Integer getIssueMounth() {
		return issueMounth;
	}
	public void setIssueMounth(Integer issueMounth) {
		this.issueMounth = issueMounth;
	}
	public Integer getIssueYear() {
		return issueYear;
	}
	public void setIssueYear(Integer issueYear) {
		this.issueYear = issueYear;
	}
	
}
