package practise;

public class Unboxing 
{
	public static void main(String[] args) 
	{
		int i=5;
		Integer x=new Integer(i);
		System.out.println(x);
		float f=10.2f;
		Float y=new Float(f);
		System.out.println(y);
		double d=12.3;                                 //Autoboxing
		Double m=new Double(d);
		System.out.println(m);
		boolean b=true;
		Boolean z=new Boolean(b);
		System.out.println(z);
		char c='a';
		Character l=new Character(c);
		System.out.println(l);
		String s="srinivas";
		String u=new String(s);
		System.out.println(u);
		
		int ww=x;
		System.out.println(ww);
		float vv=y;
		System.out.println(vv);
		double uu=m;
		System.out.println(uu);
		boolean bb=z;                                //Unboxing
		System.out.println(bb);
		char cc=l;
		System.out.println(cc);
		String ss=u;
		System.out.println(ss);
	}

}
