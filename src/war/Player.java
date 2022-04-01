package war;

import java.util.LinkedList;
import java.util.List;


public class Player{

	private List<Card> hand = new LinkedList<Card>();
	private int score;
	private String name;
	
	public int getScore(){
		return score;
	}
	
	public void setName(String name) {
		this.name = name;	
	}
	
	//Prints out information about the player. Does not print the player's hand if it's empty.
	public void describe() {
		System.out.println(name + ":");
		System.out.println("Current Score: " + score);
		if(hand.isEmpty() == false) {
			System.out.println("Current Hand: ");
			for(Card card : hand) {
				card.describe();
			}
		}
	}
	
	//Distributes a card from the deck
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	//Takes cards from the hand and returns the first card in the List while removing it from hand.
	public Card flip() {
		return hand.remove(0);
	}
	
	//Increases score by 1
	public void incrementScore() {
		score++;
	}
}