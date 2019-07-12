// here i am using merge sort for sorting string
import java.util.Scanner;

public class MergeString
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		int n = sc.nextInt();
		String name[] = new String[n];
		
		for(int i=0; i<n; i++)
			name[i] = sc.next().trim();
		
		
		sortName(0,n-1,name);
		for(var s:name)
			System.out.print(s+" ");
	}
	
	private static void sortName(int lb, int ub, String arr[])
	{
		if(lb<ub)
		{
			int mid = (lb+ub)/2;
			sortName(lb,mid,arr);
			sortName(mid+1,ub,arr);
			merge(lb,mid,ub,arr);
		}
	}
	
	private static void merge(int lb, int mid, int ub, String arr[])
	{
		String ar[] = new String[ub+1];
		int i = lb,j = mid+1,k=0;
		while(i<=mid&&j<ub)
		{
			String s1 = arr[i];
			String s2 = arr[j];
			int x = 0;
			while(x<s1.length()&&x<s2.length())
			{
				if(s1.charAt(x)<s2.charAt(x))
				{
					ar[k++] = s1;  
				}
				else if(s2.charAt(x)<s1.charAt(x))
				{
					ar[k++] = s2;
				}
				x++;
			}
			i++;
			j++;
		}
		
		for(j=0; j<ub; j++)
		{
			arr[j] = ar[j];
		}
	}
}