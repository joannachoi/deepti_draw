//Name: Joanna Choi 
//VUnetid: choije
//Email: joanna.e.choi@vanderbilt.edu
//Honor statement: I have neither given or received any unauthorized aid on this assignment
//Class: CS101, Vanderbilt University
//Date: 11/19/14

// Description: Card Player.

public class Player {

	private String name;
	private Card lastCard;
	private int score;

	public Player(String newName) {
		lastCard = null;
		score = 0;
		name = newName;
	}

	public Card getLastDraw() {
		return lastCard;
	}

	public int getScore() {
		return score;
	}

	public void resetScore() {
		score = 0;
	}

	public void increaseScore(int newPoints) {
		score = score + newPoints;
	}

	public String toString() {
		return name;
	}

	// fix this
	public Card takeTurn(Deck deckOfCards) {
		for (int i = 0; i < DeeptiDraw.DEEPTI_DRAW_MAX-1; i++){
			lastCard = deckOfCards.draw();
			if (lastCard.getDeeptiValue() > 6){
				return lastCard;
			}
		}
		lastCard = deckOfCards.draw();
		return lastCard;

	}

}
