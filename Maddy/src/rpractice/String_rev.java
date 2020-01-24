package rpractice;

import java.util.Scanner;

public class String_rev
{
public static void main(String[] args) 
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a string");
	String s1=scan.next();
	for(int i=s1.length()-1;i>=0;i--)
	{
		char ch=s1.charAt(i);
		System.out.print(ch);
	}

}
}
