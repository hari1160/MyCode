package filehandling;

import java.io.FileWriter;
public class Writer
{
    public static void main(String args[])
    {    
         try
         {
           FileWriter filewriter=new FileWriter("D:\\test.txt");
           filewriter.write("Welcome to programming world");
           filewriter.close();
          }
         catch(Exception e)
         {
        	 System.out.println(e);
         }
         
       System.out.println("Successfully written into the file!!!!");
     
    }   
} 
