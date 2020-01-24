package interviewq;

public class Encaps
{
 int hour;
 int min;
 int sec;
public Encaps(int hour, int min, int sec)
{
	this.hour = hour;
	this.min = min;
	this.sec = sec;
}
public void time()
{
	System.out.println("Time :"+this.hour+":"+this.min+":"+this.sec);
}
public void changetime(int hour,int min,int sec)
{
	if((hour>=00&&hour<=23)&&(min>=00&&min<=59)&&(sec>=00&&sec<=59))
			{
		    this.hour=hour;
		    this.min=min;
		    this.sec=sec;
			}
	else
	{
		System.out.println("invalid time");
	}
}
 
}
