package rpractice;

import java.util.Scanner;

public class Last_two 
{
public static void main(String[] args) 
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a string");
	String s1=scan.nextLine();
   for(int i=0;i<=s1.length()-1;i++)
   {
	   char ch=s1.charAt(i);
			   if(i==s1.length()-1&&i==s1.length()-2)
			   {
				   System.out.print(ch);
			   }
   }
}
}
