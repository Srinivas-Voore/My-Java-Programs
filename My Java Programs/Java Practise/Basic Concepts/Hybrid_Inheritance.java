package practise;
class Hy1
{
	void sum(int x,int y)
	{
		System.out.println(x+y);
	}
	
}
class Hy2 extends Hy1
{
	void sub(int x,int y)
	{
		System.out.println(x-y);
	}
}
class Hy3 extends Hy2
{
	void mul(int e,int f)
	{
		System.out.println(e*f);
	}
	
}
class Hy4 extends Hy2
{
	void div(int e,int f)
	{
		System.out.println(e/f);
	}
}

public class Hybrid_Inheritance 
{
	public static void main(String[] args) 
	{
		Hy3 h3=new Hy3();
		Hy4 h4=new Hy4();
		h3.sum(1, 1);
		h3.sub(1,2);
		h3.mul(1,2);
		h4.sum(1,1);
		h4.sub(1,2);
		h4.div(1,2);
		
	}

}
