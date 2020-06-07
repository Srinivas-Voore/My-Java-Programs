package practise;
final class f_d
{
	void display()
	{
		System.out.println("Hii");
	}
}
class f_e extends f_d
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
		f_e x=new f_e();
		x.display();
	}
}
