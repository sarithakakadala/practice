package day1;

import java.util.Scanner;
//This is basic program
public class Array_delete
{
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the size");
	int size=scan.nextInt();
	String[] d1=new String[size];
	System.out.println("enter  "+size+" elements");
	for(int i=0;i<=d1.length-1;i++)
	{
		d1[i]=scan.next();
	}
	System.out.println("array elements are");
	for(String j:d1)
	{
		System.out.println(j);
	}
	
}
}
