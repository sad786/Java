import java.util.*;

public class Infix
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		String ex = sc.nextInt();
		
		System.out.println("Postfix expression is "+postfix(ex));		
	}
	
	public static String postfix(String e)
	{
		var stack = new ArrayList<Character>();
		var queue = new ArrayList<Character>();
		
	}
}