package filehandling;

import java.io.IOException;

public class Main extends Append{
	public static void main(String[]args)
	{
		try 
		{
			usingPath();
		} 
		catch (IOException e)
		{
			
			e.printStackTrace();
		}
		System.out.println("Successfully append into the existing file.....");
	}
	
}
