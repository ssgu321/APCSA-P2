//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	private String sentence;
	
	public MadLib()
	{
		verbs = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();
		sentence = "";

	}

	public MadLib(String fileName)
	{
		//load stuff
		this(); // execute what is under MadLib default
		loadNouns();
		loadVerbs();
		loadAdjectives();
		
		try{
			Scanner file = new Scanner(new File(fileName));
			
			
		
		
		
		
		
	
		
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		try{
			
			Scanner scan = new Scanner(new File("H:\\APCS\\Unit10-2016\\Unit10-Assignments\\Lab16d\\nouns.dat"));

		while(scan.hasNextLine()){
			nouns.add(scan.nextLine());
		}
		
		
		
		}
		catch(Exception e)
		{
			
		}	
		
	}
	
	public void loadVerbs()
	{
		try{
		
			Scanner scan = new Scanner(new File("H:\\APCS\\Unit10-2016\\Unit10-Assignments\\Lab16d\\verbs.dat"));
			while(scan.hasNextLine()){
				verbs.add(scan.nextLine());
			}
	
	
	
		}
		catch(Exception e)
		{
		}
	}

	public void loadAdjectives()
	{
		try{
			
			Scanner scan = new Scanner(new File("H:\\APCS\\Unit10-2016\\Unit10-Assignments\\Lab16d\\adjectives.dat"));
			while(scan.hasNextLine()){
				adjectives.add(scan.nextLine());
			}
	
	
	
		}
		catch(Exception e)
		{
		}
	}

	public String getRandomVerb()
	{
		int size = verbs.size();
		int randVerb = (int)(size * Math.random());
		
		return verbs.get(randVerb);
	}
	
	public String getRandomNoun()
	{
		int size = nouns.size();
		int randNouns = (int)(size * Math.random());
		
		return verbs.get(randNouns);
	}
	
	public String getRandomAdjective()
	{
		int size = adjectives.size();
		int randAdj= (int)(size * Math.random());
		
		return verbs.get(randAdj);
	}		

	public String toString()
	{
	   return "\n\n\n";
	}
}