package practise;
class f_b
{
	final void display()
	{
		System.out.println("Hii");
	}
}
class f_c extends f_b
{
	void display()
	{
		System.out.println("Hello");
	}
}
public class final_method 
{
	public static void main(String[] args) 
	{
		f_c x=new f_c();
		x.display();
	}
}
