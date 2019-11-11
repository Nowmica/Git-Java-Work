package arith;
import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int no=sc.nextInt();
		int temp=no,rev=0;
		while(no!=0)
		{
			int dig= no%10;
			rev=rev*10+dig;
			no=no/10;
		}
		if(temp==rev)
			System.out.println("The number is a palindrome!");
		else
			System.out.println("The number isn't a palindrome!");
		int i,flag =0;      
		int m=temp/2;      
		if(temp==0||temp==1)
		{  
			System.out.println(temp+" is not prime number");      
		}
		else
		{  
			for(i=2;i<=m;i++)
			{      
				if(temp%i==0)
				{      
					System.out.println(temp+" is not prime number");   
					flag=1;
					break;
			
				}
			}
		}
			if(flag==0)
		   		System.out.println(temp+"p is prime number");  
	}
}

