package day1;

import java.util.ArrayList;
import java.util.Iterator;



public class Collection1 
{
      public static void main(String[] args)
      {
    	  ArrayList a1=new ArrayList();
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
