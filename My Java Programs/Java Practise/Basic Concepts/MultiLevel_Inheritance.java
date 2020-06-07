package practise;
class Ml1
{
	void sum(int x,int y)
	{
		System.out.println(x+y);
	}
	void sub(int x,int y)
	{
		System.out.println(x-y);
	}
}
class Ml2 extends Ml1
{
	void mul(int e,int f)
	{
		System.out.println(e*f);
	}
	void div(int e,int f)
	{
		System.out.println(e/f);
	}
}
class Ml3 extends Ml2
{
	void mod(int e,int f)
	{
		System.out.println(e%f);
	}
}

public class MultiLevel_Inheritance 
{
	public static void main(String[] args) 
	{
		Ml3 ml=new Ml3();
		ml.sum(2, 3);
		ml.sub(2, 3);
		ml.mul(2, 3);
		ml.div(2, 3);
		ml.mod(2, 3);
	}

}
