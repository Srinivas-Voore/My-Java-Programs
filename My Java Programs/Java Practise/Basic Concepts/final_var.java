package practise;
class f_a
{
	static final float pi=3.14f;
	void area(int r)
	{
		System.out.println(pi*(r*r));
	}
	
}
public class final_var extends f_a
{
	public static void main(String[] args) 
	{
		void area1(int y)
		{
			System.out.println(pi*(y*y));
		}

		final_var x=new final_var();
		
		x.area(5);
		x.area1(6);
	}

}
