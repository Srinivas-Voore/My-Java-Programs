package practise;

public class swap_static 
{
	static int a=10;
	static int b=20;
	public static void main(String[] args) 
	{
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.printf("%d %d",a,b);
	}
	
}
