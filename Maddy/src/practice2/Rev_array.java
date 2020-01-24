package practice2;

import java.util.Scanner;

public class Rev_array
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=scan.nextLine();
		for(int i=s1.length()-1;i>=0;i--)
		{
			char ch[]=s1.toCharArray();
			System.out.print(ch[i]);
		
	}
	}
}
