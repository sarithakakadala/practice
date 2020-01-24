package rpractice;

import java.util.Scanner;

public class Ascii_value 
{
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a string");
	String s1=scan.nextLine();
	System.out.println("enter an index number");
	int index=scan.nextInt();
	char ch=s1.charAt(index);
	System.out.println(ch+"  index is"+(int)ch);
    
}
}
