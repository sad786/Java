import java.util.*;
public class PalindromeList
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		int num= sc.nextInt();
		var list = new ArrayList<Integer>();
		
		for(int i=0;i<num; i++)list.add(sc.nextInt());
		
		System.out.println("Before making paindrome ->"+list);
		total_merge = makePalindrome(list);
		
		System.out.println("After making palindrome ->"+list);
		System.out.println("Total Merge Operation required is "+total_merge);
	}
	
	public static int makePalindrome(ArrayList<Integer> list)
	{
		int i=0,j = list.size()-1;
		int totalMerge = 0;
		while(i<j)
		{
			Integer l = list.get(i);
			Integer r = list.get(j);
			if(l<r)
			{
				list.set(i,l+list.get(i+1));
				list.remove(i+1);
				j -=1;
				totalMerge +=1;
			}else if(r<l)
			{
				list.set(j-1,r+list.get(j-1));
				list.remove(j);
				j -=1;
				totalMerge +=1;
			}else
			{
				i++;
				j--;
			}
		}
		
		return totalMerge;
	}
}