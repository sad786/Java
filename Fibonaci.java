import java.util.*;
public class Fibonaci
{
	public static void main(String args[])throws Exception
	{
		var sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fib(n));
	}
	
	public static int[] fib(int n)
	{
		if(n<=0)
			return new int[n];
		
		int arr[] = new int[n];
		arr[0] = 0;arr[1] = 1;
		for(int i=2; i<n; i++)
			arr[i] = arr[i-1]+arr[i-2];
		
		/*for(int e:arr)
			System.out.print(e+" ");*/
		return arr;
	}
}
