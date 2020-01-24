package practice2;

import java.util.Scanner;

public class Palindrome 
{
public static void main(String[] args) 
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a string");
	String s1=scan.next();
	String rev=reverse(s1);
	if(s1.equalsIgnoreCase(rev))
	{
		System.out.println(s1+"  is a palindrome");
	}
	else
	{
		System.out.println(s1+"  is not a palindrome");
	}
}
    
      public static String reverse(String s1)
      {
       String rev="";
       for(int i=s1.length()-1;i>=0;i--)
    {
	char ch=s1.charAt(i);
	rev=rev+ch;
     }
     return rev;
      }

}


