//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		sentence = "";
		lookFor = ' ';
	}

	public LetterRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		
		int loc = cleaned.indexOf(lookFor);
		while (loc != -1)
		{
			cleaned = cleaned.replace(cleaned.substring(loc, loc + 1), "");
			loc = cleaned.indexOf(lookFor);
		}

		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "\n" + removeLetters() + "\n";
	}
}