package practise;
import java.lang.StringBuffer;
public class StringBuffer3 
{
	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("iv KLUniversity");
		System.out.println(sb.indexOf("Uni"));
		System.out.println(sb.lastIndexOf("iv"));
		System.out.println(sb.replace(0, 2, "Hi"));	
	}
}
