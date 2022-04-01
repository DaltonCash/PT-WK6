package war;

public class Card {
	
	//fields for card
	 private int value;
	 private String name;
	 
	public Card(int value, String name) {
		this.value = value;
		this.name = name;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//Print the value and name of Card.
	public void describe() {
		System.out.println(value + " of " + name);
	}
}