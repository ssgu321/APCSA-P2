//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03d
{
	public static void main( String[] args )
	{
		
		Scanner keyboard = new Scanner (System.in);
		int x1, y1, x2, y2;
		
		//add test cases
		Distance test = new Distance();
		
		System.out.print("Enter x1 :: ");
		x1 = keyboard.nextInt();
		System.out.print("Enter y1 :: ");
		y1 = keyboard.nextInt();
		System.out.print("Enter x2 :: ");
		x2 = keyboard.nextInt();
		System.out.print("Enter y2 :: ");
		y2 = keyboard.nextInt();
		
		test.setCoordinates(x1, y1, x2, y2);
		test.calcDistance();
		test.print();
		
		
		System.out.print("Enter x1 :: ");
		x1 = keyboard.nextInt();
		System.out.print("Enter y1 :: ");
		y1 = keyboard.nextInt();
		System.out.print("Enter x2 :: ");
		x2 = keyboard.nextInt();
		System.out.print("Enter y2 :: ");
		y2 = keyboard.nextInt();
		
		test.setCoordinates(x1, y1, x2, y2);
		test.calcDistance();
		test.print();
		
		
		System.out.print("Enter x1 :: ");
		x1 = keyboard.nextInt();
		System.out.print("Enter y1 :: ");
		y1 = keyboard.nextInt();
		System.out.print("Enter x2 :: ");
		x2 = keyboard.nextInt();
		System.out.print("Enter y2 :: ");
		y2 = keyboard.nextInt();
		
		test.setCoordinates(x1, y1, x2, y2);
		test.calcDistance();
		test.print();

		
		
			
	}
}