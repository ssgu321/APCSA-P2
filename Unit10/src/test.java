import java.util.Scanner;

public class test {

	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Enter name");
		System.out.println("Enter height");
		System.out.println("Enter speed");
		
		System.out.println(keyboard.nextLine() + "  " + keyboard.nextInt() + "  " + keyboard.nextDouble());
		
		
	}
}
