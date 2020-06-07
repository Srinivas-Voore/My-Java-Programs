package practise;

class Box3
{
	void volume(int l,int b,int h)
	{
		System.out.println(l*b*h);
	}
}
class Box4 extends Box3 
{
	void volume(int l,int b,int h)
	{
		System.out.println(l*b+b*h+h*l);
	}
}

public class Dynamic_Method_Dispatch 
{
	public static void main(String[] args) 
	{
		Box3 x=new Box3();
		Box4 y=new Box4();
		Box3 ref;
		ref=x;
		ref.volume(1, 2, 3);
		ref=y;
		ref.volume(1, 2, 3);
	}

}
