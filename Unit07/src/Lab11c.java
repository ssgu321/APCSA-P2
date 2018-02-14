//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class Lab11c
{
   public static void main( String args[] )
   {
	   Scanner keyboard = new Scanner(System.in);
	   
	   out.println("Letter: " );
	   String let = keyboard.next();
	   out.println("Number: ");
	   int num = keyboard.nextInt();
	   TriangleThree test = new TriangleThree();
	   test.setTriangle(let, num);
	   
	   out.println(test.toString());
	   
	   





	}
}