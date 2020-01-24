package rpractice;

import java.util.Scanner;

public class Reverse_Array 
{
	 public static void main(String[] args)
	 {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a array size");
		int size=scan.nextInt();
		int[] a1=new int[size];
		System.out.println("enter "+size+" elements");
		for(int i=0;i<=a1.length-1;i++)
		{
			a1[i]=scan.nextInt();
		}
		System.out.println("print array in reverse order");
		for(int i=a1.length-1;i>=0;i--)
		{
			System.out.println(a1[i]);
		}
		
	 }
}
