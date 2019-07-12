import java.util.Scanner;

public class CheckPrime
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int num = sc.nextInt();
		
		if(isPrime(num))
			System.out.println("Yes, it is a prime number");
		else
			System.out.println("No, it is not a  prime number");
	}
	
	
	// O(root(n) time 
	public static boolean isPrime(int num)
	{
		if(num<=1)
			return false;
		
		int last = (int)Math.sqrt(num);
		
		for(int div = 2; div<=last; div++)
		{
			if(num%div==0)
				return false;
		}
		
		return true;
	}
}