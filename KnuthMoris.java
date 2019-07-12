import java.util.Scanner;
public class KnuthMoris
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		System.out.println("Enter the target String");
		String target = sc.next().trim();
		System.out.println("Enter the pattern");
		String pattern = sc.next().trim();
		
		int n = target.length();
		int m = target.length();
		int pi = new int[m+1];
		int j = -1;
		int i =0;
		pi[i] = j;
		
		while(i<n-1)
		{
			while(j>=0&&pi[i]!=pi[i+1])
			{
				j = pi[j];
				
			}
			
			i++;
			j++;
			pi[i] = j;
		}
	}
}