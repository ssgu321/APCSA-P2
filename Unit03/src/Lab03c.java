//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03c
{
	public static void main( String[] args )
   {
		
	
	
   	//add test cases
   	Quadratic test = new Quadratic();
   	

   	
   	test.setEquation(1, 6, 9);
   	test.calcRoots();
   	test.print();
   	
   	test.setEquation(2,6,3);
   	test.calcRoots();
   	test.print();
   	
   	test.setEquation(2,6,8);
   	test.calcRoots();
   	test.print();
   	
   	test.setEquation(1,9,5);
   	test.calcRoots();
   	test.print();
   	
   	test.setEquation(5,7,2);
   	test.calcRoots();
   	test.print();
   	
		
		
	}
}