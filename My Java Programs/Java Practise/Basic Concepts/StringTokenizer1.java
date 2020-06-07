package practise;
import java.util.StringTokenizer;
public class StringTokenizer1 
{
	public static void main(String[] args) 
	{
		StringTokenizer s=new StringTokenizer("hii how are you ?");
		while(s.hasMoreTokens())
		{
			System.out.println(s.nextToken());
		}
	}
}
