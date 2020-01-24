package rpractice;

import java.util.Scanner;

public class String_count
{
	
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a string");
	String sc=scan.next();
	char ch1=scan.next().charAt(0);
	int count=0;
	for(int i=0;i<=sc.length()-1;i++)
	{
		char ch=sc.charAt(i);
		if(ch1==ch)
		{
			count++;
		}
	}
	System.out.println(count);
	
}
}
