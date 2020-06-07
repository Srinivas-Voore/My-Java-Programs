package ExceptionHandling;

import java.util.Scanner;

class Def_Ex extends Exception
{
	Def_Ex(String s)
	{
		super(s);
	}
}
class _Ex
{
	void check(float avg)
	{
		try 
		{
		if(avg<35)
		{
			throw new Def_Ex("Fail");
		}
		else
		{
			System.out.println("Pass");
		}
		}
		catch(Def_Ex e)
		{
			System.out.println(e.getMessage());
		}
	}
}
public class My_Exception 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int m1=sc.nextInt(),m2=sc.nextInt(),m3=sc.nextInt(),m4=sc.nextInt(),m5=sc.nextInt(),m6=sc.nextInt();
		float tot,avg;
		tot=m1+m2+m3+m4+m5+m6;
		avg=tot/6;
		_Ex x=new _Ex();
		x.check(avg);
	}

}
