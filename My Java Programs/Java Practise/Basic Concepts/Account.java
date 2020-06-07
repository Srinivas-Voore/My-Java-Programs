package practise;
import java.util.Scanner;
public class Account 
{
	int rno;
	String dept,name;
	public void setdata(int x,String y,String z)
	{
		rno=x;
		name=y;
		dept=z;
	}
	public void getdata()
	{
		System.out.println(rno);
		System.out.println(name);
		System.out.println(dept);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Account a[]=new Account[10];
		for(int i=0;i<10;i++)
		{
			a[i]=new Account();
		}
		for(int i=0;i<10;i++)
		{
			a[i].setdata(sc.nextInt(), sc.next(), sc.next());
		}
		for(int i=0;i<10;i++)
		{
			a[i].getdata();
		}
	}

}
