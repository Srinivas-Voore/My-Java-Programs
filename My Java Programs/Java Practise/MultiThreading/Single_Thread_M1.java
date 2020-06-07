package MultiThreading;
class M1 extends Thread
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
public class Single_Thread_M1 
{
	public static void main(String[] args) 
	{
		M1 t=new M1();
		t.start();
	}

}
