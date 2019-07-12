import java.util.Scanner;

public class DecimalToOctal
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		
		System.out.println("Enter any Decimal Number: ");
		
		long num = sc.nextLong();
		
		String res = toOctal(num);
		
		System.out.println("Octal conversion is "+res);
		
		System.out.println("Enter any Octal Number:");
		
		String oct = sc.next().trim();
		
		System.out.println("Decimal conversion is "+toDecimal(oct));
		
		System.out.println("Second conversion is "+toDecimal2(oct));
	}
	
	public static String toOctal(long num)
	{
		StringBuilder res = new StringBuilder();
		
		if(num<=0)
			res.append(0);
		
		while(num>0)
		{
			res.insert(0,num%8);
			
			num /= 8;
		}
		
		return res.insert(0,"0o").toString();
	}
	
	public static long toDecimal(String oct)
	{
		long res = 0;
		int p = 0;
		for(int i=oct.length()-1; i>=0; i--,p++)
		{
			Long n = Long.parseLong(""+oct.charAt(i));
			
			res += n *(long)Math.pow(8,p);
			
			//System.out.print(res+" ");
		}
		System.out.println();
		return res;
	}
	
	public static long toDecimal2(String oct)
	{
		long res = 0;
		int p = 0;
		for(int i=oct.length()-1; i>=0; i--,p++)
		{
			Integer n = Integer.parseInt(""+oct.charAt(i));
			
			res += n *(int)Math.pow(8,p);
			
			//System.out.print(res+" ");
		}
		System.out.println();
		return res;
	}
}