package practise;
class Hi1
{
	void volume(int l,int b,int h)
	{
		System.out.println(l*b*h);
	}
}
class Hi2 extends Hi1
{
	void lsa(int l,int b,int h)
	{
		System.out.println(2*(l*b+b*h+h*l));
	}
}
class Hi3 extends Hi1
{
	void tsa(int l,int b,int h)
	{
		System.out.println(2*h*(l+b));
	}
}
public class Hierarical_Inheritance 
{
	public static void main(String[] args) 
	{

		Hi2 h2=new Hi2();
		Hi3 h3=new Hi3();
		h2.volume(2, 3, 4);
		h2.lsa(1, 2, 1);
		h3.volume(2, 2, 2);
		h3.tsa(1, 1, 1);
	}
}
