//Name: Joanna Choi 
//VUnetid: choije
//Email: joanna.e.choi@vanderbilt.edu
//Honor statement: I have neither given or received any unauthorized aid on this assignment
//Class: CS101, Vanderbilt University
//Date: 11/19/14

// Description: Represents a single playing card.

import java.util.*;

public class Card {

	// DO NOT CHANGE THESE TWO LINES OF CODE
	public static final String[] suits = { "Spades", "Hearts", "Clubs",
			"Diamond" };

	public static final String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7",
			"8", "9", "10", "Jack", "Queen", "King" };

	private int rank;
	private int suit;

	public Card(int newSuit, int newRank) {
		if (newRank < 0 || newRank > 12 || newSuit < 0 || newSuit > 3){
			throw new IllegalArgumentException();
		}
		rank = newRank;
		suit = newSuit;
	}

	public String getSuit() {
		return suits[suit];
	}

	public String getRank() {
		return ranks[rank];
	}

	public String toString() {
		return ranks[rank] + " of " + suits[suit];
	}

	public boolean equals(Object other) {
		Card card = (Card) other;
		if (card.getSuit().equals(getSuit())
				&& card.getRank().equals(getRank())) {
			return true;
		} else {
			return false;
		}
	}

	public int getDeeptiValue() {
		if (suit == 1 || suit == 2) {
			if (rank == 0){
				return 14;
			} else {
				return (rank+1);
			}
		} else {
			if (rank == 0){
				return 28;
			} else {
				return (rank+1)*2;
			}
		}
	}

}
