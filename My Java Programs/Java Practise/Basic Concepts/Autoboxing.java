package practise;

public class Autoboxing 
{
	public static void main(String[] args) 
	{
		int i=5;
		Integer x=new Integer(i);
		System.out.println(x);
		float f=10.2f;
		Float y=new Float(f);
		System.out.println(y);
		double d=12.3;
		Double m=new Double(d);
		System.out.println(m);
		boolean b=true;                           //Autoboxing
		Boolean z=new Boolean(b);
		System.out.println(z);
		char c='a';
		Character l=new Character(c);
		System.out.println(l);
		String s="srinivas";
		String u=new String(s);
		System.out.println(u);
				
	}

}
