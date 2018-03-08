//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;

	public Histogram()
	{
		count = new ArrayList<Integer>();
		letters = new ArrayList<Character>();
		fileName = "";

	}

	public Histogram(char[] values, String fName)
	{
		this();
		for (int i = 0; i < values.length; i++)
		{
			letters.add(values[i]);
		}
		fileName = fName;


		
		out.println("search letters = "+letters);
	}

	public void loadAndAnalyzeFile() throws IOException
	{
		Scanner scan = new Scanner(fileName);
		int num;
		
		
		for (int i = 0; i < letters.size(); i++)
		{
			num = 0; 
			for (int j = 0; j < fileName.length(); j++)
			{
				if(fileName.charAt(j) == letters.get(i))
				{
					num++;
					System.out.println(j);
				}				
			}
			count.add(i, num);
		}

	}

	public char mostFrequent()
	{
		int highest = 0, size = letters.size(); 
		for (int i = 0; i < count.size(); i++)
		{
			highest = Math.max(highest, count.get(i));
		}
		boolean t = false; 
		int spot = -1; 
		while (!t)
		{
			spot++;
			if (count.get(spot) == highest)
			{
				t = true;
			}
			
		}
			
		return letters.get(spot);
	}

	public char leastFrequent()
	{
		int least = 100, size = letters.size(); 
		for (int i = 0; i < count.size(); i++)
		{
			least = Math.min(least, count.get(i));
		}
		boolean t = false; 
		int spot = -1; 
		while (!t)
		{
			spot++;
			if (count.get(spot) == least)
			{
				t = true;
			}
			
		}
		return letters.get(spot);

		
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}