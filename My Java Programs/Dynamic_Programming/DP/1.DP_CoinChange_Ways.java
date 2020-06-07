package DP;
import java.util.*;

public class DP_CoinChange_Ways 
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of coins:");
        int n=sc.nextInt();
        int coins[]=new int[n];
        System.out.println("Enter coin values:");
        for(int i=0;i<n;i++)
            coins[i]=sc.nextInt();
        System.out.println("Enter total amount:");
        int amt=sc.nextInt();
        int a[][]=new int[n+1][amt+1];
        
        for(int i=0;i<=n;i++)
            a[i][0]=1;
        
        for (int j = 1; j <= amt; j++) 
			a[0][j] = 0;
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=amt;j++)
            {
                if(coins[i-1]>j)
                    a[i][j]=a[i-1][j];
                else
                    a[i][j]=a[i-1][j]+a[i][j-coins[i-1]];
            }
        }
        System.out.println("No.of ways to give change of "+amt+" from provided "+n+" coins is:");
        System.out.println(a[n][amt]);

    }
}