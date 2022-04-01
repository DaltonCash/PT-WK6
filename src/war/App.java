package war;
public class App {

	public static void main(String[] args) {

		Deck deck = new Deck();
		Player player1 = new Player();
		Player player2 = new Player();
		player1.setName("Player 1");
		player2.setName("Player 2");
		
		
		deck.shuffle(deck);
		
		dealTheCards(deck, player1, player2);
		
		commenceWar(player1, player2);
		
		player1.describe();
		player2.describe();
		
		announceWinner(player1, player2);	
	}
	
	//Distributes cards from the deck between players.
	public static void dealTheCards(Deck deck, Player player1, Player player2) {
		for(int i = 0; i < 52; i++) {
			if(i % 2 == 0) {
				player1.draw(deck);
			}else {
				player2.draw(deck);
			}
		}	
	}
	
	//Players compare cards using the flip method. A Player's score is increased by 1 if their card's value is greater.
	public static void commenceWar(Player player1, Player player2) {
		for(int i = 0; i < 26; i++) {
			
			Card card1 = player1.flip();
			Card card2 = player2.flip();
			
			if(card1.getValue() > card2.getValue()) {
				player1.incrementScore();
				
			}else if (card1.getValue() < card2.getValue()) {
				player2.incrementScore();
				
			}
		}
	}
	
	//Announces the winner of the game or a draw.
	public static void announceWinner(Player player1, Player player2) {
		System.out.println();
		if(player1.getScore() > player2.getScore()) {
			System.out.println("Player 1 wins!");
		}
		if(player2.getScore() > player1.getScore()) {
			System.out.println("Player 2 wins!");
		}
		if(player1.getScore() == player2.getScore()) {
			System.out.println("Draw!");
		}
	}
}