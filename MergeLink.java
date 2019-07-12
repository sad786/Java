import java.util.Scanner;
class Node
{
	public Node(int data)
	{
		value = data;
	}
	public Node(){}
	int value;
	Node next;
}
public class MergeLink
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		System.out.println("Enter number of elements in the List");
		int n  = sc.nextInt();
		Node list = null;
		for(int i=0;i<n; i++)
		{
			var node = new Node(sc.nextInt());
			if(list==null)	node.next = null;
			else node.next = list;
			
			list = node;
		}
		
		sort(list,0,n-1);
		while(list!=null){
			System.out.print(list.value+" ");
			list = list.next;
		}
	}
	
	public static void sort(Node list, int lb,int ub)
	{
		if(lb<ub)
		{
			int mid = (lb+ub)/2;
			sort(list,lb,mid);
			sort(list,mid+1,ub);
			merge(list,lb,mid,ub);
		}
	}
	
	public static void merge(Node list,int l,int m,int h)
	{
		int left = 0,right = l+1;
		Node leftNode=list,rightNode= null;
		while(left<l){
			leftNode = leftNode.next;
			left +=1;
		}
		
		rightNode = leftNode.next;
		while(right<=m)
		{
			right +=1;
			rightNode = rightNode.next;
		}
		
		//left = l;right = m+1;
		
		while(left<=m && right<=h)
		{
			if(leftNode.value>rightNode.value)
			{
				int temp = leftNode.value;
				leftNode.value = rightNode.value;
				rightNode.value = temp;
				leftNode = leftNode.next;
				left +=1;
				right +=1;
				rightNode = rightNode.next;
			}
			else
			{
				leftNode = leftNode.next;
				//rightNode = rightNode.next;
				//right +=1;
				left +=1;
			}
		}
		
		rightNode = null;
		leftNode = null;
	}
}