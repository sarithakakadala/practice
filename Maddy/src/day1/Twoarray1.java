package day1;

import java.util.Scanner;

//create two arrays and transfer elements from one array to another array

public class Twoarray1 
{ 
	public static void main(String[] args)
	{
		
	
Scanner scan=new Scanner(System.in);
System.out.println("enter array1 size");
int size=scan.nextInt();
System.out.println("enter array1 elements");
int a1[]=new int[size];
for(int i=0;i<=a1.length-1;i++)
{
	a1[i]=scan.nextInt();
}
int a2[]=new int[a1.length];
for(int i=0;i<=a1.length-1;i++)
{
	a2[i]=a1[i];
}
System.out.println("printing first array elements");
for(int j=0;j<=a1.length-1;j++)
{
System.out.println(a1[j]);
}
System.out.println("printing second array elements");
for(int k=0;k<=a1.length-1;k++)
{
System.out.println(a2[k]);
}

}
}

