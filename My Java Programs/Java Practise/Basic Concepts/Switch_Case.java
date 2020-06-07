package practise;
import java.util.*;
public class Switch_Case 
{
	public static void main(String ar[]) 
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter a number to check even or odd:");
		n=sc.nextInt();
		switch(n%2)
		{
		case 0:
			System.out.println("Even");
			break;
		case 1:
			System.out.println("Odd");
			break;
		default:
			System.out.println("this never comes");
		}
	}

}
