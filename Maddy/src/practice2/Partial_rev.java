package practice2;

import java.util.Scanner;

public class Partial_rev
{
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a string");
	String s1=scan.nextLine();
	String s2[]=s1.split(" ");
	String s3=" ";
	String s4="";
	for(int i=s2.length-1;i>=0;i--)
	{
		s3=s2[i]+" ";
	
	System.out.print(s3);
	}	
}
}
