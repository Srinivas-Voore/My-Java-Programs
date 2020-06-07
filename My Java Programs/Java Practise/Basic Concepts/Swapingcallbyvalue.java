package practise;

class J
{
	void change(int a,int b)
	{
		int temp=a;
		a=b;
		b=temp;
	}
}
public class Swapingcallbyvalue 
{
	public static void main(String[] args) 
	{
		int a=10,b=20;
		J x=new J();
		System.out.printf("%d %d\n",a,b);
		x.change(a,b);
		System.out.printf("%d %d",a,b);
	}

}
