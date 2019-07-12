import java.util.*;

public class Heap
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		System.out.println("How much elements are there?");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter elements level by level");
		
		for(int i=0;i<n; i++)arr[i] = sc.nextInt();
		
		hepify(arr);
		
		/*
		for(int i:arr)
			System.out.print(i+" ");
		
		int max = deleteNode(arr,n-1);
		System.out.println("After deleting one maximum element "+max+" heap looks like");
		for(int i:arr)
			System.out.print(i+" ");
		*/
		int level = 0;
		if(n/2==0)
			level = n/2;
		else
			level = n/2+1;
		int space = level-1;
		int index = 0;
		for(int i=0;i<level; i++)
		{
			for(int s=0; s<space; s++)System.out.print(" ");
			for(int c=i;c<=2*i&&index<n; c++)
			{
				System.out.print(arr[index++]+" ");
			}
			System.out.println('\n');
			space -=1;
		}
		
		
	}
	
	private static int deleteNode(int arr[],int last)
	{
		int deleted = arr[0];
		arr[0] = arr[last];
		arr[last] = -1;
		
		adjust(arr,0,last);
		
		arr[last] = deleted;
		return deleted;
	}
	
	private static  void hepify(int arr[])
	{
		int last = arr.length-1;
		int root = last;
		
		while(root>=0)
		{
			adjust(arr,root,last);
			root -=1;
		}
		
	}
	
	private static void adjust(int arr[],int root,int last)
	{
		int left = 2*root+1;
		int right = 2*root+2;

		boolean flag = true;
		while(flag&&left<=last&&right<=last)
		{
			flag = false;
			int le = arr[left];
			int re = arr[right];
			
			int max = Math.max(le,re);
			if(max>arr[root])
			{
				flag = true;
				if(max==le)
				{
					arr[left] = arr[root];
					arr[root] = le;
					root = left;
				}
				else
				{
					arr[right] = arr[root];
					arr[root] = re;
					root = right;
				}
				left = 2*root+1;
				right = 2*root+2;
			}
		}
	}
	
	public static void insert(int arr[],int data,int last)
	{
		
	}
}