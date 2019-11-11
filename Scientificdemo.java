package Exercises;

public class Scientificdemo implements PhysicalConstants
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scientificdemo.Einsteinformula();
		Scientificdemo.Newtonsformula();
		Scientificdemo.Velocity();
	}
public static void Einsteinformula()
{
	int mass=15;
	long energy=mass*SPEED_OF_LIGHT_IN_VACCUM;
	System.out.println("Energy="+energy);
}
public static void Newtonsformula()
{
	int m1=20;
	int m2=10;
	float radius=5.2f;
	double force=GRAVITATIONAL_CONSTANT*(m1*m2)/Math.exp(radius);
	System.out.println("Force="+force+"newtons");
}
public static void Velocity()
{
	double d;
	int t=6;
	d=(0.5)*STANDARD_GRAVITATIONAL_ACCELERATION*t;
	System.out.println("distance="+d);
}
}
