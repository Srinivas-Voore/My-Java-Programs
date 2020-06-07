package practise;

public class ConstructorChaining 
{

	public static void main(String[] args) 
	{
		Box b=new Box();
	}

}
class Box
{
	Box()
	{
		this(5);
		System.out.println("Hello");
	}
	Box(int x)
	{
		this(10,20);
		System.out.println(x);
	}
	Box(int a,int b)
	{
		System.out.println(a*b);
	}

}