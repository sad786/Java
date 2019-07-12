import java.util.Scanner;

public class Duplicate 
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		System.out.println("Enter Size of the Array");
		int n = sc.nextInt();
		System.out.println("Enter elements one by one");
		
		int arr[] = new int[n];
		
		for(int i=0;i<n; i++)
			arr[i] = sc.nextInt();
		
		int max = max(arr);
		int temp[] = new int[max+1];
		
		for(int i=0;i<n; i++)
			temp[arr[i]] +=1;
		
		for(int i=0;i<temp.length; i++)
		{
			if(temp[i]>0)
				System.out.print(i+" ");
		}
		
	}
	
	public static int max(int arr[])
	{
		int max = arr[0];
		
		for(int i=1;i<arr.length; i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		return max;
	}
}