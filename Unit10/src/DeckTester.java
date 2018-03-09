/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		
		String[] a = {"A", "B", "C"};
		String[] b = {"Giraffes", "Lions"};
		int[] c = {1,2,3};
		Deck test1 = new Deck(a, b, c);
		System.out.println(test1.isEmpty());
		System.out.println(test1.size());
		System.out.println(test1.deal());
		
		String[] d = {"J", "Q", "K"};
		String[] e = {"Red", "Black"};
		int[] f = {11, 12, 13};
		Deck test2 = new Deck(d, e, f);
		System.out.println(test2.isEmpty());
		System.out.println(test2.size());
		System.out.println(test2.deal());
		
		String[] g = {"A", "Q", "K"};
		String[] h = {"Green", "Blue"};
		int[] i = {11, 12, 13};
		Deck test3 = new Deck(g, h, i);
		System.out.println(test3.isEmpty());
		System.out.println(test3.size());
		System.out.println(test3.deal());
		
		
		String[] newRanks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		String[] newSuits = {"spades", "clubs", "hearts", "diamonds"};
		int[] newValues = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		int[] newdeck = new int[newRanks.length * newValues.length];
		Deck newtest = new Deck(newRanks, newSuits, newValues);
		System.out.println(newtest.isEmpty());
		System.out.println(newtest.size());
		newtest.shuffle();
		System.out.println(newtest.deal());
		System.out.println(newtest.toString());
	}
}
