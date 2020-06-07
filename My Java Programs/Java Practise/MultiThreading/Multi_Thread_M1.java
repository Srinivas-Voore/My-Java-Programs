package MultiThreading;
class M2 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(i);
				Thread.sleep(3000);
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);
		}
	}
}
class M3 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=5;i>=1;i--)
			{
				System.out.println(i);
				Thread.sleep(3000);
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);
		}
		
	}
}
public class Multi_Thread_M1 
{
	public static void main(String[] args) 
	{
		M2 t1=new M2();
		M3 t2=new M3();
		t2.start();
		t1.start();
	}

}
