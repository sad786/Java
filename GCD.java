import java.util.Scanner;

public class GCD
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("The Common Greatest Divisor is "+getGCD(num1,num2));
	}
	
	public static int getGCD(int n1,int n2)
	{
		int div = n1<n2? n1: n2;
		
		for(; div>1; div--)
		{
			if(n1%div==0 && n2%div==0)
				return div;
		}
		
		return 1;
	}
}