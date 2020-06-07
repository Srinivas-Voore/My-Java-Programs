package practise;
class Parent
{
	int a=1,b=2;
	void sum(int x,int y)
	{
		System.out.println(x+y);
	}
}
class Child extends Parent
{
	int c=3,d=4;
	void mul(int e,int f)
	{
		System.out.println(e*f);
	}
}
public class Single_Inheritance 
{
	public static void main(String[] args) 
	{
		Child c=new Child();
		System.out.println(c.a);
		System.out.println(c.b);
		c.sum(10,20);
		System.out.println(c.c);
		System.out.println(c.d);
		c.mul(4,3);
	}

}
