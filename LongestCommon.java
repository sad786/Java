import java.util.Scanner;

public class LongestCommon
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		System.out.println("Enter First String");
		String str1 = " "+sc.next().trim();
		System.out.println("Enter Second String");
		String str2 = " "+sc.next().trim();
		
		int arr[][] = new int[str2.length()][str1.length()];
		
		for(int i=1; i<str2.length(); i++)
		{
			for(int j=1; j<str1.length(); j++){
				if(str2.charAt(i)==str1.charAt(j))
					arr[i][j] = 1+arr[i-1][j-1];
				else
					arr[i][j] = Math.max(arr[i][j-1],arr[i-1][j]);
			}
		}
		
		System.out.println("Longest common subsequence is "+arr[str2.length()-1][str1.length()-1]);
		StringBuilder res = new StringBuilder("");
		for(int i=str2.length()-1; i>2; i--)
		{
			for(int j=str1.length()-1; j>1; j--)
			{
				if(arr[i][j]!=arr[i][j-1]&&arr[i][j]!=arr[i-1][j])
				{
					res.insert(0,str1.charAt(j));
				}
			}
		}
		System.out.println("Longest Common Subsequence is "+res.toString());
	}
}