package practise;
import java.lang.StringBuffer;
public class StringBuffer1
{
	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("hai how are you?");
		System.out.println(sb);
		System.out.println(sb.capacity());
		//16 initial +15 in current string
	}
}
