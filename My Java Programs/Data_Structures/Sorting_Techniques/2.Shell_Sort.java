package Sorting_Techniques;
import java.util.Scanner;
public class Shell_Sort 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n,i;
		n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		shellsort x=new shellsort();
		x.sort(n, a);
		
	}
}
class shellsort
{
	void sort(int n,int a[])
	{
	int gap=n,temp,i,j;
	
	for(gap=n/2;gap>0;gap/=2)
	{
		for(i=gap;i<n;i++)
		{
			for(j=i; (j>=gap && a[j-gap]>a[j]) ;j=j-gap)
			{
				temp=a[j];
				a[j]=a[j-gap];
				a[j-gap]=temp;
			}
		}
	}
	
	for(i=0;i<n;i++)
		System.out.println(a[i]); 
	}
}
