package Sorting_Techniques;
import java.util.Scanner;
public class Merge_Sort 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		partition(a,0,n-1);
		
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
	}
		static void partition(int a[],int first,int last)
		{
		int mid;
		if(first<last)
		{
			mid=(first+last)/2;
			partition(a,first,mid);
			partition(a,mid+1,last);
			merge(a,first,mid,last);
		}
		}
		
		static void merge(int a[],int first,int mid,int last)
		{
		int i,j,k=0;
		int temp[]=new int[50];
		i=first;
		j=mid+1;
		
		while(i<=mid && j<=last)
		{
			if(a[i]<a[j])
				temp[k++]=a[i++];
			else
				temp[k++]=a[j++];
		}
		
		while(i<=mid)
			temp[k++]=a[i++];
		while(j<=last)
			temp[k++]=a[j++];
		
		for(i=first,j=0;i<=last;i++,j++)
			a[i]=temp[j];
		}
		
}