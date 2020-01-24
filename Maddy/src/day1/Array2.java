package day1;
//wap to create an integer array provide size and element during run time
//search whether given element is present or not

import java.util.Scanner;

public class Array2
{
	public static void main(String[] args) 
	{
		
     Scanner scan=new Scanner(System.in);
     System.out.println("enter array size");
     int size=scan.nextInt();
     System.out.println("enter array elements");
     int d[]=new int[size]; 
     int status =0;
     for(int i=0;i<=size-1;i++)
     {
    	 d[i]=scan.nextInt();  
     }
    	 System.out.println("enter search elements");
         int searchele=scan.nextInt();
         for(int i=0;i<=d.length-1;i++)
         {
        	 if(d[i]==searchele)
        	 {
        		 status=1;
        		 break;
        	 }
 
     }
     if(status==1)
     {
    	 System.out.println("search element is present");
     }
     else
     {
    	 System.out.println("search element is not present");
     }
     
     
}

}