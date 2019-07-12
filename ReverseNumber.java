import java.util.Scanner;


public class ReverseNumber
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		
		System.out.println("Enter any Number: ");
		
		int num = sc.nextInt();
		
		//System.out.println(num);
		System.out.println("The Reversed Number is "+reverse(num));
	}
	
	public static int reverse(int num)
	{
		int rev = 0;
		boolean isNeg = num<0;
		
		num = Math.abs(num);
		while(num>0)
		{
			rev = rev*10 +num%10;
			num /= 10;
		}
		
		//System.out.println(isNeg+" "+rev);
		return isNeg?(-rev):rev;
	}
}