package ExceptionHandling;

public class Null_Pointer_Exception 
{
	public static void main(String[] args) 
	{
		String str=null;
		try 
		{
		System.out.println(str.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("String must not be null");
			System.out.println(e);
		}
	}
}
