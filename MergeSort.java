import java.util.*;
public class MergeSort
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[1000];

		for(int i=0;i<n; i++)
			arr[i] = sc.nextInt();
		
		/*
		for(int i=0; i<(1000-4); i++)
		{
			arr[i++] = 986;
			arr[i++] = 834;
			arr[i++] = 90;
			arr[i] = 10000;
		}
		*/
		var before = System.nanoTime();
		mergeSort(0,n-1,arr);
		System.out.println("Time taken by algorithm is "+(System.nanoTime()-before)/1000.0f);
		for(int e:arr)
			System.out.print(e+" ");
	}
	
	public static void mergeSort(int lb,int ub,int arr[])
	{
		if(lb<ub)
		{
			int mid = (lb+ub)/2;
			mergeSort(lb,mid,arr);
			mergeSort(mid+1,ub,arr);
			merge(lb,mid,ub,arr);
		}
	}
	
	public static void merge(int lb, int mid, int ub, int arr[])
	{
		int i = lb;
		int j = mid+1;
		int in = 0;
		int A[] = new int[ub+1];
		while(i<=mid&&j<=ub)
		{
			if(arr[i]<=arr[j])
				A[in++] = arr[i++];
			else if(arr[j]<arr[i])
				A[in++] = arr[j++];
		}
		
		while(i<=mid)
			A[in++] = arr[i++];
		while(j<=ub)
			A[in++] = arr[j++];
		in = 0;
		for(int k=lb; k<=ub;k++)
			arr[k] = A[in++];
	}
}