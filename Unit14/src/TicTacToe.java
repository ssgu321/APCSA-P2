//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{
		mat = new char[0][0];

	}

	public TicTacToe(String game)
	{

		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				mat[i][j] = game.charAt(3 * i + j );
			}
		}


	}

	public String getWinner()
	{












		return "";
	}

	public String toString()
	{
		String output="";






		return output+"\n\n";
	}
}