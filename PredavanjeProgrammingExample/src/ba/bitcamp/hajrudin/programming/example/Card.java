package ba.bitcamp.hajrudin.programming.example;

public class Card implements Comparable<Card> {
	public static final int HEART = 0;
	public static final int SPADE = 1;
	public static final int DIAMOND = 2;
	public static final int CLUB = 3;
	public static final int JOKER = 4;
	
	public static final int ACE = 1;
	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;
	
	private int value;
	private int suit;
	
	public Card(int value, int suit) throws Exception {
		if(value > Card.KING || value < Card.ACE || suit < Card.HEART || suit >Card.CLUB){
			throw new Exception();
		} else {
		this.value = value;
		this.suit = suit;
		}
	}
	
	public Card(){
		this.suit=JOKER;
		this.value=0;
		
	}
	
	public String getCard (){
		String s = "";
		switch (this.suit){
		case HEART: s = "Heart ";
		break;
		case SPADE: s = "Spade ";
		break;
		case DIAMOND: s = "Diamond ";
		break;
		case CLUB: s = "Club ";
		break;
		case JOKER: s = "Joker ";
		break;
		}
		switch (this.value){
		case 0: s+="";
		break;
		case ACE: s+="Ace";
		break;
		case JACK: s+="Jack";
		break;
		case QUEEN: s+="Queen";
		break;
		case KING: s+="King";
		break;
		default:
			s+= Integer.toString(this.value);
			break;
		}
		return s;
	}

	@Override
	public int compareTo(Card o) {
		return (10 * this.suit  + this.value) - (10 * o.suit + o.value);
	}

		
	
	
}
