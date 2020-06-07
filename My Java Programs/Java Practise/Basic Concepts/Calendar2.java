package practise;
import java.util.Calendar;
public class Calendar2 
{
	public static void main(String[] args) 
	{
		Calendar c=Calendar.getInstance();
		System.out.println("Current Date Is: "+c.getTime());
		System.out.println("date is: "+c.get(Calendar.DATE));
		System.out.println("month is: "+c.get(Calendar.MONTH));
		System.out.println("year is: "+c.get(Calendar.YEAR));
	}
}
