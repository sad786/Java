import java.util.Scanner;
public class PerfectNumber
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum = 0;
		for(int i=1; i<=n/2; i++)
		{
			if(n%i==0)
				sum +=i;
		}
		
		if(sum==n)
			System.out.println(n+" is the Perfect Number");
		else
			System.out.println(n+" is Not Perfect Number");
	}
}