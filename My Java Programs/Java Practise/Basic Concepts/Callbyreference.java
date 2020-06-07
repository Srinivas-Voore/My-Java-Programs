package practise;

class I
{
	int data=10;
	void change(I x)
	{
		x.data=x.data+100;
	}
}
public class Callbyreference 
{
	public static void main(String[] args) 
	{
		I y=new I();
		System.out.println(y.data);
		y.change(y);
		System.out.println(y.data);
	}

}
