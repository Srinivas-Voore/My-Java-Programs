package Collections;
import java.util.*;
public class Array_List {
	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>(); 
		al.add("srinu");
		al.add("Kasi");
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
