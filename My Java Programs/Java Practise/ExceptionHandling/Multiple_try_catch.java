package ExceptionHandling;
import java.util.Scanner;
public class Multiple_try_catch 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt();
		int x[]=new int[5];
		try
		{
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("cant div by zero");
		}
		try
		{
			System.out.println(x[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("that index is not present");
		}
	}
}
