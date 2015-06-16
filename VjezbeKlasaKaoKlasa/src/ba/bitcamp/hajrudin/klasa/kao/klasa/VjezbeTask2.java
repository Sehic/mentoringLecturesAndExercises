package ba.bitcamp.hajrudin.klasa.kao.klasa;

public class VjezbeTask2 {

	public static void main(String[] args) {
		Wallet w = new Wallet(2);
		System.out.println(w.getMoneyInWallet());
		CreditCard c1 = new CreditCard();
		c1.setIssueMounth(7);
		c1.setIssueYear(2016);
		c1.setMoneyOnCard(7900);
		System.out.println(c1.getMoneyOnCard());
		w.setCreditCards(c1);
		CreditCard c2 = new CreditCard();
		c2.setIssueMounth(1);
		c2.setIssueYear(2015);
		c2.setMoneyOnCard(1500);
		w.setCreditCards(c2);
		CreditCard c3 = new CreditCard();
		w.setCreditCards(c3);
		
		
		for(int i = 0; i<w.getmaxCapacityOfCards();i++){
			System.out.println(w.getCreditCards()[i].getMoneyOnCard());
		}
	}

}
