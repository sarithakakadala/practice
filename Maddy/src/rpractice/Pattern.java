package rpractice;

public class Pattern
{
public static void main(String[] args) {
	int space=4;
	int star=-1;
	for(int i=1;i<=8;i++)
	{
		if(i<=4) {
		star+=2;
		space--;
		}
		else if(i>4)
		{
		star-=2;
		space++;
		}
		for(int j=1;j<=space;j++)
				{
			System.out.print(" ");
			
				}
		for(int k=1;k<=star;k++)
		{
			System.out.print("*");
		}
	
	System.out.println();
	}
}
}
