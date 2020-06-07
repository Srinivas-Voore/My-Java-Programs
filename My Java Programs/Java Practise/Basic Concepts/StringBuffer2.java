package practise;
import java.lang.StringBuffer;
public class StringBuffer2 
{
	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("KLUniversity");
		String str=" is best";
		System.out.println(sb);
		System.out.println(sb.append(str));
		System.out.println(sb.insert(0,"hii "));
		System.out.println(sb.delete(1,3));
		System.out.println(sb.deleteCharAt(2));
		System.out.println(sb.reverse());
	}
}
