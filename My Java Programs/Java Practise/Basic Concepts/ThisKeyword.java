package practise;

public class ThisKeyword 
{
	public static void main(String[] args) 
	{
		B a=new B();
		a.sum(100,200);
	}
}
class B
{
	int a=10,b=20;
	public void sum(int a,int b)
	{
		System.out.println(a+b);
		System.out.println(this.a+this.b);
	}
}
