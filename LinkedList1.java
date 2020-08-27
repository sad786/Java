import java.util.*;


public class LinkedList implements Iterable<Integer> 
{
	private Node head=null;
	private Node tail=null;
	private class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data = data;
			//this.next = next;
		}
		/*
		public void setData(int data){this.data = data;}
		public int getData(){return data;}
		
		public void setNext(Node next){this.next = next;}
		public Node getNext(){return next;}
		
		*/
	}
	
	//private Iterator<Integer> iter = 
	
	public void add(int data)
	{
		Node node = new Node(data);
		if(head==null){
			head = node;
			tail = node;
		}
		else
		{
			tail.next = node;
			tail = node;
		}
	}
	
	public int get(int index)
	{
		if(head==null)
			return -1;
		else
		{
			Node temp = head;
			while(temp != null&& index>0)
			{
				temp = temp.next;
				index = index -1;
			}
			
			return temp==null ? -1 : temp.data;
				
		}
	}
	
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		LinkedList list = new LinkedList();
		
		while(sc.next().trim().equals("n"))
		{
			int data = sc.nextInt();
			list.add(data);
		}
		
		//System.out.println(list);
		
		for(Integer item:list)
			System.out.println(item);
		
		for(Object item:list)
			System.out.print(item+" ");
	}
	
	@Override
	public String toString()
	{
		StringBuilder res = new StringBuilder("[");
		Node temp = head;
		
		while(temp!=null)
		{
			res.append(temp.data+" ");
			temp = temp.next;
		}
		res.append("]");
		return res.toString();
	}

	@Override
	public Iterator<Integer> iterator()
	{
		//System.out.println("I am Called");
		return new Iterator<Integer>(){
		
		private Node cur = head;
		@Override
		public boolean hasNext()
		{
			//System.out.println("I am hasNext()");
			return cur != null;
		}
		
		@Override
		public Integer next()
		{
			int data = cur.data;
			cur = cur.next;
			//System.out.println("I am next()");
			return data;
		}
	};
	}
}