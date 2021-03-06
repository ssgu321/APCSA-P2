//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -


import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic()
	{
		rootOne = 0.0;
		rootTwo = 0.0;

	}

	public Quadratic(int quadA, int quadB, int quadC)
	{
		setEquation(quadA, quadB, quadC);
	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;


 	}

	public void calcRoots( )
	{
		double sqrt = Math.sqrt(pow(b,2) - 2 * a * c);
		rootOne = (-b + sqrt) / (2 * a);
		rootTwo = (-b - sqrt) / (2 * a);

	}

	public void print( )
	{
		System.out.printf("rootone :: %.2f\n", rootOne);
		System.out.printf("roottwo :: %.2f\n", rootTwo);

	}
}