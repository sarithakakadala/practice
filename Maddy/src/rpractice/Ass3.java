package rpractice;

import java.util.Scanner;

public class Ass3 {
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	
	System.out.println("enter a string");
	String s1=scan.next();
	String s2="";
    for(int i=s1.length()-1;i>=0;i--)
    	{
    	char ch=s1.charAt(i);
    	s2=s2+ch;
    	}
    System.out.println(s2);
    if(s1.equalsIgnoreCase(s2))
    {
    	System.out.println("string is a palindrome");
    }
    else
    {
    	System.out.println("string is not a palindrome");
    }
}
}



