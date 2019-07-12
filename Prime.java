import java.util.Scanner;

public class Prime
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		
		System.out.println("Enter first Number:");
		
		int num = sc.nextInt();
		
		System.out.println("Enter second Number:");
		
		int num2 = sc.nextInt();
		
		System.out.println("Sum of All Prime Number is "+primeSum(num,num2));
	}
	
	public static boolean isPrime(int num)
	{
		int till = (int)Math.sqrt(num);
		
		for(int div=2; div<=till; div++)
		{
			if(num%div==0)
				return false;
		}
		
		return true;
	}
	
	public static int primeSum(int first,int last)
	{
		int sum = 0;
		
		for(int i=first; i<=last; i++)
		{
			if(isPrime(i))
				sum +=i;
		}
		
		return sum;
	}
	
}