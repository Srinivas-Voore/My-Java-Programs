package DP;
import java.util.*;
import java.lang.*;
public class Knapsack_0_1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of weights you have:"); 
		int n=sc.nextInt();
		int w[]=new int[n];
		System.out.println("Enter "+n+" weights in ascending order:");
		for(int i=0;i<n;i++)
		{
			w[i]=sc.nextInt();
		}
		int p[]=new int[n];
		System.out.println("Enter profits of "+n+" weights:");
		for(int i=0;i<n;i++)
		{
			p[i]=sc.nextInt();
		}
		System.out.println("Enter the weight you require:");
		int x=sc.nextInt();
		int a[][]=new int[n+1][x+1];
		
		for(int i=0;i<=n;i++)
		{
			a[i][0]=0;
		}
		for(int j=0;j<=x;j++)
		{
			a[0][j]=0;
		}
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=x;j++)
			{
				if(j<w[i-1])
				{
					a[i][j]=a[i-1][j];
				}
				else
				{
					a[i][j]=Math.max(a[i-1][j],a[i-1][j-w[i-1]]+p[i-1]);
				}
			}
		}
		int profit=a[n][x]; 
		System.out.println("Maximum profit by taking weight "+x+" is: "+profit);
		System.out.println("Taken weights to get maximum profit are: ");
		for(int i=n;i>0;i--)
		{
			if(profit!=a[i-1][x])
			{
				System.out.print(w[i-1]+" ");
				profit=profit-p[i-1];
				x=x-w[i-1];
			}
		}
	}
}
