package MultiThreading;
class M5 implements Runnable
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
class M6 extends Thread
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
public class Multi_Thread_M2 
{
	public static void main(String[] args) 
	{
		M5 m1=new M5();
		M6 m2=new M6();
		Thread t1=new Thread(m1);
		m2.start();
		t1.start();
	}

}
