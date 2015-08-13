package cardgame;

import java.awt.image.BufferedImage;
import java.io.IOException;



public class Card {
	private static final long serialVersionUID = 5596522208485867270L;

	private CardData cardData;
	private BufferedImage suitImge;
	

	public Card(CardData cardData) {
		this.cardData = cardData;
		try {
			CardImages.BufferCardImages();
		} catch (IOException e) { 
			e.printStackTrace();
		}
		processImage();
	}
	
	
	

	/**
	 * @return the cardData
	 */
	public CardData getCardData() {
		return cardData;
	}




	/**
	 * @param cardData the cardData to set
	 */
	public void setCardData(CardData cardData) {
		this.cardData = cardData;
	}




	/**
	 * @return the suitImge
	 */
	public BufferedImage getSuitImge() {
		return suitImge;
	}




	/**
	 * @param suitImge the suitImge to set
	 */
	public void setSuitImge(BufferedImage suitImge) {
		this.suitImge = suitImge;
	}




	private void processImage() {
		if (this.cardData.getSuit() == CardData.HEART) {
			if (cardData.getValue() == CardData.ACE) {
				this.suitImge = CardImages.getAceHeart();
			} else if (cardData.getValue() == CardData.JACK) {
				this.suitImge = CardImages.getJheart();
			} else if (cardData.getValue() == CardData.QUEEN) {
				this.suitImge = CardImages.getQheart();
			} else if (cardData.getValue() == CardData.KING) {
				this.suitImge = CardImages.getKheart();
			}
		} else if (this.cardData.getSuit() == CardData.SPADE) {
			if (cardData.getValue() == CardData.ACE) {
				this.suitImge = CardImages.getAceSpade();
			} else if (cardData.getValue() == CardData.JACK) {
				this.suitImge = CardImages.getJspade();
			} else if (cardData.getValue() == CardData.QUEEN) {
				this.suitImge = CardImages.getQspade();
			} else if (cardData.getValue() == CardData.KING) {
				this.suitImge = CardImages.getKspade();
			}
		} else if (this.cardData.getSuit() == CardData.DIAMOND) {
			if (cardData.getValue() == CardData.ACE) {
				this.suitImge = CardImages.getAceDiamond();
			} else if (cardData.getValue() == CardData.JACK) {
				this.suitImge = CardImages.getJdiamond();
			} else if (cardData.getValue() == CardData.QUEEN) {
				this.suitImge = CardImages.getQdiamond();
			} else if (cardData.getValue() == CardData.KING) {
				this.suitImge = CardImages.getKdiamond();
			}
		} else if (this.cardData.getSuit() == CardData.TREF) {
			if (cardData.getValue() == CardData.ACE) {
				this.suitImge = CardImages.getAceTref();
			} else if (cardData.getValue() == CardData.JACK) {
				this.suitImge = CardImages.getJtref();
			} else if (cardData.getValue() == CardData.QUEEN) {
				this.suitImge = CardImages.getQtref();
			} else if (cardData.getValue() == CardData.KING) {
				this.suitImge = CardImages.getKtref();
			}
		} else if (this.cardData.getSuit() == CardData.JOKER) {
			this.suitImge = CardImages.getJocker();
		}

	}
}
