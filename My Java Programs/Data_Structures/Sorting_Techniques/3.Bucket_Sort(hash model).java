package Sorting_Techniques;

import java.util.Scanner;

public class Bucket_Sort {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		
		int n=sc.nextInt();
		int a[]=new int[n];
			
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
			
		int h[]=new int[1000];
		int b[]=new int[n];
		int c=0;
		
		for(int i=0;i<1000;i++)
			h[i]=0;
		
		for(int i=0;i<n;i++)
			h[a[i]]++;	
			
		for(int i=0;i<1000;i++)
			{
			if(h[i]!=0)
				{
				for(int j=0;j<h[i];j++)
					b[c++]=i;
				}	
			}
		
		for(int i=0;i<n;i++)
			System.out.println(b[i]);
		
	}

}
