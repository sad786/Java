import java.util.Scanner;
public class BinarySearch
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter elements of Array:");
		for(int i=0; i<size; i++)
			arr[i] = sc.nextInt();
		
		// here we are using binary search for searching an element
		
		System.out.println("Enter the elements you want to search");
		int ele = sc.nextInt();
		int lb=0,ub=size-1;
		while(lb<=ub)
		{
			int mid = (lb+ub)/2;
			if(arr[mid]==ele){
				System.out.println("Element is searched and index is "+(mid+1));
				break;
			}
			if(ele>arr[mid])
				lb = mid+1;
			else
				ub = mid-1;
			
		}
	}
}