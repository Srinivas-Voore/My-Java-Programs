package practise;

import java.util.*;

public class While_loop 
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int i=1;
		while(i!=n+1)
		{
			System.out.println(i);
			i++;
		}
	}

}
