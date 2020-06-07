package practise;

public class Swapingcallrefference 
{
	public static void main(String ar[]) 
	{
		K x=new K();
		System.out.printf("%d %d\n",x.a,x.b);
		x.change(x);
		System.out.printf("%d %d",x.a,x.b);
	}
}
class K
{
	int a=10,b=20;
	void change(K x)
	{
		int temp=x.a;
		x.a=x.b;
		x.b=temp;
	}
}
