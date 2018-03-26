//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab21g
{
	public static void main(String args[])
	{
		//instantiate an AtCounter
		AtCounter test = new AtCounter();
		test.countAts(0,0);
		out.println("0 0 has " + test);
		
		AtCounter test1 = new AtCounter();
		test1.countAts(2,5);
		out.println("2 5 has " + test1);
		
		AtCounter test2 = new AtCounter();
		test2.countAts(5,0);
		out.println("5 0 has " + test2);
		
		AtCounter test3 = new AtCounter();
		test3.countAts(9,9);
		out.println("9 9 has " + test3);
		
		AtCounter test4 = new AtCounter();
		test4.countAts(3,9);
		out.println("3 9 has " + test4);
	}
}