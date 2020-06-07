package practise;

import java.util.*;

public class DoWhile_loop 
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int i=1;
		do
		{
			System.out.println(i);
			i++;
		}while(i!=n+1);
	}

}
