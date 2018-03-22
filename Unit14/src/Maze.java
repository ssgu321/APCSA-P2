//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private int[][] maze;
   private boolean exitFound;

	public Maze()
	{
		exitFound = false;
		maze = new int[0][0];
	}

	public Maze(int size, String line)
	{
		maze = new int[size][size];
		for (int i = 0; i < size; i++)
		{
			for (int j = 0; j < size;  j++)
			{
				maze[i][j] = (int)line.charAt((size * i + j));
			}
		}

	}

	public void hasExitPath(int r, int c)
	{
		if (r < maze.length && c < maze.length && r >= 0 && c >= 0 && maze[r][c] == 1)
		{
			
			if (c == maze.length - 1)
			{
				exitFound = true;
			}
			else if (maze[r][c] == 1)
			{
				maze[r][c] = 2;
				hasExitPath(r, c + 1);
				hasExitPath(r, c - 1);	
				hasExitPath(r + 1, c);
				hasExitPath(r - 1, c);
				maze[r][c] = 1;
			}
		}

	}

	public String toString()
	{
		String output="";
		for (int i = 0; i < maze.length; i++)
		{
			for (int j = 0; j < maze[i].length; j++)
			{
				output += maze[i][j];
			}
			output += "\n";
		}

		return output;
	}
}