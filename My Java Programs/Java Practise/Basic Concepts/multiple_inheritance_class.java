//This program shows an error
package practise;
class R1
{
	void display()
	{
		System.out.println("hai");
	}
}
class R2
{
	void display2()
	{
		System.out.println("hello");
	}
}
class R3 extends R1,R2
{
	void display3()
	{
		System.out.println("srinu");
	}
}
public class multiple_inheritance_class extends R3 
{
	public static void main(String[] args) 
	{
		R3 x=new R3();
		x.display();
		x.display2();
		x.display3();
	}

}
