package ExceptionHandling;

public class finally_ 
{
	public static void main(String[] args) 
	{
		int a=10,b=0;
		try
		{
		System.out.println(a/b);
		}
		finally
		{
			System.out.println("must execute");
		}
	}

}
