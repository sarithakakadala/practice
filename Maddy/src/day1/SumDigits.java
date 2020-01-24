package day1;

import java.util.Scanner;

public class SumDigits 
 {
	public static void main(String[] args)
	{ 
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=scan.next();
		int sum=0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch=s1.charAt(i);
			if(Character.isDigit(ch))
			{
				String numberString=ch+"";
				int number=Integer.parseInt(numberString);
				sum=sum+number;
			}
			
		}
		System.out.println(sum);
				
			}
		
}
