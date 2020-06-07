package practise;
import java.util.TimeZone;
public class TimeZone1
{
	public static void main(String[] args) 
	{
		TimeZone z=TimeZone.getTimeZone("Asia/Karachi");
		System.out.println("current zone is: "+z.getID());
		System.out.println("Display timezone is: "+z.getDisplayName());
	}

}
