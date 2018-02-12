//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response = 'y';
		
		while (response == 'y')
		{
			System.out.println("Guessing Game - how many numbers?");
			GuessingGame test = new GuessingGame(keyboard.nextInt());
			test.playGame();
			System.out.println(test.toString() + "\n");
			
			System.out.println("Do you want to play again? (y or n)");
			response = keyboard.next().charAt(0);
		}
		
		
		
		
		






	}
}