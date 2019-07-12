import java.util.Scanner;

public class Pattern
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		
		System.out.println("Enter the  Number ");
		int n = sc.nextInt();
		
		System.out.println("Enter the starting number ");
		int s = sc.nextInt();
		
		int count = 0;
		for(int line = 1; line<=n; line++)
		{
			count +=1;
			
			for(int row = 1; row<=count; row++)
			{
				System.out.print(s);
			}
			System.out.println();
			
			s +=1;
		}
		
		
		for(int line = 1; line<=n; line++)
		{
			s -=1;
			for(int row = 1; row<=count; row++)
			{
				System.out.print(s);
			}
			System.out.println();
			count -=1;
		}
	}
}