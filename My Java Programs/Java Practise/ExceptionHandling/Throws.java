package ExceptionHandling;
class Ex1
{
	static void check(int age)throws ArithmeticException
	{
		if(age<18)
		{
			throw new ArithmeticException("Hai i changed the format of ArithmeticException");
		}
		else
		{
			System.out.println("you are eligible");
		}
	}
}
public class Throws 
{
	public static void main(String[] args) 
	{
		Ex1.check(2);
	}

}
