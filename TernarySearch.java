import java.util.Scanner;

public class TernarySearch
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		
		MergeSort.mergeSort(0,n-1,arr);
		
		System.out.println("Enter element you want to search ");
		int el = sc.nextInt();
		
		int index = tarnarySearch(0,n-1,el,arr);
		if(index==-1)
			System.out.println("The Entered element is not found in list ");
		else
			System.out.println("Element is found in the location "+(index+1)+" index");
	}
	
	public static int tarnarySearch(int start, int end, int el,int arr[])
	{
		if(start>end)
			return -1;
		int mid1 = start+(end-start)/3;
		int mid2 = start+(2*(end-start))/3;
		
		if(el==arr[mid1])
			return mid1;
		else if(el==arr[mid2])
			return mid2;
		else if(el<arr[mid1])
			return tarnarySearch(start,mid1-1,el,arr);
		else if(el>arr[mid2])
			return tarnarySearch(mid2+1,end,el,arr);
		else
			return tarnarySearch(mid1,mid2,el,arr);
	}
}