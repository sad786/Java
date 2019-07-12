import java.util.Scanner;

public class RemoveVowels
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		
		System.out.println("Enter any String ");
		
		String str = sc.nextLine().trim();
		
		System.out.println("After removing vowels final string is "+RemoveVowels.removeVowels(str));
		
	}
	
	public static String removeVowels(String str)
	{
		
		String vowel[] = new String[]{"a","e","i","o","u","A","E","I","O","U"};
		
		for(int vow = 0; vow<10; vow++)
			str = str.replaceAll(vowel[vow],"");
		
		return str;
	}
}