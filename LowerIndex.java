import java.util.Scanner;


public class LowerIndex
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements in the array");
		
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		int total = 0;
		
		for(int i=0;i<arr.length; i++)
		{
			int el = sc.nextInt();
			total += el;
			arr[i] = el;
		}
		
		System.out.println("Index is "+findIndex(arr,total));
	}
	
	public static int findIndex(int arr[],int maxSum)
	{
		int lowSum = 0;
		for(int i=0; i<arr.length; i++)
		{
			int el = arr[i];
			
			maxSum -=el;
			
			if(maxSum==lowSum)
				return i;
			
			lowSum += el;
		}
		return -1;
	}
}