package ExceptionHandling;
class DefEx extends Exception
{
	DefEx(String s)
	{
		super(s);
	}
	}
class Ex
{
	void check(int age)
	{
		try
		{
			if(age<18)
				throw new DefEx("not eligible");
			else
				System.out.println("eligible");
		}
		catch(DefEx e)
		{
			System.out.println(e.getMessage());
		}
	}
}
public class MyException {

	public static void main(String[] args) 
	{
		Ex x=new Ex();
		x.check(19);
	}

}
