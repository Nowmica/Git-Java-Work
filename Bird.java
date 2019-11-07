package oop;

public class Bird 
{
	//instance variables
	public static int legs, wings;
	public String birdname,birdcolor;
	private boolean singstatus;
	//constructor
	Bird()
	{
		legs=2;
		wings=2;
	}
	//setter method for setting values to private variables
	public void setsingStatus()
	{
		if(this.birdname.equalsIgnoreCase("Kokila"))
		{
			singstatus = true;
		}
	}
	//method definition
	public void walk()
	{
		System.out.println(birdcolor+" "+birdname+ " is walking with " +legs+" legs");	
	}
	public void fly()
	{
		System.out.println(birdcolor+" "+birdname+ " is flying with " +wings+" wings");
	}
	public void sing()
	{
		if(singstatus)
		{
			System.out.println("la ra looo...la ra looo...");
		}
		else
			System.out.println("bird cant sing");
	}
}
