package arith;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>=b&&a>=c)
		{
			System.out.println("The biggest number is"+a);
		}
		else
		if(b>=a&&b>=c)
		{
			System.out.println("The biggest number is"+b);	
		}
		else
			System.out.println("The biggest number is"+c);		
	}

}
