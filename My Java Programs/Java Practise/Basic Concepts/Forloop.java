package practise;
import java.util.*;

public class Forloop 
{
	public static void main(String ar[])
	{
		int n,i,j;
		try(Scanner sc=new Scanner(System.in))
		{
			n=sc.nextInt();
		}
		for(i=1;i<=n;i++) 
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
	}

}
