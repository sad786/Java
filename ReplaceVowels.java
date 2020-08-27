import java.util.Scanner;

public class ReplaceVowels
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		System.out.println("Enter First String");
		
		StringBuilder first = new StringBuilder(sc.nextLine());
		
		System.out.println("Enter Second String ");
		StringBuilder second = new StringBuilder(sc.nextLine());
		
		System.out.println("Enter third String ");
		StringBuilder third = new StringBuilder(sc.nextLine());
		
		for(int i=0;i<first.length(); i++)
		{
			String  c= (first.charAt(i)+"").toLowerCase();
			if(c.equals("a")||c.equals("e")||c.equals("u")||c.equals("o")||c.equals("u"))
			{
				first.setCharAt(i,'$');
			}
		}
		
		for(int i=0;i<second.length(); i++)
		{
			String c = (second.charAt(i)+"").toLowerCase();
			if(!(c.equals("a")||c.equals("e")||c.equals("i")||c.equals("o")||c.equals("u")))
			{
				second.setCharAt(i,'#');
			}
		}
		
		for(int i=0;i<third.length(); i++)
		{
			String c = (third.charAt(i)+"").toLowerCase();
			
			if(c.equals(third.charAt(i)+""))
			{
				third.replace(i,i+1,c.toUpperCase());
			}
			else
			{
				third.replace(i,i+1,c.toLowerCase());
			}
		}
		
		System.out.println(first.toString());
		System.out.println(second.toString());
		System.out.println(third.toString());
	}
}