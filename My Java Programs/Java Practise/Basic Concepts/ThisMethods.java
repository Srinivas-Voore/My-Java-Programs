package practise;
//Always write "this" Keyword in first line
public class ThisMethods 
{
	public static void main(String[] args) 
	{
		D x=new D();
		x.div(20,10);
	}
}
class D
{
	int a=10,b=20;
	void sum(int a,int b)
	{
		System.out.println(a+b);
		System.out.println(this.a+this.b);
	}
	void sub(int a,int b)
	{
		System.out.println(a-b);
		System.out.println(this.a-this.b);
		this.sum(2,5);
	}
	void mul(int a,int b)
	{
		this.sub(10,2);
		System.out.println(a*b);
		System.out.println(this.a*this.b);
	}
	void div(int a,int b)
	{
		this.mul(2,3);
		System.out.println(a/b);
		System.out.println(this.a/this.b);
	}
}
