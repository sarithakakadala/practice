package day1;

import java.util.Scanner;

public class Count_words
{
public static void main(String[] args) 
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a string");
	String s1=scan.nextLine();
	String s2[]=s1.split(" ");
	System.out.println("no.of words="  +s2.length);
}
}
