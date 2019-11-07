package myio;
import java.util.Scanner;

public class Empdetails 
{
public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	int empid = sc.nextInt();
	String ename = sc.next();
	int sal = sc.nextInt();
	System.out.println("employee id:" +empid);
	System.out.println("employee name:" +ename);
	System.out.println("employee salary:" +sal);
	
	}
}
