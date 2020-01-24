package day1;

import java.util.Scanner;
import java.util.*;

public class Stringrev1 
{
	public static void main(String[] args)
	{
		
	
      Scanner scan=new Scanner(System.in);
      System.out.println("enter the string");
      String s1=scan.nextLine();
      String sarr[]=s1.split(" ");
       String s2="";
       String s4="";
      for(int i=0;i<=sarr.length-1;i++)
      {
    	 s2=sarr[i]; 
    	 for(int j=s2.length()-1;j>=0;j--)
    	 {
    		 char ch=s2.charAt(j);
    		 s4=s4+ch;
    	 }
    	 s4=s4+" ";
    	 
      }
      System.out.println(s4);
	
	}

}
