package practise;
import java.util.*;
public class MyFirstClass 
{
	private static long factorial(int n)
	{
		if(n==1)
		{
			return 1;
		}
		return (n*factorial(n-1));
	}
	private static int check(int n)
	{
		int sum=0;
		while(n> 0)
	    {
			int lastDigit = n % 10;
	        int fact = 1;
	        for(int i=1; i<=lastDigit; i++)
	        {
	            fact = fact * i;
	        }
	        sum = sum + fact;
	        n = n / 10;
	    }
		return sum;
				
	}
	private static boolean isStrong(int m)
	{
		
		if(check(m)==m)
		{
			return true;			
		}
		return false;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		long y=factorial(n);
		System.out.println(y);	
		boolean x=isStrong(m);
		if(x==true)
		{
			System.out.println("strong no");
		}
		else
		{
			System.out.println("not a strng no");
		}
	
	}

}
