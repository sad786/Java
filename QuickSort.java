import java.util.Scanner;

public class QuickSort
{
	private static Integer[] arr;
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		System.out.println("Enter size of the array:");
		int size = sc.nextInt();
		arr = new Integer[size];
		int i=0;
		System.out.println("Enter elements into array:");
		for(i=0; i<size; i++)
			arr[i] = sc.nextInt();
		
		/*arr = new Integer[1000];
		for(int i=0; i<(1000-3); i++)
		{
			arr[i++] = 986;
			arr[i++] = 834;
			arr[i++] = 90;
			arr[i] = 10000;
		}
		*/
		var f1 = System.nanoTime();
		quickSort(0,size);
		var f2 = System.nanoTime();
		//System.out.println("\nTotal Time Taken By this algorithm is "+(f2-f1)/1000.0f);
		for(int e:arr)
			System.out.print(" "+e);
		
	}
	
	private static int partition(int lb,int ub)
	{
		int i=lb,j=ub;
		int pivot = arr[lb];
		while(true)
		{
			while(i<ub-1&&arr[++i]<=pivot);
			while(arr[--j]>pivot&&j>lb);
			
			if(i>=j)
			{
				int temp = arr[j];
				arr[j] = arr[lb];
				arr[lb] = temp;
				return j;
			}
			
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
		}
		
	}
	
	private static void quickSort(int lb, int ub)
	{
		if(lb<ub)
		{
			int j = partition(lb,ub);
			quickSort(lb,j);
			quickSort(j+1,ub);
		}
	}
}