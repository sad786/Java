import java.util.regex.Pattern;
import java.util.Scanner;

public class PatternMatch
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		var mob = sc.next().trim();
		var res = Pattern.matches("(0|91)?[7-9][0-9]{9}",mob);
		
		if(res)
			System.out.println("Valid Mobile Number");
		else
			System.out.println("Invalid Mobile Number");
	}
}