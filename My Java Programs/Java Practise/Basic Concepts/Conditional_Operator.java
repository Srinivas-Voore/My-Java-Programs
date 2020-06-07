package practise;

public class Conditional_Operator 
{
	static int a=10,b=20,c=30;
	public static void main(String[] args) 
	{
		int max=0,min=0;
		if(a>b)
		{
			if(a>c)
			{
				max=a;
			}
		}
		else if(b>c)
		{
			max=b;
		}
		else
		{
			max=c;
		}
		if(a<b)
		{
			if(a<c)
			{
				min=a;
			}
		}
		else if(b<c)
		{
			min=b;
		}
		else
		{
			min=c;
		}
		
		System.out.printf("%d %d",max,min);
	}

}
