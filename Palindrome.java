import java.util.Scanner;

public class Palindrome
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		
		int num = sc.nextInt();
		
		if(isPalin(num))
			System.out.println("Yes, "+num+" is a Palindrome Number");
		else
			System.out.println("No, "+num+" is not a Palindrome Number");
	}
	
	public static boolean isPalin(int num)
	{
		int temp = num;
		
		int reverse = 0;
		
		while(temp>0)
		{
			reverse = reverse*10 + temp%10;
			
			temp /= 10;
		}
		
		return (reverse==num);
	}
}