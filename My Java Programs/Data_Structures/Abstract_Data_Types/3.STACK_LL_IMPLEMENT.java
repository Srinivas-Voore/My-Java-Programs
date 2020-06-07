package Abstract_Data_Types;

import java.util.Scanner;

public class STACK_LL_IMPLEMENT 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		STACK_LL st=new STACK_LL();
		while(true)
		{
			System.out.println("*STACK using Linked List*");
			System.out.println("1.PUSH");
			System.out.println("2.POP");
			System.out.println("3.PEEK");
			System.out.println("4.Display");
			System.out.println("5.exit");
			
			System.out.println("Enter your choice?");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:st.push();
				   break;
			case 2:st.pop();;
			   	   break;
			case 3:st.peek();
			       break;
			case 4:st.display();
			       break;
			case 5:System.exit(0);
			default:System.out.println("Invalid Choice");
			}
			}
		}
	}
class Node_s
{
	int data;
	Node_s next;
}
class STACK_LL
{
	Node_s top=null;
	Node_s p,q,r;
	Scanner sc=new Scanner(System.in);
	public void push()
	{
		Node_s p=new Node_s();
		int x=sc.nextInt();
		p.data=x;
		p.next=null;
		if(top==null)
			top=p;
		else
		{
			p.next=top;
			top=p;
		}
	}
	public void pop()
	{
		if(top==null)
			System.out.println("Stack is empty");
		else
		{
			p=top;
			top=top.next;
		}
	}
	public void peek()
	{
		if(top==null)
			System.out.println("Stack is empty");
		else
			System.out.println(top.data);
	}
	public void display()
	{
		if(top==null)
			System.out.println("Stack is empty");
		else
		{
			for(p=top;p!=null;p=p.next)
				System.out.print(p.data+" ");
			System.out.println();
		}
	}
	
}
