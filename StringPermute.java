import java.util.*;

public class StringPermute
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		
		System.out.println("Enter any String ");
		
		String str = sc.next().trim();
		
		ArrayList<String> res = getPerms(str);
		
		System.out.println(res);
	}
	
	public static ArrayList<String> getPerms(String s)
	{
		ArrayList<String> permute = new ArrayList<>();
		if(s==null)
			return null;
		else if(s.length()==0)
		{
			permute.add("");
			return permute;
		}
		
		char first = s.charAt(0);
		
		String remainder = s.substring(1);	//remove first character
		
		ArrayList<String> words = getPerms(remainder);
		
		for(String word:words)
		{
			for(int j=0;j<=word.length(); j++)
			{
				String res = insertCharAt(word,first,j);
				permute.add(res);
			}
		}
		
		return permute;
	}
	
	public static String insertCharAt(String word,char ch,int index)
	{
		String start = word.substring(0,index);
		String last = word.substring(index);
		
		return start+ch+last;
	}
	
}