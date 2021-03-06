package Unit18e;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s)
	{
		word = s;
	}

	int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
		
	
		for (int i = 0; i < word.length(); i++)
		{
			for (int j = 0; j < vowels.length(); j++)
			{
				if(word.substring(i, i+1).equals(vowels.substring(j, j+1)))
				{
					vowelCount++;
				}
			}
		}
		
		return vowelCount;
	}

	public int compareTo(Word rhs)
	{
		if (word.equals(rhs.toString()))
			return 0;
		else if (numVowels() < rhs.numVowels())
			return -1; 
		else if (numVowels() == rhs.numVowels())
		{
			return 0; 
		}	
		
		
		return 1;

	}

	public String toString()
	{
		return word;
	}
}