//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
		size = 0;
		letter = "";
	}

	public TriangleThree(int count, String let)
	{
		size = count;
		letter = let;
	}

	public void setTriangle( String let, int sz )
	{
		size = sz;
		letter = let;
	}

	public String getLetter()
	{
		return letter;
	}

	public String toString()
	{
		String output="";
		int num = 1;
		for (int i = 1; i <= size; i++)
		{			
			for(int space = 1; space <= (size - num); space++)
			{
				output += " ";
			}
			for(int let = 0; let < num; let++ )
			{
				output += letter;
			}
			output += "\n";
			num++;
		}
		return output+"\n";
	}
}