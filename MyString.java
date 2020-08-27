import java.util.*;
public class MyString implements Iterable<String>
{
	private String s = null;
	public MyString(String s)
	{
		this.s = s;
	}
	
	public static void main(String args[])
	{
		
		var sc = new Scanner(System.in);
		
		String ss = sc.next().trim();
		MyString ms = new MyString(ss);
		System.out.println(ms.s);
		for(String ch:ms)
			System.out.println(ch);
		
	}
	
	public Iterator<String> iterator()
	{
		return new Iterator<String>(){
			int ind = 0;
			@Override
			public boolean hasNext()
			{
				return ind!=s.length();
			}
			
			@Override
			public String next()
			{
				return s.charAt(ind++)+"";
			}
		};
	}
}