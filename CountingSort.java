// this program is the implementation of Counting Sort

import java.util.*;
public class CountingSort
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i=0;i<n; i++)
			arr[i] = sc.nextInt();
		
		countSort(arr);
		for(int e:arr)
			System.out.print(e+" ");
	}
	
	public static void countSort(int arr[])
	{
		int max = getMax(arr);
		int copy[] = new int[arr.length];
		
		for(int i=0;i<arr.length; i++)
			copy[i] = arr[i];
		
		int count[] = new int[max+1];   // this array will hold the counting of each element
			for(int j=0;j<arr.length; j++)
				count[arr[j]]+=1;
			
		for(int i=1;i<=max; i++)		// each element will hold the sum of previous and  its own value
			count[i] = count[i-1]+count[i];
		
		for(int i=0;i<arr.length; i++)
		{
			arr[count[copy[i]]-1] = copy[i];  // now each element will get its right place 
			count[copy[i]]-=1;
		}
	}
	
	public static int getMax(int arr[])
	{
		int max = 0;
		for(int e:arr)
			if(e>max)
				max= e;
		return max;
	}
}