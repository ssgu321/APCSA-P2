//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab14d
{
	public static void main( String args[] )
	{
		//add test cases
		Grades test = new Grades();
		double[] g = {100, 90, 85, 72.6, 95.4};
		test.setGrades(g);
		System.out.println(test.toString());
		
		double[] s = {50.0, 100.0, 80.0};
		test.setGrades(s);
		System.out.println(test.toString());
		
		double[] t = {93.4, -90.0, 90.0};
		test.setGrades(t);
		System.out.println(test.toString());
		
		double[] c = {1,2,3,4,5,6,7,8,9};
		test.setGrades(c);
		System.out.println(test.toString());
		
		
	}
}