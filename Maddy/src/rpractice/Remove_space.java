package rpractice;

import java.util.Scanner;

public class Remove_space 
{
	public static void main(String[] args)
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a string");
	String s1=scan.nextLine();
	String s2="";
    for(int i=0;i<=s1.length()-1;i++)
{
    	char ch=s1.charAt(i);
    	if(ch!=' ')
    	{
    		s2=s2+ch;
    	}
    	
}
    System.out.println(s1);
    System.out.println(s2);
	}
}
