package Insert.insert;
import java.util.Scanner;
import java.time.*;
public class InsertionSort
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter Elements into array ");
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		
		var time1 = LocalTime.now().toNanoOfDay();
		//sorting algorithm of Insertion sort
		for(var i=1; i<n; i++)
		{
			var key = arr[i];
			var j = i-1;
			while(j>=0&&arr[j]>key)
			{
				arr[j+1] = arr[j];
				//arr[j] = key;
				j-=1;
			}
			arr[j+1] = key;
		}
		
		var time2 = LocalTime.now().toNanoOfDay();
		System.out.println("Total Time taken by algorithm is "+(time2-time1));
		for(var i:arr)
			System.out.print(" "+i);
	}
}