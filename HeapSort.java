import java.util.Scanner;

/*
	*This is the implementation of the HeapSort
	
	Heap is the One of the data structure that uses complete binary tree
	to store elemtents it faster than other data structures in searching, creation, and sorting
	There are two varites of heap sort Max Heap and Min heap
	Max Heap ->  Max heap is the heap where every node having the value greater than its all decendents
	Min Heap -> Min heap is the heap where every node having the value less than its all decendents
	* Heap Sort is one of the sorting algorithm 
	* Heap Sort takes O(nlogn) time to sort the list
	* and to create a heap it takes O(n) time by using heapify operation
	* it is alos used as a Priority Queue
*/

public class HeapSort
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);	//to read data from the console
		
		System.out.println("Enter the number of elements in the heap");
		int n = sc.nextInt();
		
		int heap[] = new int[n];
		
		System.out.println("Enter elements into the heap one by one");
		for(int i=0;i<n; i++){
			heap[i] = sc.nextInt();
			//createHeap(heap,i);
		}
		heapify(heap);
		
		System.out.println("After creating the Max Heap ");
		for(int e:heap)
			System.out.println(e+" ");
	}
	public static void createHeap(int heap[],int p)
	{
		
	}
	
	
	public static void heapify(int heap[])
	{
		for(int i=heap.length-1; i>=0; i--)
		{
			adjust(heap,i);
		}
	}
	
	public static void adjust(int heap[],int p)
	{
		int len = heap.length;
		int left = 2*p+1;
		int right = 2*p+2;
		while(left<len || right<len ){
			int leftValue = 0;
			int rightValue = 0;
			
			if(left<len && heap[left]>=heap[p])
			{
				leftValue = heap[left];
				
				heap[left] = heap[p];
				heap[p] = leftValue;
				p = left;
			}
			else if(right<len && heap[right]>heap[p])
			{
				rightValue = heap[right];
				heap[right] = heap[p];
				heap[p] = rightValue;
				p = right;
			}
			
			left = 2*p+1;
			right = 2*p+2;
		}
	}
	
}