import java.util.Scanner;

public class BinaryToDecimal
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		
		System.out.println("Enter any binary number");
		
		String bin = sc.nextLine().trim();
		
		System.out.println("Decimal conversion is "+toDecimal(bin));
		
		System.out.println("Enter any Decimal Number:");
		
		int num = sc.nextInt();
		
		System.out.println("Binary conversion is "+toBinary(num));
	}
	
	public static int toDecimal(String num)
	{
		int dec = 0,p=0;
		
		for(int i=num.length()-1; i>=0; i--)
		{
			int n = Integer.parseInt(""+num.charAt(i));
			
			dec += n * (int)Math.pow(2,p++);
		}
		
		return dec;
	}
	
	public static String toBinary(int num)
	{
		StringBuilder res = new StringBuilder("0");
		
		while(num>0)
		{
			res.insert(1,num%2);
			
			num /=2;
		}
		
		return res.toString();
	}
}