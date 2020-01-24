package day1;

import java.util.Scanner;

public class Array1 
{
public static void main(String[] args)
    {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter size of an array");
	int size=scan.nextInt();
	System.out.println("enter the elements");
	int a[]=new int[size];
	for(int i=0;i<=size-1;i++)
	{
		a[i]=scan.nextInt();
	}
	
    for(int j=0;j<=a.length-1;j+=2)
    {
     System.out.println(a[j]);
	}
	
	
	
    }
}
