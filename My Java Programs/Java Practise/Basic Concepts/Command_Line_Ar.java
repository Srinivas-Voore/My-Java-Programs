package practise;

public class Command_Line_Ar 
{
	public static void main(String ar[]) 
	{
		int l,b;
		l=Integer.parseInt(ar[0]);
		b=Integer.parseInt(ar[1]);
		float c;
		c=Float.parseFloat(ar[2]);
		System.out.println(c);
		int area;
		area=l*b;
		System.out.println(area);
	}

}
/*To Run command line arguments goto
 * Run->Run Configurations...->Arguments->program arguments
 * type the arguments as per index values u mentioned*/
