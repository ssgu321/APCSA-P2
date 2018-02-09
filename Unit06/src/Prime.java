//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.lang.Math;

public class Prime
{
	private int number;

	public Prime()
	{
		number = 0;

	}

	public Prime(int num)
	{
		number = num;
	}

	public void setPrime(int num)
	{
		number = num;
	}

	public boolean isPrime()
	{
		int start = 2;
		if (start <= Math.sqrt(number))
		{
			if (number % start == 0 )
			{
				return false;
			}
			start ++;
		}

		return true;
	}

	public String toString()
	{
		String output = "";
		if (isPrime())
		{
			output= number +
					" is prime.\n";
		}
		else
		{
			output= number +
					" is not prime.\n";
		}
		
		
		return output;
	}
}