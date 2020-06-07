package ExceptionHandling;

import java.util.Scanner;

public class ZeroDivError_or_ArithmeticException 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		try
		{
		System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("don't div by zero");
			System.out.println(e);
		}
	}
}
