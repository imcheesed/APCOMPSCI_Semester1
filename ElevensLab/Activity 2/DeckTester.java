/**
 * This is a class that tests the Deck class.
 */
public class DeckTester 
{

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
	{
		String[] rank1 = {"2", "5", "King"};
		String[] suit1 = {"Hearts", "Clubs", "Diamonds"};
		int[] value1 = {2, 5, 13};
	    Deck deck1 = new Deck(rank1, suit1, value1);
	    System.out.println("Deck1 size should be 3: " + deck1.size());
	    
	    String[] rank2 = {"Ace", "Queen", "9"};
	    String[] suit2 = {"Diamonds", "Spades", "Clubs"};
	    int[] value2 = {1, 12, 9};
	    Deck deck2 = new Deck(rank2, suit2, value2);
	    System.out.println("Deck2 should not be empty: " + !deck2.isEmpty());
	    
	    String[] rank3 = {"Jack", "4", "Queen"};
	    String[] suit3 = {"Diamonds", "Spades", "Hearts"};
	    int[] value3 = {11, 4, 12};
	    Deck deck3 = new Deck(rank3, suit3, value3);
	    System.out.println("Deck3 dealt card is: " + deck3.deal());
	   
	}
}