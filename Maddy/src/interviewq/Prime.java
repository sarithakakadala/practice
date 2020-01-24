package interviewq;
//wap to check whether given number is prime or not

public class Prime
{
public static void main(String[] args)
{
    int n=3;
    int factor=0;
    for(int i=1;i<=n;i++)
   {
		if(n%i==0)
		{
			factor=factor+1;
		}
	}
	
	if(factor==2)
	{
		System.out.println("n is a prime number");
	}
	else
	{
		System.out.println("n is not a prime number");
	}
	}
}
