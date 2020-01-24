package day1;

import java.util.Scanner;

public class Palindromestring
{
public static void main(String[] args)
     {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the string");
	String s1=scan.next();
	s1=s1.toLowerCase().join(" ", "");
	String s2="";
    for(int i=s1.length()-1;i>=0;i++)
    {
    	s2=s2+s1.charAt(i);
    }
    if(s2.equals(s1))
    {
    	System.out.println("string is a palindrome");
    }
    else
    {
    	System.out.println("string is not a palindrome");
    }
     }
}
