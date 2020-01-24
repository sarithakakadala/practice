package rpractice;

import java.util.Scanner;

public class Lenth_wthout_lenmtd 
{
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a string");
	String s1=scan.next();
     int count=-1;
     int i=0;
     while(true)
     {
    	 try
    	 
    	 {
    		 s1.charAt(i);
    		 count++;
    		 i++;
    	 }
    	 catch(IndexOutOfBoundsException rv)
    	 {
    		 break;
    	 }
     }
     System.out.println("length of the string  "+s1+ " is"+count );
     
}
}
