//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		
		Scanner file = new Scanner(new File("C:\\Users\\gus1430\\Desktop\\APCSA-P2\\Unit14\\src\\lab21i.dat"));
		
		while (file.hasNextLine())
		{		
			Maze test = new Maze(file.nextInt(), file.nextLine());
			out.println(test);
		} 
	}
}