package practise;
interface Box11
{
	void volume(int l,int b,int h);
}
interface Box9 extends Box11
{
	void tsa(int l,int b,int h);
}
class Box10 implements Box9
{
	public void volume(int l,int b,int h)
	{
		System.out.println(l*b*h);
	}
	public void tsa(int l,int b,int h)
	{
		System.out.println(2*h*(l+b));
	}
}
public class interfaces 
{
	public static void main(String[] args) 
	{
		Box10 x=new Box10();
		x.volume(1, 2, 3);
		x.tsa(1, 2, 3);
	}
}
