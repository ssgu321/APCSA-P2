//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Fahrenheit
{
	private double fahrenheit;

	public void setFahrenheit(double fahren)
	{
		fahrenheit = fahren;
	}

	public double getCelsius()
	{
		double celsius = 0.0;
		//add code to convert fahrenheit to celsius
		celsius = (fahrenheit - 32) * 5.0/9;
		
		return celsius;
	}

	public void print()
	{
		
		System.out.printf("%.2f degrees Fahrenheit == ", fahrenheit);
		//this is part of the solution
		System.out.print(getCelsius());
		System.out.print(" degrees Celsius \n\n");
	}
}