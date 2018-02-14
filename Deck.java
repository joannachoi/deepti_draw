// Description: Deck of cards.

import java.util.Random;

public class Deck {

	public static final int SIZE_OF_DECK = Card.suits.length
			* Card.ranks.length; // 52

	private Card[] cards;
	private Card lastCard;
	private int numOfCards;

	public Deck() {
		cards = new Card[SIZE_OF_DECK];
		lastCard = cards[SIZE_OF_DECK-1];
		initialize();
		//numOfCards = SIZE_OF_DECK;
	}

	public void initialize() {
		int position = 0;

		// rank
		for (int i = 0; i < 13; i++) {
			// suit
			for (int j = 0; j < 4; j++) {
				cards[position] = new Card(j, i);
				position++;
			}
		}
		numOfCards = SIZE_OF_DECK;
	}

	public boolean isEmpty() {
		if (numOfCards == 0) {
			return true;
		} else {
			return false;
		}
	}

	// fix maybe?
	public int numberOfCards() {
		return numOfCards;
	}

	public Card draw() {
		if (numOfCards == 0) {
			initialize();
		}

		Random rand = new Random();
		int randomPosition = rand.nextInt(SIZE_OF_DECK);
		if (cards[randomPosition] != null) {
			lastCard = cards[randomPosition];
			cards[randomPosition] = null;
		}
		numOfCards--;
		return lastCard;
	}

	public Card getLastDraw() {
		return lastCard;
	}

}
