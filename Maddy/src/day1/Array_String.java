package day1;

import java.util.Arrays;
import java.util.Scanner;

public class Array_String 
{
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the size");
	int size=scan.nextInt();
	int[] j=new int[size];
	System.out.println("enter the elements");
	for(int i=0;i<=size-1;i++)
	{
		j[i]=scan.nextInt();
	}
		System.out.println(Arrays.toString(j));

}
}
