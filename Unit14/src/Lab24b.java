//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab24b
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File ("H:\\APCS\\Unit14_2016\\Unit14-Assignments\\lab24b.dat"));
		int size = file.nextInt();
		file.nextLine();
		String word = file.next();
		FancyWord test = new FancyWord(word);
		out.println(test);
		for(int i = 0; i< size -1; i++)
		{
			 word = file.next();
			 test = new FancyWord(word);
			out.println(test);
			


	   }
	}
}