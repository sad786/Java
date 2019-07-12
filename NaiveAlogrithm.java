import java.util.Scanner;
public class NaiveAlogrithm
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		System.out.println("Enter the target string ");
		String target = sc.next().trim();
		System.out.println("Enter the pattern ");
		String pattern = sc.next().trim();
		
		int n = target.length();
		int m = pattern.length();
		
		for(int i=0;i<=n-m; i++)
		{
			int j=0;
			for(j=0;j<m; j++)
				if(target.charAt(i+j)!=pattern.charAt(j))
					break;
			if(j==m)
				System.out.println("Patter found at Index "+i);
		}
		
	}
}