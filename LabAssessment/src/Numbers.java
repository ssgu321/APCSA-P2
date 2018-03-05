public class Numbers 
{

	public static void main (String[] args)
	{
		

		System.out.println(isGoofy(12));
		System.out.println(isGoofy(15));
		System.out.println(isGoofy(26));
		System.out.println(isGoofy(8));
		System.out.println(isGoofy(1234));		
		
		System.out.println(getSomeGoofyNumbers(3));	
		System.out.println(getSomeGoofyNumbers(15));		


	}
	
	public static boolean   isGoofy(int num)
	{
		int length = 0, sum = 0, divisor = 1;
		for (int i = 1; num / i >= 1; i *= 10 )
		{
			length++;
		}
		
		for (int k = 0; k < length; k++)
		{
			int digit = (num / divisor) % 10;
			if (num % digit == 0)
			{
				sum += digit;
			}
			
			divisor = divisor * 10;
		
		}
		
		if (sum % 2 == 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	
	}
	
	public static int[] getSomeGoofyNumbers(int count)
	{
		int[] goofyNums = new int[count];
		
				
		
		for(int i = 0; i < count; i++)
		{
			for(int nums = 1; nums < 100; nums++)
			{
				if (isGoofy(nums))
				{
					goofyNums[i] = nums;
					break;
				}
			}
		}
	
		
		
		return goofyNums;
	}
}