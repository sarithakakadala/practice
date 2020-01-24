package rpractice;

import java.util.Scanner;

public class String_compare2 
{
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter 1st string");
		String s1=scan.next();
		System.out.println("enter 2nd string");
		String s2=scan.next();
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("strings are similar");
		}
		else
			
		{
			System.out.println("strings are not similar");
		}
	}
	}


