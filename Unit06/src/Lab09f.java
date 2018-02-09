//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab09f
{
	public static void main( String args[] )
	{
		//add test cases
		LetterRemover test = new LetterRemover();
		test.setRemover("I am Sam I am   a", 'a');
		System.out.println(test.toString());
		
		test.setRemover("abababababba", 'b');
		System.out.println(test.toString());
		
		test.setRemover("abababababa", 'x');
		System.out.println(test.toString());
		
											
	}
}