package practise;

public class MethodOverloading 
{
	public static void main(String[] args) 
	{
		Add x=new Add();
		x.sum(10,20);
		x.sum("siva", "rama");
	}
}

class Add
{
	void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	void sum(String a,String b)
	{
		System.out.println(a+b);
	}
}
