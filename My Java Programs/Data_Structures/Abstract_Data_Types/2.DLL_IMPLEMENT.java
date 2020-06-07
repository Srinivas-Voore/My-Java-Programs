package Abstract_Data_Types;

import java.util.Scanner;

public class DLL_IMPLEMENT 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		DLL dll=new DLL();
		while(true)
		{
		System.out.println("*Double Linked List*");
		System.out.println("1.create a list");
		System.out.println("2.insert at begin");
		System.out.println("3.insert at end");
		System.out.println("4.insert at position");
		System.out.println("5.delete at begin");
		System.out.println("6.delete at end");
		System.out.println("7.delete at position");
		System.out.println("8.display list");
		System.out.println("9.exit");
		
		System.out.println("Enter your choice?");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:dll.create();
			   break;
		case 2:dll.insBeg();;
		   	   break;
		case 3:dll.insEnd();
		       break;
		case 4:dll.insPos();
		       break;
		case 5:dll.delBeg();
		       break;
		case 6:dll.delEnd();
		       break;
		case 7:dll.delPos();
		       break;
		case 8:dll.display();
		       break;
		case 9:System.exit(0);
		default:System.out.println("Invalid Choice");
		}
		}
	}
}
class Node_d
{
	Node_d prev;
	int data;
	Node_d next;
}
class DLL
{
	Node_d head=null;
	Node_d tail=null;
	Node_d p,q,r;
	Scanner sc=new Scanner(System.in);
	void create()
	{
		System.out.println("Enter how many nodes you want?");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			Node_d p=new Node_d();
			int x=sc.nextInt();
			p.data=x;
			p.prev=null;
			p.next=null;
			if(i==1)
				head=tail=p;
			else
			{
				tail.next=p;
				p.prev=tail;
				tail=p;
			}	
		}	
	}
	void insBeg()
	{
		Node_d q=new Node_d();
		int x=sc.nextInt();
		q.data=x;
		q.prev=null;
		q.next=null;
		
		q.next=head;
		head.prev=q;
		head=q;
	}
	void insEnd()
	{
		Node_d q=new Node_d();
		int x=sc.nextInt();
		q.data=x;
		q.prev=null;
		q.next=null;
		
		tail.next=q;
		q.prev=tail;
		tail=q;
	}
	void insPos()
	{
		Node_d q=new Node_d();
		int x=sc.nextInt();
		q.data=x;
		q.prev=null;
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
		q.prev=r;
		q.next=p;
		p.prev=q;
	}
	void delBeg()
	{
		if(head==null)
			System.out.println("list is empty");
		else
		{
			p=head;
			head=head.next;
			head.prev=null;
		}
	}
	void delEnd()
	{
		if(head==null)
			System.out.println("list is empty");
		else
		{
			p=tail;
			tail=tail.prev;
			p.prev=null;
			tail.next=null;
		}
	}
	void delPos()
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
			p.next.prev=p.prev;
			p.prev=null;
			p.next=null;
		}
	}
	void display()
	{
		if(head==null)
			System.out.println("list is empty");
		else
		{
			for(p=head;p!=null;p=p.next)
				System.out.print("->"+"<-"+p.data);
			System.out.println();
		}
	}
}
