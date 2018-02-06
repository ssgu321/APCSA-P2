//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab02f
{
	public static void main( String[] args )
   {
		Line test = new Line(0, 0, 0, 0);
		
		test.setCoordinates(3, 5, -6, 4);
		test.calculateSlope();
		test.print();
		
		test.setCoordinates(-3, 5, 8, 2);
		test.calculateSlope();
		test.print();
		
		test.setCoordinates(6, 11, 36, 56);
		test.calculateSlope();
		test.print();
		
		test.setCoordinates(-5, 4, 13, -7);
		test.calculateSlope();
		test.print();
		
		test.setCoordinates(5, -3, 7, 23);
		test.calculateSlope();
		test.print();
		
		
		
		
		
		
		
	}
}