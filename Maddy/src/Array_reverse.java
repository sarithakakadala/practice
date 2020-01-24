import java.util.Scanner;

public class Array_reverse
{
public static void main(String[] args) 
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter size");
	int size=scan.nextInt();
	System.out.println("enter  "+size+"  character");
	char[] ch=new char[size];
	for(int i=0;i<=ch.length-1;i++)
	{
		ch[i]=scan.next().charAt(0);
	}
	for(int i=ch.length-1;i>=0;i--)
	{
		System.out.print(ch[i]);
	}
	
}
}
