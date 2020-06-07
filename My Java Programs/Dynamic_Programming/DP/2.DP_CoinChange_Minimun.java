package DP;
import java.util.*;
import java.lang.*;

public class DP_CoinChange_Minimun 
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int coins[]=new int[n];
        
        for(int i=0;i<n;i++)
            coins[i]=sc.nextInt();
        
        int amt=sc.nextInt();
        int a[][]=new int[n+1][amt+1];
        
        for(int i=0;i<=n;i++)
        {
            a[i][0]=1;
        }
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<amt;j++)
            {
                if(coins[i]>j)
                    a[i][j]=a[i-1][j];
                else
                    a[i][j]=Math.min(a[i-1][j],a[i][j-coins[i]]);
            }
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=amt;j++)
            {
            	System.out.println(a[i][j]);
            }
        }
    }
}