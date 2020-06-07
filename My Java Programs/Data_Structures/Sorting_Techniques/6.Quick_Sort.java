package Sorting_Techniques;
import java.util.*;
public class Quick_Sort 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		quicksort(a,0,n-1);
		
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
	}
	static void quicksort(int a[],int first,int last)
	{
		int pivot,i,j,temp;
		if(first<last)
		{
			pivot=first;
			i=first;
			j=last;
			
			while(i<j)
			{
				while(a[i]<=a[pivot] && i<last)
					i++;
				while(a[j]>a[pivot])
					j--;
			
				if(i<j)
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				else if(i>=j)
				{
					temp=a[j];
					a[j]=a[pivot];
					a[pivot]=temp;
				}
				
				quicksort(a,first,j-1);
				quicksort(a,j+1,last);					
			}
		}
	}
}
