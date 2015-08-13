package cardgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
	public static ArrayList<Card> cards = new ArrayList<>();

	public Deck() {
		try {
			cards.add(new Card(new CardData(CardData.ACE, CardData.HEART)));
			cards.add(new Card(new CardData(12, 0)));
			cards.add(new Card(new CardData(13, 0)));
			cards.add(new Card(new CardData(14, 0)));

			cards.add(new Card(new CardData(11, 1)));
			cards.add(new Card(new CardData(12, 1)));
			cards.add(new Card(new CardData(13, 1)));
			cards.add(new Card(new CardData(14, 1)));

			cards.add(new Card(new CardData(11, 2)));
			cards.add(new Card(new CardData(12, 2)));
			cards.add(new Card(new CardData(13, 2)));
			cards.add(new Card(new CardData(14, 2)));

			cards.add(new Card(new CardData(11, 3)));
			cards.add(new Card(new CardData(12, 3)));
			cards.add(new Card(new CardData(13, 3)));
			cards.add(new Card(new CardData(14, 3)));

			cards.add(new Card(new CardData(0, 4)));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Simulation of shuffle cards
	 */
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	/**
	 * 
	 * @param cards
	 * @return
	 */
	public Card drawFromDeck(ArrayList<Card> cards) {
		Random generator = new Random();
		int index = generator.nextInt(cards.size());

		return cards.remove(index);
	}

	/**
	 * @return the cards
	 */
	public static ArrayList<Card> getCards() {
		return cards;
	}

	/**
	 * @param cards the cards to set
	 */
	public static void setCards(ArrayList<Card> cards) {
		Deck.cards = cards;
	}
	
	
}
