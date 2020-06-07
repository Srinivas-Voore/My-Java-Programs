package practise;
//goto source and click on generate getters and setters for alternate
public class Setters_Getters 
{
	public static void main(String[] args) 
	{
		G x=new G();
		x.setDim(1.5,2.5,3.5);
		System.out.println(x.vol());
		System.out.println(x.getL());
		System.out.println(x.getB());
		System.out.println(x.getH());
	}
}

class G
{
	private double l,b,h;
	void setDim(double l,double b,double h)
	{
		this.l=l;
		this.b=b;
		this.h=h;
	}
	double vol()
	{
		return l*b*h;
	}
	double getL()
	{
		return l;
	}
	double getB()
	{
		return b;
	}
	double getH()
	{
		return h;
	}
}
