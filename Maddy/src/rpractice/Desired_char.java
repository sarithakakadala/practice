package rpractice;

import java.util.Scanner;

public class Desired_char 
{
	public static void main(String[] args)
	{
		
		Scanner scan=new  Scanner(System.in);
		System.out.println("enter a string");
		String s1=scan.nextLine();
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch=s1.charAt(i);
			System.out.println(ch+"@"+i+" index");
			
		}
		System.out.println("enter index number");
		int index=scan.nextInt();
		char ch=s1.charAt(index);
		System.out.println("desire char is :-"+ch);
	}

}
