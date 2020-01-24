package day1;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 
{
	 public static void main(String[] args)
     {
		 
	    	HashSet a1=new HashSet();   
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
//HashSet is printing data in the following order
//character
//integer
//string
//double
//boolean
