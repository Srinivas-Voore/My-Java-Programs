package practise;
import java.util.*;
public class Class_Object 
{
	public static void main(String ar[]) 
	{
		Scanner sc=new Scanner(System.in);
		int a=1,x,y;
		float b=1.245f;
		x=sc.nextInt();
		A obj=new A();
		System.out.println(a);
		System.out.println(b);
		System.out.println(obj.c);
		System.out.println(obj.d);
		y=obj.method(x);
		System.out.println(y);
	}

}
class A
{
	int c=10,mul;
	float d=3.14f;
	int method(int x)
	{
		int e=20;
		float f=0.5f;
		mul=e*x*c;
		System.out.println(f);
		return mul;
	}
	
}