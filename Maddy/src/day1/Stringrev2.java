package day1;

import java.util.Scanner;

public class Stringrev2
{
public static void main(String[] args)
		{
		 Scanner scan=new Scanner(System.in);
	      System.out.println("enter the string");
	      String s1=scan.nextLine();
	      String sarr[]=s1.split(" ");
	      String s3="";
	     for(int i=0;i<=sarr.length-1;i++)
	     {
	    	 s3=s3+sarr[i];
	     }
	     System.out.println(sarr.length);

	}
}


