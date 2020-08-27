import java.util.*;

public class LinkedList
{
	private Node list;
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		
		LinkedList linkedList = new LinkedList();
		linkedList.add(4);
		linkedList.add(3);
		linkedList.add(2);
		linkedList.add(1);
		
		
		System.out.println("Before Reverse -> "+linkedList);
		//linkedList.reverse();
		//linkedList.list = linkedList.recursiveReverse(null,linkedList.list);
		linkedList.pairReverse();
		System.out.println("After Reverse -> "+linkedList);
		
	}
	public Node recursiveReverse(Node pre,Node cur)
	{
		if(cur ==null)
			return pre;
		
		Node next = cur.next;
		cur.next = pre;
		pre = cur;
		return recursiveReverse(pre,next);
	}
	public void add(int data)
	{
		Node node = new Node(data);
		if(list != null)
			node.next = list;
		list = node;
	}
	
	@Override
	public String toString()
	{
		Node temp = list;
		
		StringBuilder res = new StringBuilder();
		while(temp != null){
			res.append(temp.data);
			res.append(" ");
			temp = temp.next;
		}
		
		return res.toString();
	}
	public void pairReverse()
	{
		/*
		Node temp = list;
		
		while(temp != null)
		{
			int t = temp.data;
			temp.data = temp.next.data;
			temp.next.data = t;
			temp = temp.next.next;
		}
		*/
	}
	public void reverse()
	{
		Node pre = null;
		Node cur = list;
		Node next = list;
		
		while(next !=null)
		{
			cur = next;
			next = next.next;
			cur.next = pre;
			pre = cur;
			
		}
		
		list = cur;
	}
	private class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data = data;
		}
	}
}