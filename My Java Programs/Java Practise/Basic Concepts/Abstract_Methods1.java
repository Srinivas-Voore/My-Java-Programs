package practise;

abstract class Box6
{
	abstract void volume(int l,int b,int h);
	abstract void lsa(int l,int b,int h);
	abstract void tsa(int l,int b,int h);
}
class Box5 extends Box6
{
	void volume(int l,int b,int h)
	{
		System.out.println(l*b*h);
	}
	void lsa(int l,int b,int h)
	{
		System.out.println(2*(l*b+b*h+h*l));
	}
	void tsa(int l,int b,int h)
	{
		System.out.println(2*h*(l+b));
	}
}
public class Abstract_Methods1 
{
	public static void main(String[] args) 
	{
		Box6 x=new Box5();
		x.volume(2 ,3 , 4);
		x.lsa(2, 3, 4);
		x.tsa(1, 4, 3);
	}
}
