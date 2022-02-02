package validationOfEmailId;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
	public static void main(String[] args) {
		
		ArrayList<String> l = new ArrayList<String>();
		  
		//ArrayList size after adding email address to arrayList
		System.out.println("Before adding elements Size of arrayList :"+l.size());
		
		// using add() to initialize email's
	    l.add("harish.yhr123@gmail.com");
	    l.add("Satish.syr412@gmail.com");
	    l.add("phani.ppr@gmail.com");
	    l.add("sivakumar.skr899@gmail.com");
	    l.add("narasa.tnr321@gmail.com");
	    l.add("shankar.bsr@gmail.com");
	    l.add("rami.123456@gmail.com");
	    l.add("hari.123gmail.com");
	    
	    //ArrayList size after adding email address to arrayList
	    System.out.println("After adding elements Size of arrayList :"+l.size());
	    
	    
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the gmail wanted to be valid : ");
	    String ch=sc.next();
	    
	    //By using regex package it will check the email is in vaild form or not
	    String regex="^(.+)@(.+)$";
	    
		Pattern pattern= Pattern.compile(regex);

		for(String email : l)
		{  
            //Create instance of matcher  
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }

	    //it checks is email is presented in the array list or not
	    boolean ch1 = l.contains(ch);
	    
	    if (ch1)
	    {
            System.out.println("The list contains given Email : "+ch);
	    }
        else
        {
            System.out.println("The list does not contains Email: "+ch1);
        }
	}
}
