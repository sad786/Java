import java.util.Scanner;

public class AllPrime
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		
		System.out.println("Enter range of prime numbers:");
		String range[] = sc.nextLine().split(" ");
		
		int l = Integer.parseInt(range[0]);
		int h = Integer.parseInt(range[1]);
		
		printAllPrime(l,h);
	}
	
	// time complexity is O(n root n);
	public static void printAllPrime(int first,int last)
	{
		for(int num = first; num<=last; num++)
		{
			if(CheckPrime.isPrime(num))
				System.out.print(num+"  ");
		}
	}
}