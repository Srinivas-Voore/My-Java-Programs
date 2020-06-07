package Abstract_Data_Types;
import java.util.Scanner;
public class QUEUE_LL_IMPLEMENT 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		QUEUE_LL qu=new QUEUE_LL();
		while(true)
		{
			System.out.println("*QUEUE using Linked List*");
			System.out.println("1.ENQUEUE");
			System.out.println("2.DEQUEUE");
			System.out.println("3.Display");
			System.out.println("4.exit");
			
			System.out.println("Enter your choice?");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:qu.enqueue();
				   break;
			case 2:qu.dequeue();
			   	   break;
			case 3:qu.display();
			       break;
			case 4:System.exit(0);
			default:System.out.println("Invalid Choice");
			}
			}
		}
}
class Node_q
{
	int data;
	Node_q next;
}
class QUEUE_LL
{
	Node_q front=null;
	Node_q rear=null;
	Node_q p,q,r;
	Scanner sc=new Scanner(System.in);
	void enqueue()
	{
		
		Node_q p=new Node_q();
		int x=sc.nextInt();
		p.data=x;
		p.next=null;
		
		if(rear==null)
			front=rear=p;
		else
		{
			rear.next=p;
			rear=p;
		}
	}
	void dequeue()
	{
		if(front==null)
			System.out.println("Queue is empty");
		else
		{
			p=front;
			front=front.next;
		}
	}
	void display()
	{
		if(front==null)
			System.out.println("Queue is empty");
		else
		{
		for(p=front;p!=null;p=p.next)
			System.out.print(p.data+" ");
		System.out.println();
		}
	}
}
