import java.util.*; 
public class StringQuickSort
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		int n = sc.nextInt();
		String name[] = new String[n];
		for(int i=0; i<n; i++)
			name[i] = sc.next().trim();
		
		Arrays.sort(name);
		System.out.println("By Using Arrays Sort Method");
		for(var s:name)
			System.out.print(s+" ");
		
		sortName(0,n,name);
		System.out.println("\n\nBy Using Quick Sort Technique");
		for(var s:name)
			System.out.print(s+" ");
	}
	
	private static void sortName(int lb,int ub, String arr[])
	{
		if(lb<ub)
		{
			int p = partition(lb,ub,arr);
			sortName(lb,p,arr);
			sortName(p+1,ub,arr);
		}
	}
	
	private static int partition(int lb,int ub, String arr[])
	{
		int i = lb;
		int j = ub;
		String pivot = arr[lb];
		while(true)
		{
			int k =0;
			boolean flag1=false,flag2 = false;
			i++;
			j--;
			while(i<ub-1&&k<arr[i].length()&&k<pivot.length())
			{
				if(arr[i].charAt(k)>pivot.charAt(k)){
					flag1 = true;
					break;
				}
				else if(arr[i].charAt(k)==pivot.charAt(k))
					k++;
				else
					i++;
			}
			k=0;
			while(j>lb&&k<arr[j].length()&&k<pivot.length())
			{
				if(arr[j].charAt(k)<pivot.charAt(k)){
					flag2 = true;
					break;
				}
				else if(arr[j].charAt(k)==pivot.charAt(k))
					k++;
				else
					j--;
			}
			
			if(i>=j)
			{
				String temp = arr[j];
				arr[j] = arr[lb];
				arr[lb] = temp;
				return j;
			}
			if(flag1&&flag2)
			{
				String temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			else if(!flag1&&!flag2)
			{
				pivot = arr[++lb];
			}
		}
	}
}