import java.util.Scanner;

public class StrongNumber
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		
		if(isStrong(num))
			System.out.println("Yes, "+num+" is a Strong Number");
		else
			System.out.println("No, "+num+" is not a Strong Number");
	}
	
	public static boolean isStrong(int num)
	{
		int temp = num;
		int sum  = 0;
		
		while(temp>0)
		{
			int tail = temp%10;
			temp = temp/10;
			
			sum += (int)Factorial.fact(tail);
		}
		
		return sum==num;
	}
}