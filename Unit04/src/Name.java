//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Name
{
	private String name;

	public Name()
	{
		name = "";

	}

	public Name(String s)
	{
		setName(s);

	}

   public void setName(String s)
   {
	   name = s;

   }

	public String getFirst()
	{
		String first = name.substring(0, name.indexOf(' '));
		return first;
	}

	public String getLast()
	{
		String last = name.substring(name.indexOf(' ') +1);
		return last;
	}

 	public String toString()
 	{
 		return name;
	}
}