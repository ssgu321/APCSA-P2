package Lab18d;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18d
{
	public static void main( String args[] ) throws IOException
	{
		ArrayList<Word> unsorted = new ArrayList<Word>();
		
		Scanner file = new Scanner(new File("H:\\APCS\\Unit12-2016\\Unit12-Assignments\\lab18d\\lab18d.dat"));

		int size = file.nextInt();
		
		while(file.hasNext())
		{
			Word test = new Word(file.nextLine());
			unsorted.add(test);
			
		}
		
		unsorted.remove(0);
		out.println(unsorted);	
		Word min = new Word("gekkkiiisfgsfgsdfgsgs");
		
		int ind = 0;
		for (int j = 0 ; j < size; j++)
		{
			for (int i = 0; i < unsorted.size() ; i++)
			{
				if (unsorted.get(i).compareTo(min) == -1)
				{
					min  = unsorted.get(i);
					ind = i;
				}
			}
			out.println(min);
			min = new Word("gekkkiiisfgfgfsgss");
			unsorted.remove(ind);
			
		}
		




	}
}