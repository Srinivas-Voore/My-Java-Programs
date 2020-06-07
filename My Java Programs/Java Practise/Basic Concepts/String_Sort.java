package practise;
import java.util.*;
import java.lang.String;
public class String_Sort
{
	public static void main(String ar[]) 
	{
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt(),len=ar.length;
		String a[]=new String[len];
		for(int i=0;i<len;i++)
		{
			a.charAt[i]=ar.charAt[i];
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(a[j]>a[j+1])
				{
					String temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
	}

}
