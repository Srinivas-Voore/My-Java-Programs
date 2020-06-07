package practise;

class E
{
	public E(int a,int b)
	{
		System.out.println(a+b);
	}
	protected E(double a, double b)
	{
		System.out.println(a+b);
	}
	E(String a,String b)
	{
		System.out.println(a+b);		
	}
}
public class Constructors 
{
	public static void main(String ar[])
	{
	E x=new E(10,20);
	E y=new E(10.2,11.3);
	E z=new E("siva","rama");
	}
}
