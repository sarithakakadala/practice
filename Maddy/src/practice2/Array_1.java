package practice2;

import java.util.Scanner;

public class Array_1 
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size=scan.nextInt();
		System.out.println("enter the elements of an array");
		int a[]=new int[size];
		for(int i=0;i<=size-1;i++)
		{
		a[i]=scan.nextInt();
		}
		for(int j=0;j<=a.length-1;j++)
		{
		System.out.println(a[j]);	
		}
		
		
		
		}
	}
	

