//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import static java.lang.System.*;
import java.util.Arrays;		//use Arrays.toString() to help print out the array

public class QuickSort
{
	private static int passCount;

	public static void quickSort(Comparable[] list)
	{
		passCount = 0;
		quickSort(list, 0, list.length - 1);
	}


	private static void quickSort(Comparable[] list, int low, int high)
	{

		if (low < high){
			int p = partition(list, low, high);
			quickSort(list, low, p);
			quickSort(list, p+1, high);
		}


	}


	private static int partition(Comparable[] list, int low, int high)
	{
		Comparable pivot = list[0];
		int bot = low - 1;
		int top = high + 1;

		while (bot < top){
			
		}












		return 0;
	}
}