import java.util.*;
public class CheckPalin
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		
		String st = sc.next().trim();
		
		System.out.println(check(st));
	}
	
	public static String check(String st)
	{
		boolean atMost = false;
		while(!st.equals(""))
		{
			char ch = st.charAt(0);
			int oldLength = st.length();
			st = st.replaceAll(ch+"","");
			int newLength = st.length();
			
			int occur = oldLength - newLength;
			
			if(occur%2==0)
			{continue;}else if(atMost)
				return "NO";
			else
				atMost = true;
			
		}
		
		return "YES";
	}
}