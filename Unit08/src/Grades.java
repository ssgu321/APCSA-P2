//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.lang.Math;
import java.util.Scanner;

public class Grades
{
	//instance variables
	private double[] grad;
	

	//constructor
	public Grades()
	{
		grad = null;
	}
	
	public Grades(double[] gr)
	{
		grad = gr;
	}


	//set method
	public void setGrades(double[] gr)
	{
		grad = gr;
	}


	private double getSum()
	{
		double sum=0.0;
		for (int i =0; i < grad.length; i++)
		{
			sum += grad[i];
		}
		return sum;
	}

	public double getAverage()
	{
		double average=0.0;
		int total = grad.length;
		
		average = getSum() / total;


		return average;
	}


	//toString method
	public String toString()
	{
		String output = "";
		for (int i = 0; i < grad.length; i++)
		{
			output += "grade " + (i + 1) + ":: " + grad[i] + "\n";
		}
		
		output += "\n\naverage = " + getAverage() + "\n\n";
		
		return output;
	}


}