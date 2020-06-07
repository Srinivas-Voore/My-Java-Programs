package practise;

public class Circle 
{
	static double r=3.7;
	public static void main(String[] args) 
	{
		Circle.area(r);
		Circle.perimeter(r);
	}
	static void area(double r)
	{
		System.out.println(3.14f*r*r);
	}
	static void perimeter(double r)
	{
		System.out.println(2*3.14f*r);
	}

}
