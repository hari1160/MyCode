package filehandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Append {
	
	public static void usingPath() throws IOException 
	{
		//adding 
	    String add = "Welcome to new job....";
	    
	    Path path = Paths.get("D:\\test.txt");
	    
	    Files.write(path, add.getBytes(), StandardOpenOption.APPEND);
	}
}
	
