package practise;

public class Cuboid
{
	double l=10,b=20,h=30;
	public static void main(String[] args) 
	{
		Cuboid c=new Cuboid();
		Cuboid.volume(c.l,c.b,c.h);		
	}
	public static void volume(double l,double b,double h)
	{
		System.out.println(l*b*h);
	}

}
