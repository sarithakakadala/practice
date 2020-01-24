package day1;

import java.util.Iterator;
import java.util.Vector;

public class Vector1
{
	 public static void main(String[] args)
     {
		 
	    	Vector a1=new Vector();   
   	        a1.add(88);
   	        a1.add(8.8);
   	        a1.add('a');
       	  a1.add("maddy");
     	  a1.add(true);
   	      Iterator i1=a1.iterator();
   	  while(i1.hasNext())
   	  {
   		  System.out.println(i1.next());
   	  }
	  }
}
