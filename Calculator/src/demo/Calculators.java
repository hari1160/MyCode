package demo;
import java.util.Scanner;
public class Calculators 
{
	public static void main(String[]args)
	{
		int x,y,cal;
		
		System.out.println("Enter two numbers :");
		Scanner n=new Scanner(System.in);
		System.out.println("Enter x value:");
		x=n.nextInt();
		System.out.println("Enter y value:");
		y=n.nextInt();
		
		//select operation which wanted to be implemented
		System.out.println("Select Operation: ");
		double z = n.nextInt();
		
		if(z==1)
		{
			//if "1" is selected addition will occur
			cal=x+y;
			System.out.println("Addition of "+ x +" and  "+ y + " is "+cal);
		}
		else if(z==2)
		{
			//if "2" is selected Subtraction will occur
			cal=x-y;
			System.out.println("Subtraction of "+ x +" and  "+ y + " is "+cal);
		}
		else if(z==3)
		{
			//if "3" is selected Multiplication will occur
			cal=x*y;
			System.out.println("Multiplication of "+ x +" and  "+ y + " is "+cal);
		}
		else if(z==4)
		{
			//if "4" is selected Division will occur
			cal=x/y;
			System.out.println("Division of "+ x +" and  "+ y + " is "+cal);
		}
		else
		{
			//if given input is invalid
			System.out.println("Invaild input Select valid input");
			
		}
	}
}

