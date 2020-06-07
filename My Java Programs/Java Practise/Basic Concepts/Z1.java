package practise;
import java.util.Scanner;
import java.lang.Math;
class QuadraticEquation1
{
	private double a,b,c;
	void seta(double a)
	{
		this.a=a;
	}
	void setb(double b)
	{
		this.b=b;
	}
	void setc(double c)
	{
		this.c=c;
	}
	double geta()
	{
		return a;
	}
	double getb()
	{
		return b;
	}
	double getc()
	{
		return c;
	}
	double getDiscriminant(double a,double b,double c)
	{
		double y=(b*b)-(4*a*c);
		return y;
	}
	double getRoot1(double a,double b,double c)
	{
		double x1=getDiscriminant(a,b,c);
		double r1=((-(b)-Math.sqrt(x1))/(2*a));
		return r1;
	}
	double getRoot2(double a,double b,double c)
	{
		double x2=getDiscriminant(a,b,c);
		double r2=((-(b)+Math.sqrt(x2))/(2*a));
		return r2;
	}
}
public class Z1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		QuadraticEquation1 q=new QuadraticEquation1();
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		q.seta(a);
		q.setb(b);
		q.setc(c);
		double w=q.geta();
		double e=q.getb();
		double r=q.getc();
		double r1=q.getRoot1(w,e,r);
		double r2=q.getRoot2(w,e,r);
		System.out.println(r1);
		System.out.println(r2);
	}
}
