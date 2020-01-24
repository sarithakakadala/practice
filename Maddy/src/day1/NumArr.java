package day1;

import java.util.Scanner;

public class NumArr
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);	
System.out.println("enter array size");
int size=scan.nextInt();
int a1[]=new int[size];
System.out.println("enter array elements");
for(int i=0;i<=a1.length-1;i++)
{
	a1[i]=scan.nextInt();
}

for(int i=1;i<=100;i++)
{
	int status=0;
	for(int j=0;j<=a1.length-1;i++)
	{
		if(i==a1[j])
		{
			status=1;
			break;
		}
	}
	if(status==0)
	{
	System.out.println(i);
}


}
}

}