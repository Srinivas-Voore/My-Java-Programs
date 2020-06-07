package DP;
import java.util.*;
public class Knapsack_Fractional 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int w[]=new int[n];
		for(int i=0;i<n;i++)
			w[i]=sc.nextInt();
		int p[]=new int[n];
		for(int i=0;i<n;i++)
			p[i]=sc.nextInt();
		float pw[]=new float[n];
		for(int i=0;i<n;i++)
			pw[i]=p[i]/w[i];
		int x=sc.nextInt();
		int res=0;
		
		
	}
	/*static int max(int n,float pw[])
	{
		float max_pw=Float.MIN_VALUE;
		int max_pw_i=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			if(pw[i]>max_pw)
			{
				max_pw=pw[i];
				max_pw_i=i;
			}
		}
		return max_pw_i;
	}*/
}
