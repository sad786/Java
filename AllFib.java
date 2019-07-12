import java.util.Scanner;


public class AllFib
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		
		for(int e:Fibonaci.fib(num))
			System.out.print(e+" ");
	}
}