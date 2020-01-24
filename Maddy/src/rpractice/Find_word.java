package rpractice;

import java.util.Scanner;

public class Find_word
{
public static void main(String[] args) 
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a sentence");
	String s1=scan.nextLine();
	System.out.println("enter a word");
	String s2=scan.next();
 if(s1.contains(s2))
{
	System.out.println(s2+" is present");
	}
else
{
	System.out.println(s2+" is not present");
}
	
}

}