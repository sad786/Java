import java.util.Scanner;

public class Even
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		
		System.out.println("Enter ");
		
		int num = sc.nextInt();
		
		if((num&1)>=1)
			System.out.println("No, it is not even number");
		else
			System.out.println("Yes, it is even number");
		
	}
	
}