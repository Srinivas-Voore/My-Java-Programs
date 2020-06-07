package practise;
interface R4
{
	void display();
}
interface R5
{
	void display2();
}
class R6 implements R4,R5
{
	public void display()
	{
		System.out.println("1");
	}
	public void display2()
	{
		System.out.println("2");
	}
	void display3()
	{
		System.out.println("3");
	}
}
public class multiple_inheritance_interface extends R6 
{
	public static void main(String[] args) 
	{
		R6 x=new R6();
		x.display();
		x.display2();
		x.display3();
	}

}
