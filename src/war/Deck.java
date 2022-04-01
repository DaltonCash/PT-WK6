package war;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("serial")
public class Deck extends LinkedList<Card>{
	
	private List<Integer> cards = List.of(2,3,4,5,6,7,8,9,10,11,12,13,14);
	private List<String> suit = List.of("Hearts","Clubs","Diamonds","Spades");
	
	//Constructor for the list of cards in the deck
	public Deck(){
		for(int card : cards) {
			for(String name : suit) {
				add(new Card(card, name));
			}
		}
	}
	
	//Shuffles the order of the cards in the deck
 	public List<Card> shuffle(List<Card> deck){
		Collections.shuffle(deck);
		return deck;	
	}
 	
	//Returns and removes the top card from the deck
	public Card draw() {
		return remove(0);
	}
}