//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Class
{
	private String name;
	private Student[] studentList;
	
	public Class()
	{
		name="";
		studentList=new Student[0];
	}
	
	public Class(String nam, int stuCount)
	{
		name = nam;
		studentList = new Student[stuCount];
	
	}
	
	public void addStudent(int stuNum, Student s)
	{
		studentList[stuNum] = s;

	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;
		for (int i = 0; i < studentList.length; i++)
		{
			classAverage += getStudentAverage(i);
		}
		
		return classAverage / studentList.length;
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList[stuNum].getAverage();
	}

	public double getStudentAverage(String stuName)
	{
		int spot = 0;
		for (int i = 0; i < studentList.length; i++)
		{
			if (studentList[i].getName() == stuName)
			{
				spot = i;
			}
		}

		return studentList[spot].getAverage();
	}
	
	public String getStudentName(int stuNum)
	{
		return studentList[stuNum].getName();
	}

	public String getStudentWithHighestAverage()
	{
		double high = Double.MIN_VALUE;
		String hName ="";
		for (int i = 0; i < studentList.length; i++)
		{
			high = Math.max(high, getStudentAverage(i));
		}
		
		//get Name
		int spot = 0;
		for (int i = 0; i < studentList.length; i++)
		{
			if (studentList[i].getAverage() == high)
			{
				spot = i;
			}
		}
		hName = studentList[spot].getName();

		return hName;
	}

	public String getStudentWithLowestAverage()
	{
		double low = Double.MAX_VALUE;
		String hName ="";	
		
		for (int i = 0; i < studentList.length; i++)
		{
			low = Math.min(low, getStudentAverage(i));
		}
		
		//get Name
		int spot = 0;
		for (int i = 0; i < studentList.length; i++)
		{
			if (studentList[i].getAverage() == low)
			{
				spot = i;
			}
		}
		hName = studentList[spot].getName();

		return hName;
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";
		for (int i = 0; i < studentList.length; i++)
		{
			if (studentList[i].getAverage() < 60.0)
			{
				output += studentList[i].getName() + "  ";
			}
		}
		
		return output;
	}
	
	public String toString()
	{
		String output=""+getClassName()+"\n";
		
		for (int i = 0; i < studentList.length; i++)
		{
			output += studentList[i].toString() + "\t" + getStudentAverage(i) + "\n";
		}
		



		return output;
	}  	
}