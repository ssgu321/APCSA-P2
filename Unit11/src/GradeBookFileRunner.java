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
		Class test = new Class(classname, number);
		
		out.println(number);

		String name, gradelist;
		for (int i = 0; i < number; i++)
		{
			gradelist = file.nextLine();
			
			//file.nextLine();
			name = file.nextLine();
			//out.println(gradelist);
			out.println(name);

			//test.addStudent(i,new Student(name, gradelist));

		}

		
		
		//out.println(test);
		/*
		out.println(String.format(test.getStudentName(0) + "\'s average = %.2f",test.getStudentAverage(0)));	
		out.println(String.format(test.getStudentName(1) + "\'s average = %.2f",test.getStudentAverage(1)));	
		out.println(String.format(test.getStudentName(2) + "\'s average %.2f",test.getStudentAverage(2)));	
		
		out.println(String.format("Sandy" + "\'s average %.2f",test.getStudentAverage("Sandy")));	

		out.println("Failure List = " + test.getFailureList(70));	
		out.println("Highest Average = " + test.getStudentWithHighestAverage());
		out.println("Lowest Average = " + test.getStudentWithLowestAverage());
								
		out.println(String.format("Class Average = %.2f",test.getClassAverage()));	*/











	}		
}