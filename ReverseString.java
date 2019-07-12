import java.io.*;

public class ReverseString 
{
	public static void main(String args[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please Enter Your Name : ");
		String name = br.readLine();
		
		char str[] = name.toCharArray();
		
		 char temp;
		for(int i=1; i<=str.length/2; i++)
		{
			temp = str[i-1];
			str[i-1] = str[str.length-i];
			str[str.length-i] = temp;
		}
		
		for(int i=0; i<str.length; i++)
		{
			System.out.print(""+str[i]);
		}
	}
}