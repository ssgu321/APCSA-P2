/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card test1 = new Card("spades", "number", 2);
		System.out.println(test1.suit());
		System.out.println(test1.rank());
		System.out.println(test1.pointValue());
		
		Card test2 = new Card("spades", "number", 2);
		System.out.println(test2.suit());
		System.out.println(test2.rank());
		System.out.println(test2.pointValue());
		
		
		Card test3 = new Card("hearts", "ace", 1 );
		System.out.println(test3.suit());
		System.out.println(test3.rank());
		System.out.println(test3.pointValue());
		
		
		System.out.println(test1.matches(test2));
		System.out.println(test1.matches(test3));
		
		
		
	}
}
