package MultiThreading;
class M7 extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getPriority());	
	}		
}
public class Threads_PRIORITY 
{
	public static void main(String[] args) 
	{
		M7 m1=new M7();
		M7 m2=new M7();
		M7 m3=new M7();
		M7 m4=new M7();
		m1.setPriority(10);
		m2.setPriority(1);
		m3.setPriority(5);
		m4.setPriority(2);
		m1.start();
		m2.start();
		m3.start();
		m4.start();
	}
}
