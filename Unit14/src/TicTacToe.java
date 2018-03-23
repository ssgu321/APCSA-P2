//� A+ Computer Science  -  www.apluscompsci.com
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
		mat = new char[3][3];
		
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				mat[i][j] = game.charAt(3 * i + j);
			}
		}


	}

	public String getWinner()
	{
		for (int i = 0; i < 3; i++)
		{
			if (mat[i][0] == 'O' && mat[i][1] == 'O' && mat[i][2] == 'O')
			{
				return "O wins horizontally";
			}
			if (mat[i][0] == 'X' && mat[i][1] == 'X' && mat[i][2] == 'X')
			{
				return "X wins horizontally";
			}
			if (mat[0][i] == 'O' && mat[1][i] == 'O' && mat[2][i] == 'O')
			{
				return "O wins vertically";
			}
			if (mat[0][i] == 'X' && mat[1][i] == 'X' && mat[2][i] == 'X')
			{
				return "X wins vertically";
			}
			
		}
		if ((mat[0][0] == 'X' && mat[1][1] == 'X' && mat[2][2] == 'X')
				|| (mat[0][2] == 'X' && mat[1][1] == 'X' && mat[2][0] == 'X'))
		{
			return "X wins diagonally";
		}
		if ((mat[0][0] == 'O' && mat[1][1] == 'O' && mat[2][2] == 'O')
			|| (mat[0][2] == 'O' && mat[1][1] == 'O' && mat[2][0] == 'O'))
		{
			return "O wins diagonally";
		}



		return "cat's game -- no winner";
	}

	public String toString()
	{
		String output="";
		
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				output += String.valueOf(mat[i][j]);
			}
			output += "\n";
		}
		

		return output + getWinner() + "\n";
	}
}