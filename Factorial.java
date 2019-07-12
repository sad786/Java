import java.util.Scanner;

public class Factorial
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		
		System.out.println("Enter number:");
		
		int num = sc.nextInt();
		
		System.out.println("Factorial is "+fact(num));
	}
	
	public static long fact(int num)
	{
		int fact = 1;
		
		for(int i=2; i<=num; i++)
		{
			fact = fact*i;
		}
		
		return fact;
	}
}