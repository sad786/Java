import java.util.Scanner;

public class SelectionSort
{
	private static int count= 0;
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		
		sort(arr);
		
		for(int e:arr)
			System.out.print(e+" ");
		
		System.out.println("\nThe total number of counts are "+count);
	}
	
	public static void sort(int arr[])
	{
		for(int i=0;i<arr.length; i++)
		{
			count+=1;
			int minin = min(i,arr);
			if(arr[minin]<arr[i])
			{
				int temp = arr[i];
				arr[i] = arr[minin];
				arr[minin] = temp;
			}
		}
	}
	
	public static int min(int start, int arr[])
	{
		int min = arr[start];
		int minin = start;
		for(int i=start+1; i<arr.length; i++)
		{
			count+=1;
			if(min>arr[i]){
				min = arr[i];
				minin = i;
			}
		}
		
		return minin;
	}
}
