package practise;

public class Nested 
{
	public static void main(String[] args) 
	{
		Box2 x=new Box2();
		System.out.println(x.a);
		System.out.println(x.b);
		x.volume(10,20,30);
		Box2.Box1 y=x.new Box1();
		System.out.println(y.c);
		System.out.println(y.d);
		y.volume(10.2,11.2,12.2);
	}
}

class Box2
{
	int a=1,b=2;
	void volume(int l,int b,int h)
	{
		System.out.println(l*b*h);
	}
	class Box1
	{
		int c=3,d=4;
		void volume(double l,double b,double h)
		{
			System.out.println(l*b*h);
		}
	}
}
