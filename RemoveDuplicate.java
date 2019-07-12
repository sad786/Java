import java.util.*;

public class RemoveDuplicate
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		
		System.out.println("Enter any String:");
		String raw = sc.nextLine();
		
		StringBuilder res = new StringBuilder();
		
		while(!raw.isEmpty())
		{
			char c = raw.charAt(0);
			res.append(c);
			
			raw = raw.replaceAll(c+"","");
		}
		
		System.out.println("After removing duplicates "+res.toString());
	}
}