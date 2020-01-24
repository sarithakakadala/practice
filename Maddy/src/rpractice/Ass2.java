package rpractice;

import java.util.Scanner;

public class Ass2
{
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a string");
	String s1=scan.next();
	String s2="aeiou";
	int count=0;
	for(int i=0;i<=s2.length()-1;i++)
	{
		char ch=s2.charAt(i);
		for(int j=0;j<=s1.length()-1;j++)
		{
			char c3=s1.charAt(j);
			if(c3==ch)
			{
				count++;
			}
		}
		if(count>0)
		{
			System.out.println("count of "+ ch +" character :"+count);
		}
		count=0;
	}
}
}
