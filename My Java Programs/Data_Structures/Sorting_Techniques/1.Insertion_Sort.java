package Sorting_Techniques;
import java.util.Scanner;
public class Insertion_Sort 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n,i;
		n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		insertionsort x=new insertionsort();
		x.sort(n, a);

	}
}

class insertionsort
{
	int i,j,temp;
	void sort(int n,int a[])
	{
		for(i=1;i<n;i++)
		{
			for(j=i;(j>0 && a[j-1]>a[j]);j--)
			{
				temp=a[j];
				a[j]=a[j-1];
				a[j-1]=temp;
			}
		}
		for(i=0;i<n;i++)
			System.out.println(a[i]);
	}
}
