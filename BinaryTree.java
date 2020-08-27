import java.util.Scanner;

public class BinaryTree
{
	private BTree root;
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		
		BinaryTree bt = new BinaryTree();
		
		System.out.println("Enter how many elements are there");
		
		int n = sc.nextInt();
		
		System.out.println("Enter elements one by one");
		
		for(int i=0;i<n; i++)
			bt.insert(sc.nextInt());
		
		
		System.out.println(bt);
		
		System.out.println("What element you want to delte");
		int del = sc.nextInt();
		
		bt.delete(del);
		
		System.out.println(bt);
	}
	
	public BTree makeTree()
	{
		return root;
	}
	
	public void insert(int data)
	{
		BTree node = new BTree(data);
		if(root == null)
		{
			root = node;
		}else
		{
			BTree temp = root;
			BTree pre = null;
			while(temp!=null)
			{
				pre = temp;
				if(temp.data>data)
					temp = temp.left;
				else
					temp = temp.right;
			}
			
			if(pre.data>data)
				pre.left = node;
			else
				pre.right = node;
			
		}
	}
	
	public String toString()
	{
		if(root==null)
			return "Empty Tree";
		
		StringBuilder sb = new StringBuilder();
		
		inorder(root,sb);
		
		return sb.toString();
	}
	
	public void inorder(BTree root,StringBuilder sb)
	{
		if(root == null)
			return;
		
		inorder(root.left,sb);
		sb.append(root.data+" ");
		inorder(root.right,sb);
	}
	
	public boolean delete(int data)
	{
		BTree temp = root;
		BTree pre = null;
		
		
		while(temp !=null)
		{
			if(temp.data==data)
			{
				if(temp==root)
				{
					root = null;
				}
				else
				{
					if(pre.right==temp)
					{
						BTree leftTree = temp.left;
						pre.right = temp.right;
						
						BTree leftTemp = pre.right;
						
						while(leftTemp.left==null)
						{
							leftTemp = leftTemp.left;
						}
						
						leftTemp.left = leftTree;
					}
					else 
					{
						BTree rightTree = temp.right;
						pre.left = temp.left;
						
						BTree rightTemp = pre.left;
						
						while(rightTemp.right != null)
						{
							rightTemp = rightTemp.right;
						}
						
						rightTemp.right = rightTree;
					}
				}
				
				return true;
			}else if(temp.data<data){
				pre = temp;
				temp = temp.right;
			}
			else{
				pre = temp;
				temp = temp.left;
			}
		}
		
		return false;
	}
}

class BTree
{
	BTree left;
	int data;
	BTree right;
	
	public BTree(int data)
	{
		this.data = data;
	}
}