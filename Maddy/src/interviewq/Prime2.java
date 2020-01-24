package interviewq;

public class Prime2 
{
	public static void main(String[] args)
	{
		int factor=0;
	   for(int i=1;i<=100;i++)
	   {
	    for(int j=1;j<=i;j++)
	   {
			if(i%j==0)
			{
				factor=factor+1;
			}
		}
		
		if(factor==2)
		{
			System.out.println(i);
		
		}
		else
		{
		 factor=0;
		}
	}
	}

}
