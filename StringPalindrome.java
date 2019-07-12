import java.util.Scanner;


public class StringPalindrome
{
	
	public static void main(String args[])
	{
		
		var sc = new Scanner(System.in);
		
		System.out.println("Enter any String ");
		
		String str = sc.nextLine();
		
		if(isPalin(str))
			System.out.println("Yes,"+str+" is a Palindrome");
		else
			System.out.println("No, "+str+" is not a Palindrome");
			
		
	}
	
	public static boolean isPalin(String str)
	{
		
		for(int i=0,j=str.length()-1; i<j; i++,j--)
		{
			if(str.charAt(i) != str.charAt(j))
				return false;
		}
		
		return true;
	}
}