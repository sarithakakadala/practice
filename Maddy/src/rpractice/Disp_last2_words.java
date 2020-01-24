package rpractice;

import java.util.Scanner;

public class Disp_last2_words
{
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the string");
	String s1=scan.nextLine();
	String[] s2=s1.split(" ");
	String s3=s2[s2.length-1];
	String s4=s2[s2.length-2];
	System.out.println("last word is   "+s3+"  and last second word is "+s4);
}
}
