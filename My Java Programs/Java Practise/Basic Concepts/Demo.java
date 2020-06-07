package practise;
import java.util.*;
public class Demo
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String ar[])
	{
		while(true)
		{
			System.out.println("1.Linear Search");
			System.out.println("2.Binary Search");
			System.out.println("3.Bubble Sort");
			System.out.println("4.Quit");
			int ch=Integer.parseInt(ar[0]);
			switch(ch)
			{
			case 1:LinearSearch();
				   break;
			case 2:BinarySearch();
				   break;
			case 3:BubbleSort();
				   break;
			case 4:System.exit(0);
			default:System.out.println("Enter 1-4 values");
			}
		}
	}
	public static void LinearSearch()
	{
		int n,i,search;
		n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		search=sc.nextInt();
		for(i=0;i<n;i++)
			if(search==a[i])
			{
				System.out.println(search+" is at position "+i);
			}
	}
	public static void BinarySearch()
	{
		int n,i,search,first,middle,last;
		n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		search=sc.nextInt();
		first=0;
		last=n-1;
		middle=(first+last)/2;
		while(first<=last)
		{
			if(a[middle]==search)
				System.out.println(search+" is at position "+(middle+1));
			if(a[middle]<search)
				first=middle+1;
			else
				last=middle-1;
			
			middle=(first+last)/2;
			
		}
	
	}
	public static void BubbleSort()
	{
		int n,i,j,temp=0;
		n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(i=0;i<n;i++)
			System.out.println(a[i]);
	}
}
