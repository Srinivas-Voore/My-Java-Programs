package practise;
import java.util.ArrayList;
import java.util.Scanner;
class Person
{
	private long id;
	private String name;
	
	void setData(long id,String name)
	{
		/*try 
		{
		this.id=id;
		this.name=name;
		}
		catch(InvalidInputException e)
		{
			System.out.println(e);
		}*/
	}
	
	long getId()
	{
		return id;
	}
	String getName()
	{
		return name;
	}
	
	Person(long id,String name,int m,int p,int c)
	{
		System.out.println("Id:"+id+"Name:"+name+"Maths:"+m+"Physics:"+p+"Chemistry:"+c);
	}
}

public class Student extends Person
{
	Student(long id, String name, int m, int p, int c) 
	{
		super(id, name, m, p, c);
	}
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int m,p,c;
		ArrayList<Student> al=new ArrayList<Student>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		al.add(new Student(sc.nextLong(),sc.nextLine(),sc.nextInt(),sc.nextInt(),sc.nextInt()));
		}
	}

}
