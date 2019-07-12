// this program illustrates how bubble sort algorithm used to sort the elements
import java.util.Scanner;

public class BubbleSort
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var arr = new int[n];
		
		System.out.println("Please Enter elements into array");
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		
		// here we apply the bubble sort algorithm
		int count=0;
		for(int i=0; i<n-1; i++)
		{
			count++;
			////boolean flag = true;
			for(int j=0; j<n-i-1; j++){
				if(arr[j]>arr[j+1])
				{
					//flag = false;
					var temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				count++;
			}
			//System.out.println(count);
			//if(flag)
			//	break;
		}		
		
		System.out.println("After sorting the number of iterations is "+count);
		for(int i: arr)
			System.out.print(" "+i);
	
	}
}