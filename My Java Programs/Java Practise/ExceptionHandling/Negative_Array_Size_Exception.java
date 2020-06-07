package ExceptionHandling;

public class Negative_Array_Size_Exception 
{
	public static void main(String[] args) 
	{
		try
		{
			int a[]=new int[-1];
			System.out.println(a);
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println("cant give -ve size");
		}
	}

}
