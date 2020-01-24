class Encapsulation
{
private String name;
private int id;
private double sal;


public Encapsulation(String name, int id, double sal) {
	this.name=name;
	this.id = id;
	this.sal = sal;
}

public String getName() {
    return name;
}
	
	public void setName(String name) 
	{
		int lon=name.length();
		if(lon==5)		
         {
	     this.name=name;
          }
		else
{
	System.out.println("enter only 5 characters");
}
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id)
	{
		if(id>=0&&id<=999)
		{
		this.id = id;
		}
		else
		{
			System.out.println("enter between 0-999");
		}
	}


	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	

}