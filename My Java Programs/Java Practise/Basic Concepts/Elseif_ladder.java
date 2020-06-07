package practise;
import java.util.*;
public class Elseif_ladder 
{

	public static void main(String ar[]) 
	{
		int units;
		double bill;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Units:");
		units=sc.nextInt();
		if(units>=1 && units<=100)
		{
		System.out.println(units*1.25);
		}
		else if(units>=101 && units<=200)
		{
		System.out.println(100*1.25+(units-100)*2.25);
		}
		else if(units>=201 && units<=300)
		{
		System.out.println(100*1.25+(units-100)*2.25+(units-200)*3.25);
		}
		else
		{
		System.out.println(100*1.25+(units-100)*2.25+(units-200)*3.25+(units-300)*4.25);
		}
	}

}
