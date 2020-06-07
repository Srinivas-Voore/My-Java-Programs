package practise;

class H
{
	int data=10;
	void change(int data)
	{
		data=data+100;
	}
}
public class Callbyvalue 
{
	public static void main(String[] args) 
	{
		H x=new H();
		System.out.println(x.data);
		x.change(50);
		System.out.println(x.data);
	}

}
