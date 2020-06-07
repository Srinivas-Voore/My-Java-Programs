package Collections;
import java.util.*;
public class Linked_List {
	public static void main(String[] args) 
	{
		LinkedList<String> ll=new LinkedList<String>(); 
		ll.add("srinu");
		ll.add("Kasi");
		Collections.sort(ll);
		Iterator i=ll.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
