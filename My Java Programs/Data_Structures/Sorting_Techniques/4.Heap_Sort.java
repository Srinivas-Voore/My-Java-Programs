package Sorting_Techniques;
import java.util.*;
public class Heap_Sort 
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		
		int n,i,j,temp;
		n=sc.nextInt();
		int a[]=new int[n];
		
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		for(i=1;i<n;i++)
		{
			Heap_Sort.max_heap(a,i);
		}
		
		for(j=n-1;j>=0;j--)
		{
			temp=a[0];
			a[0]=a[j];
			a[j]=temp;
			for(i=1;i<j;i++)
			{
				Heap_Sort.max_heap(a,i);
			}	
		}
		
		for(i=0;i<n;i++)
			System.out.println(a[i]);
	
	}
	static void max_heap(int a[],int i)
	{
		int temp,c,r;
		c=i;
		while(c>0)
		{
			r=(c-1)/2;
			if(a[r]<a[c])
			{
				temp=a[r];
				a[r]=a[c];
				a[c]=temp;
			}
			c=r;
		}
	}
	
}