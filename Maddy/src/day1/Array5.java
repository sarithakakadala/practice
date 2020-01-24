package day1;

import java.util.Scanner;

//program to create two arrays and create 3rd array and copy elements
//first array to second array to 3rd array
public class Array5
{
	public static void main(String[] args) {
		
	
	Scanner scan=new Scanner(System.in);
	System.out.println("enter array1 size");
	int size=scan.nextInt();
	System.out.println("enter array1 elements");
	int a1[]=new int[size];
	for(int i=0;i<=a1.length-1;i++)
	{
		a1[i]=scan.nextInt();
	}
	System.out.println("enter array2 size");
	int size2=scan.nextInt();
	System.out.println("enter array2 elements");
	int a2[]=new int[size2];
	for(int i=0;i<=a2.length-1;i++)
	{
		a2[i]=scan.nextInt();
	}
	System.out.println("print elements");
	     int a3[]=new int[a1.length+a2.length];
		for(int i=0;i<=a1.length-1;i++)
		{
			a3[i]=a1[i];
		}
		int z=a1.length;
		for(int j=0;j<=a2.length-1;j++)
		{
			a3[z]=a2[j];
	    }
		System.out.println("print first array elements");
		for(int k=0;k<=a1.length-1;k++)
		{
			System.out.println(a1[k]);
		}
		System.out.println("print second array elements");
		for(int l=0;l<=a2.length-1;l++)
		{
			System.out.println(a2[l]);
		}
		System.out.println("print 3rd array elements");
		for(int m=0;m<=a1.length-1+a2.length-1;m++)
		{
			System.out.println(a3[m]);
		}
	
		
	}
}
