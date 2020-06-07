package ExceptionHandling;

public class ArrayIndexOutOfBounds_Exception 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		try
		{
			System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("kindly print element present in given size");
			System.out.println(e);
		}				
	}
}
