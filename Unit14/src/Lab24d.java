//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("H:\\APCS\\Unit14_2016\\Unit14-Assignments\\lab24d.dat"));
		
		int size = file.nextInt();
		file.nextLine();
		String line = file.nextLine();
		line = line.replaceAll(" ", "");
		TicTacToe test = new TicTacToe(line);
		out.println(test);
		
		while(file.hasNext()){
			file.nextLine();
			line = file.nextLine();
			line = line.replaceAll(" ", "");
			 test = new TicTacToe(line);
			out.println(test);	
		}

	}
}



