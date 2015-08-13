package cardgame;

public class CardData {
	public static final int HEART = 0;
	public static final int SPADE = 1;
	public static final int DIAMOND = 2;
	public static final int TREF = 3;
	public static final int JOKER = 4;

	public static final int ACE = 11;
	public static final int JACK = 12;
	public static final int QUEEN = 13;
	public static final int KING = 14;

	private int value;
	private int suit;

	public CardData(int value, int suit) throws Exception {
		if (value > CardData.KING && value < CardData.ACE && suit < CardData.HEART && suit > CardData.TREF) {
		} else {
			this.value = value;
			this.suit = suit;
		}
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * @return the suit
	 */
	public int getSuit() {
		return suit;
	}

	/**
	 * @param suit
	 *            the suit to set
	 */
	public void setSuit(int suit) {
		this.suit = suit;
	}

}
