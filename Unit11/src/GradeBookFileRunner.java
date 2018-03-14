//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;

public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner file = new Scanner(new File("H:\\APCS\\Unit11-2016\\Unit11-Assignments\\Lab19b\\gradebook.dat"));
		
		String classname = file.nextLine();
		int number = file.nextInt();
		file.nextLine();
		Class test = new Class(classname, number);
		
		String name, gradelist;
		
		
		for (int i = 0; i < number; i++)
		{
			name = file.nextLine();				
			gradelist = file.nextLine();		

			test.addStudent(i,new Student(name, gradelist));
		}

		
		
		out.println(test);
		
		test.sort();
		out.println(test);
		out.println("Failure List = " + test.getFailureList(70));	
		out.println("Highest Average = " + test.getStudentWithHighestAverage());
		out.println("Lowest Average = " + test.getStudentWithLowestAverage());
								
		out.println(String.format("Class Average = %.2f",test.getClassAverage()));	



	}		
}