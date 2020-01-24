package rpractice;

import java.util.Scanner;

public class Assgn1
{
public static void main(String[] args) 
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a string");
	String s1=scan.next();
	System.out.println("enter a character");
    char ch=scan.next().charAt(0);
    int status=0;
    for(int i=0;i<=s1.length()-1;i++)
    {
    	char ch1=s1.charAt(i);
    	if(ch1==ch)
    	{
    	status++;
    	if(status>0)
    	{
    		System.out.println(i);
    	}
    	}
    }
}
}
