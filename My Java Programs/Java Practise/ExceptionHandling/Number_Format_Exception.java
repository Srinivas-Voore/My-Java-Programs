package ExceptionHandling;
public class Number_Format_Exception 
{
	public static void main(String[] args) 
	{
		String str="ten";
		try 
		{
			int a=Integer.parseInt(str);
			System.out.println(a);		
		}
		catch(NumberFormatException e)
		{
			System.out.println("words cannot be converted to number");
		}
	}
}	
		
		