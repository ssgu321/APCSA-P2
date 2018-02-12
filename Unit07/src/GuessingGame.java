//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;
	private int ans, guess, totalGuesses = 0, wrongAns = 0, percent;

	public GuessingGame(int stop)
	{
		upperBound = stop;

	}

	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		
		ans = (int)(Math.random() * upperBound + 1);
		System.out.println("Ans = " + ans);
		
		do{
			System.out.println("Enter a number between 1 and " + upperBound + ": ");
			guess  = keyboard.nextInt();
			totalGuesses ++;
			if (guess != ans)
			{
				wrongAns++;
			}
		} while (guess != ans);

	
		

	}

	public String toString()
	{
		String output="It took " + totalGuesses + " guesses to get " + ans
				+ "\nYou guessed right " + 100/totalGuesses + " percent of the time.\n\n";
		return output;
	}
	
	
}