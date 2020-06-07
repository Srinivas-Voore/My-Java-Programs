package practise;

import java.util.*;

class Scanner_Demo
{
public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		
		int sem;
		float cgpa;
		String name;
		
		System.out.println("Enter Name:");
		name=sc.nextLine();
		System.out.println("Enter Sem:");
		sem=sc.nextInt();
		System.out.println("Enter cgpa:");
		cgpa=sc.nextFloat();
		
		System.out.println("Your Name is:"+name);
		System.out.println("Your Sem is:"+sem);
		System.out.println("Your Cgpa is:"+cgpa);
		
		if(cgpa>=9.5f)
		{
			System.out.println("Keep it up");
		}
		else
		{
			System.out.println("Improve yourself");
		}
		
	}

}
