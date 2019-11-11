package oop;

public class Stringtonum 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String amount = "2344345.0";
		int length=amount.length();
		int i =0, value =0;
		while(length>0)
			{
				if(amount.charAt(i)>'0'&& amount.charAt(i)<'9')
					value+=Integer.parseInt(""+amount.charAt(i));
					length--;
					i++;
			}
			System.out.println("value="+value);
	}
}
