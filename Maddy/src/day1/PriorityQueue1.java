package day1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PriorityQueue1 
{
	 public static void main(String[] args)
     {
   	  PriorityQueue a1=new PriorityQueue();
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
//priority is throwing exception or add() that is Exception in thread "main" java.lang.ClassCastException:
//java.lang.Integer cannot be cast to java.lang.Double
