package practise;
import java.util.Scanner;
import Anotherpackage.getChangePercent;
public class stock
{
	public static void main(String[] args) 
	{
		values v=new values();
		v.val();
	}	
}
class values
{
	void val()
	{
	String symbol,name;
	Scanner sc=new Scanner(System.in);
	symbol=sc.nextLine();
	name=sc.nextLine();
	double previousprice,currentprice;
	previousprice=sc.nextDouble();
	currentprice=sc.nextDouble();
	double y=getChangePercent.getChangePercent(previousprice, currentprice);
	System.out.println(symbol+" "+name+" "+y+"%");
	}
}
