package practice2;

import java.util.Scanner;

public class Total_rev
{
public static void main(String[] args) 
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a string");
	String s1=scan.nextLine();
    String s2[]=s1.split(" ");
    String s3="";
    String s4="";
    for(int i=0;i<=s2.length-1;i++)
    		{
    	    s3=s2[i];
    		for(int j=s3.length()-1;j>=0;j--)
    		{
    			char ch=s3.charAt(j);
    			s4=s4+ch;
    		}
    		s4=s4+" ";
    		}
    System.out.println(s4);
            
	
}
}
