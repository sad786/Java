import java.util.Scanner;

/*
	* This is the implementation of the HeapSort
	
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
	private static int size = 0;		// to store actual size of the heap
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);	//to read data from the console
		
		System.out.println("Enter the number of elements in the heap");
		size = sc.nextInt();
		
		int heap[] = new int[100];
		
		System.out.println("Enter elements into the heap one by one");
		for(int i=0;i<size; i++){
			heap[i] = sc.nextInt();
			adjust(heap,i);
		}
		
		System.out.println("After creating the Max Heap ");
		for(int i=0;i<size; i++)
			System.out.print(heap[i]+" ");
		
		/*
		for(int i=0;i<size; i++)
			delete(heap);
		*/
	}

	
	/*
		* delete operation takes log(n) time 
		* this method will delete the max element or root element 
		* every time we call this method
	*/
	public static void delete(int heap[])
	{
		size -=1;
		
		int temp = heap[size];
		heap[size] = heap[0];
		heap[0] = temp;
		
		int parent = 0;
		int left = parent*2+1;
		int right = parent*2+2;
		
		while(left<size && right<size && parent<size)
		{
			int max = heap[left]>heap[right]?heap[left]:heap[right];
			
			if(heap[parent]<max)
			{
				
				if(max==heap[left])
				{
					heap[left] = heap[parent];
					heap[parent] = max;
					parent = left;
				}else
				{
					heap[right] = heap[parent];
					heap[parent] = max;
					parent = right;
				}
				
			}else
			{
				break;
			}
			
			left = parent*2+1;
			right = parent*2 +2;
			
		}
		
		System.out.println();
		for(int i=0;i<size; i++)
			System.out.print(heap[i]+" ");
	}
	
	/*
		* this method is used to adjust the heap 
		* when we insert new element the heap gets disturbed
		* by called this method at that time it will make perfect heap
		* this method we can call also at the time of creating the heap
		
		* this method takes O(log(n)) time to execute
	*/
	public static void adjust(int heap[],int node)
	{
		int parent = node/2;
		
		while(parent>=0 && heap[parent]<heap[node])
		{
			int temp = heap[parent];
			heap[parent] = heap[node];
			heap[node] = temp;
			
			node = parent;
			parent = parent/2;
		}
	}
}