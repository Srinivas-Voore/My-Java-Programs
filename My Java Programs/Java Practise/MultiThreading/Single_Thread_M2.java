package MultiThreading;
class M4 implements Runnable
{
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(i);
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);
		}
	}
}
public class Single_Thread_M2 
{
	public static void main(String[] args) 
	{
		M4 m2=new M4();
		Thread t=new Thread(m2);
		t.start();
	}

}
