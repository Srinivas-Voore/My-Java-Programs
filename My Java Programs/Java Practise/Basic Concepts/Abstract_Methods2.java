package practise;

abstract class Box7
{
	abstract void volume(int l,int b,int h);
	void lsa(int l,int b,int h) 
	{
		System.out.println(2*(l*b+b*h+h*l));
	}
	abstract void tsa(int l,int b,int h);
}
class Box8 extends Box7
{
	void volume(int l,int b,int h)
	{
		System.out.println(l*b*h);
	}
	void tsa(int l,int b,int h)
	{
		System.out.println(2*h*(l+b));
	}
	
}
public class Abstract_Methods2 
{
	public static void main(String[] args) 
	{
		Box8 x=new Box8();
		x.volume(1, 2, 3);
		x.lsa(2, 3, 4);
		x.tsa(1, 4, 3);
	}
}
