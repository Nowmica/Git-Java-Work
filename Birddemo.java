package oop;

public class Birddemo 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Bird p = new Bird();
		p.birdcolor = "Green";
		p.birdname = "parrot";
		p.walk(); //calling method
		p.setsingStatus();
		p.fly(); //calling method
		p.sing();
		
		Bird k = new Bird();
		k.birdcolor = "Black";
		k.birdname = "kokila";
		k.walk();
		k.setsingStatus();
		k.sing();
		k.fly();
		
		System.out.println("Object id:"+p.hashCode());
	}

}
