package practise;
import java.util.Calendar;
public class Calendar1 
{
	public static void main(String[] args) 
	{
		Calendar c=Calendar.getInstance();
		System.out.println("Current Date Is: "+c.getTime());
		c.add(Calendar.DATE,-15);
		System.out.println("15 days ago date is: "+c.getTime());
		c.add(Calendar.MONTH,4);
		System.out.println("4 months after date is: "+c.getTime());
		c.add(Calendar.YEAR,7);
		System.out.println("7 years later date is: "+c.getTime());
	}
}
