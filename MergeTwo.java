import java.util.Scanner;

public class MergeTwo
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		
		int first[] = new int[]{10,20,30,40,50,60,-1,-1,-1,-1};
		
		int second[] = new int[]{2,3,7,25};
		
		int k = 6+4-1;	// last location of the first list
		int i = 5; // last index of the first list
		int  j = 3; // last index of the second list
		
		while(i>=0 && j>=0)
		{
			if(first[i]>second[j])
			{
				first[k--] = first[i--];
				
			}else
			{
				first[k--] = second[j--];
			}
		}
		
		while(j>=0)
			first[k--] = second[j--];
		
		for(int e:first)
			System.out.print(e+" ");
	}
	
	
}