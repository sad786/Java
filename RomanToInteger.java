import java.util.*;

public class RomanToInteger
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		System.out.println("Enter any Roman Numeral");
		
		String roman = sc.next().trim();
		
		System.out.println("The Equivalent Integer Number is "+toInt(roman));
	}
	
	public static int toInt(String num)
	{
		int res = 0;
		var symbol = new HashMap<Character,Integer>();
		symbol.put('I',1); symbol.put('X',10);
		symbol.put('V',5); symbol.put('L',50);
		symbol.put('C',100); symbol.put('M',1000);
		symbol.put('D',500);
		for(int i=0;i<num.length(); i++)
		{
			int n = symbol.get(num.charAt(i));
			if(i>0&& n>symbol.get(num.charAt(i-1)))
			{
				//res += Math.abs(n-symbol.get(num.charAt(i-1)));
				res = res+n - 2*symbol.get(num.charAt(i-1));
			}
			else
				res += n;
		}
		return res;
		
		
	}
	
}