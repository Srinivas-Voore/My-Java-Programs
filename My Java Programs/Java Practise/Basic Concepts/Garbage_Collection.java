package practise;

public class Garbage_Collection 
{
	public void finalize() 	
	{	
		System.out.println("objects are collected");
	}
	public static void main(String[] args) 
	{
		Garbage_Collection a=new Garbage_Collection();
		Garbage_Collection b=new Garbage_Collection();
		Garbage_Collection c=new Garbage_Collection();
		b=null;
		c=null;
		System.gc();
	}

}
