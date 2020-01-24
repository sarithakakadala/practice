package practice2;

import java.util.Scanner;

public class Vowel
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=scan.next();		
		int count=0;
		int count2=0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch=s1.charAt(i);
		if((ch!='a')&&(ch!='e')&&(ch!='i')&&(ch!='o')&&(ch!='u'))
		{
			count++;
		}
		else
		{
			count2++;
		}
		}
		System.out.println("no.of.consonants  "+count+
				"no.of vowels  "+count2);
	

}
}
