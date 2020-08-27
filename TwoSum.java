import java.util.*;
public class TwoSum
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the list");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter elements into the list one by one");
		
		for(int i=0;i<size; i++)
			arr[i] = sc.nextInt();
		
		System.out.println("Enter the sum");
		int sum = sc.nextInt();
		
		// this is brute force approach to solving a problem
		// in this approach we iterate through all the array
		// and comparing two elements sum with original sum 
		/*
		for(int i=0;i<size-1; i++)
		{
			for(int j=i+1; j<size; j++)
			{
				if(arr[i]+arr[j]==sum)
				{
					System.out.println("The two elements are "+arr[i]+" "+arr[j]);
					System.exit(0);
				}
			}
		}
		*/
		
		
		// we have another approach to solve this problem
		// we will take another data structure called set
		// we will iterate through the whole array and for each element
		///// we will be comparing it with the sum that what number is required with this to make it 
		// the answer i.e we will take first number and will check what number is needed with this number so that 
		// our number become equal to the sum
		// for that we will check the second number in our new data structure if it is present that's all 
		// otherwise we will add this number to the set and go the second element 
		// at the end of the list we will find the answer 
		
		
		var set = new HashSet<Integer>();
		for(int i=0;i<size; i++)
		{
			Integer elem = arr[i];
			Integer required = sum-elem;
			
			if(set.contains(required))
			{
				System.out.println("The two elements are "+required+" "+elem);
				System.exit(0);;
			}
			set.add(elem);
		}
		System.out.println("Sorry! there is no element present in the list which sum is equals to "+sum);
	}
}