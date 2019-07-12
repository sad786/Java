import java.util.*;
import java.io.*;
class ListNode
{
	int nodeNo;
	int cost;
	ListNode next;
	public ListNode(int nodeNo,int cost)
	{
		this.nodeNo = nodeNo;
		this.cost = cost;
	}
}

class Graph
{
	int v;
	int e;
	ListNode adj[];
	public Graph(int v,int e)
	{
		this.v = v;
		this.e = e;
	}
}

public class GraphTest
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		//Graph g = new Graph();
		System.out.println("Enter the number of nodes");
		int v = sc.nextInt();
		System.out.println("Enter the number of edges");
		int e = sc.nextInt();
		Graph g = new Graph(v,e);
		ListNode list[] = new ListNode[v];
		g.adj = list;
		for(int i=0;i<v; i++)
		{
			list[i] = new ListNode(i,0);
			list[i].next = list[i];
		}
		for(int i=0;i<e; i++)
		{
			System.out.println("Enter node number which is directly related");
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.println("Enter the cost of the edge");
			int c = sc.nextInt();
			ListNode temp = new ListNode(y,c);
			temp.next = list[x];
			
			ListNode t = list[x];
			while(t.next!=list[x])
				t = t.next;
			t.next = temp;
		}
		
		System.out.println("Enter the source vertex");
		int source = sc.nextInt();
		int arr[][] = new int[v-1][v-1];	
		var ve = new ArrayList<Integer>();
		var pe = new ArrayList<Integer>();
		for(int e:list)
		{
			if(e!=source)
				ve.add(e);
		}
		pe.add(source);
		for(int i=0;i<v-1; i++)
		{
			
		}
		for(int i=0;i<v; i++)
		{
			for(int j=0; j<v; j++)
			{
				
			}
		}
		
	}
}




