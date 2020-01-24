package rpractice;

import java.util.Scanner;

public class Ass4
{
public static void main(String[] args) 
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a string");
	String s1=scan.nextLine();
    String[] s2=s1.split(" ");
    for(int i=0;i<=s2.length-1;i++)
{
    	System.out.print(s2[i]);
}
}
}
