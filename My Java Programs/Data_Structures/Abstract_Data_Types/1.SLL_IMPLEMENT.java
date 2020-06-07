package Abstract_Data_Types;
import java.util.Scanner;

public class SLL_IMPLEMENT {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		SLL sll=new SLL();
		while(true)
		{
		System.out.println("*Single Linked List*");
		System.out.println("1.create a list");
		System.out.println("2.insert at begin");
		System.out.println("3.insert at end");
		System.out.println("4.insert at position");
		System.out.println("5.delete at begin");
		System.out.println("6.delete at end");
		System.out.println("7.delete at position");
		System.out.println("8.reverse");
		System.out.println("9.display list");
		System.out.println("10.exit");
		
		System.out.println("Enter your choice?");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:sll.create();
			   break;
		case 2:sll.insBeg();;
		   	   break;
		case 3:sll.insEnd();
		       break;
		case 4:sll.insPos();
		       break;
		case 5:sll.delBeg();
		       break;
		case 6:sll.delEnd();
		       break;
		case 7:sll.delPos();
		       break;
		case 8:sll.reverse();
		       break;
		case 9:sll.display();
	       break;
		case 10:System.exit(0);
		default:System.out.println("Invalid Choice");
		}
		}
	}

}

class Node
{
	int data;
	Node next;
}

class SLL
{
	Node head=null;
	Node tail=null;
	Node p,q,r;
	
	Scanner sc=new Scanner(System.in);
	
	public void create()
	{
		System.out.println("Enter how many nodes you want?");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			Node p=new Node();
			int x=sc.nextInt();
			p.data=x;
			p.next=null;
		
			if(i==1)
				head=tail=p;
			else
			{
				tail.next=p;
				tail=p;
			}
		}
	}
	
	public void insBeg()
	{
		Node q=new Node();
		int x=sc.nextInt();
		q.data=x;
		q.next=null;
		
		q.next=head;
		head=q;
	}
	
	public void insEnd()
	{
		Node q=new Node();
		int x=sc.nextInt();
		q.data=x;
		q.next=null;
		
		tail.next=q;
		tail=q;
	}
	
	public void insPos()
	{
		Node q=new Node();
		int x=sc.nextInt();
		q.data=x;
		q.next=null;
		
		int pos=sc.nextInt();
		int i=1;
		p=head;
		while(i<pos)
		{
			r=p;
			p=p.next;
			i++;
		}
		
		r.next=q;
		q.next=p;
	}
	
	public void delBeg()
	{
		if(head==null)
			System.out.println("list is empty");
		else
		{
			p=head;
			head=head.next;
		}
	}
	
	public void delEnd()
	{
		if(head==null)
			System.out.println("list is empty");
		else
		{
			p=head;
			while(p.next!=null)
			{
				r=p;
				p=p.next;
			}
			r.next=tail;
			tail=r;
			tail.next=null;
		}
	}
	
	public void delPos()
	{
		if(head==null)
			System.out.println("list is empty");
		else
		{
		int pos=sc.nextInt();
		int i=1;
		p=head;
		while(i<pos)
		{
			r=p;
			p=p.next;
			i++;
		}
		r.next=p.next;
		}
	}
	
	public void display()
	{
		int c=0;
		if(head==null)
			System.out.println("list is empty");
		else
		{
			for(p=head;p!=null;p=p.next)
			{
				System.out.print("->"+p.data);
				c++;
			}
			System.out.println();
		}
		System.out.println("No.Of NODES = "+c);
	}
	public void reverse()
	{
		if (head == null ) {
			System.out.println("list is empty");
		}
		else
		{
			p=null;
			q=head;
			r=q.next;
			while(q!=null)
			{
				q.next=p;
				p=q;
				q=r;
				if(r!=null)
					r=r.next;
			}
			head=p;
		}	
	}
}
