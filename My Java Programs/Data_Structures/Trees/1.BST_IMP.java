package Trees; 
import java.util.*; 
class BSTnode 
{ 
	BSTnode left; 
	int data; 
	BSTnode right; 
} 
public class BST_IMP
{ 
	public static BSTnode root=null; 
	public static Scanner s=new Scanner(System.in); 
	public static BSTnode insert(BSTnode root, int ele) 
	{ 
		if (root==null) 
		{
			BSTnode newnode = new BSTnode(); 
			newnode.left=null; 
			newnode.right=null; 
			newnode.data=ele; 
			return newnode; 
		} 
		else if(ele<root.data) 
			root.left= insert(root.left,ele); 
		else if(ele>root.data) 
			root.right = insert(root.right,ele); 
		return root; 
	} 
	public static void inorder(BSTnode root) 
	{ 
		if(root!=null) 
		{ 
			inorder(root.left); 
			System.out.print(" " + root.data); 
			inorder(root.right); 
		} 
	}
	public static void postorder(BSTnode root) 
	{ 
		if(root!=null) 
		{ 
			postorder(root.left); 
			postorder(root.right); 
			System.out.print(" " + root.data); 
			} 
	} 
	public static void preorder(BSTnode root) 
	{ 
		if(root!=null) 
		{ 
			System.out.print( " " + root.data); 
			preorder(root.left); 
			preorder(root.right); 
		} 
	} 
	public static BSTnode delete(BSTnode n,int data) 
	{ 
		if(n==null) 
		{ 
			System.out.println("Node not found"); 
			return n; 
		} 
		else if(data < n.data) 
			n.left = delete(n.left, data); 
		else if(data > n.data) 
			n.right = delete(n.right,data); 
		else 
		{ 
			//no children or no left child 
			if(n.left == null) 
				return n.right; 
			//No right child 
			else if(n.right == null) 
				return n.left; 
			else 
			{ 
				BSTnode temp = minValue(n.right);
				n.data = temp.data; 
				n.right = delete(n.right,temp.data); 
			} 
		} 
		return n; 
	}
	public static BSTnode minValue(BSTnode n) 
	{ 
		if(n.left!=null) 
			return minValue(n.left); 
		return n; 
	} 
	public static void main(String args[]) 
	{ 
		while(true) 
		{ 
			System.out.println("\n***Main manu***"); 
			System.out.println("1)Create/Insert a node in Tree"); 
			System.out.println("2)Inorder Traversal"); 
			System.out.println("3)Preorder Traversal"); 
			System.out.println("4)Postorder Traversal"); 
			System.out.println("5)Delete a node"); 
			System.out.println("6)Exit "); 
			System.out.println("Enter your choice"); 
			int cho=s.nextInt(); 
			switch(cho) 
			{ 
			case 1: System.out.println("Enter an element"); 
					int ele=s.nextInt(); 
					root = insert(root,ele); 
					break; 
			case 2: System.out.println("The Inorder traversal\n"); 
					inorder(root); 
					break; 
			case 3: System.out.println("The Preorder traversal\n"); 
					preorder(root); 
					break;
			case 4: System.out.println("The Postorder traversal\n"); 
					postorder(root); 
					break; 
			case 5: System.out.println("Enter an element to be deleted"); 
					int val=s.nextInt(); 
					root = delete(root,val); 
					break; 
			case 6: System.exit(0); 
			default:System.out.println("Enter the number from 1 to 5"); 
			} 
		} 
	} 
}