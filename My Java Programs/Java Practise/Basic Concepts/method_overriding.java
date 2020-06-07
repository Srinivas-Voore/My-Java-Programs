package practise;
class A3
{
	void Area(int a,int b)
	{
		System.out.println(a*b);
	}
}
class B3 extends A3
{
	void Area(int a,int b)
	{
		System.out.println(a+b);
	}
}
public class method_overriding 
{
	public static void main(String ar[])
	{
		B3 x=new B3();
		x.Area(2, 3);
		x.Area(1, 2);
	}

}
