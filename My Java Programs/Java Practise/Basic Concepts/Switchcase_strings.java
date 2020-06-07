package practise;
import java.util.*;
public class Switchcase_strings 
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		String country;
		System.out.println("Enter country:");
		country=sc.nextLine();
		switch(country)
		{
		case "india":System.out.println("your code is +91");
					 break;	
		case "usa":System.out.println("your code is +1");
		 			 break;
		default:System.out.println("invalid"); 			 
		}
	}

}
