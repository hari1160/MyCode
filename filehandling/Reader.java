package filehandling;

import java.io.FileReader;

public class Reader
{
    public static void main(String args[])throws Exception
    {
        FileReader filereader=new FileReader("D:\\test.txt");
        
        int n;
        
        while((n=filereader.read())!=-1) 
        	
        System.out.print((char)n);
        
        filereader.close();
        
        System.out.println("Successfully reading into the existing file.....");
  }
    
}

