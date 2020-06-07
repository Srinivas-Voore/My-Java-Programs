package practise;

public class CuboidThis 
{
	public static void main(String[] args) 
	{
		C x=new C();
		C y=new C();
		x.volume(100,200,300);
		y.volume1(100,200,300);	
	}	
}

class C
{
	double l=10,b=20,h=30;
	public void volume(double l,double b,double h)
	{
		System.out.println(l*b*h);
	}
	public void volume1(double l,double b,double h)
	{
		System.out.println(this.l*this.b*this.h);		
	}
}

