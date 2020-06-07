package ExceptionHandling;

public class Nested_try 
{
	public static void main(String[] args) 
	{
		int x[]=new int[5];
		int a=10,b=0;
		try
		{
			try 
			{
				System.out.println(a/b);
			}
			catch(ArithmeticException e)
			{
				System.out.println("cant div by zero");
			}
			System.out.println(x[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("size exceeded in array indexes");
		}
	}

}
