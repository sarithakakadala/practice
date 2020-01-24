package rpractice;

import java.util.Scanner;

public class count_vowels
{
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a string");
	String s1=scan.next();

    int count=0;
    for(int i=0;i<=s1.length()-1;i++)
    	{
    	char ch1=s1.charAt(i);
    	if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u')
    	{
    		count++;
    	}
    	}
    System.out.println(" no.of vowels present in string are  :"+count);
    	
    	
}
}
