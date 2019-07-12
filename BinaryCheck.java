import java.util.*;

public class BinaryCheck
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a binary string");
		String bin = sc.next().trim();
		if(bin.equals(""))
		{
			System.out.println("Invalid Input");
			BinaryCheck.main(null);
		}
		
		System.out.println(check(bin));
	}
	
	public static boolean check(String bin)
	{
		int i=bin.length()-1,j = 0;
		int sum=0;
		while(i>=j)
		{
			int n1 = getNum(bin.charAt(i));
			int n2 = getNum(bin.charAt(j));
			
			if(i==j)
				sum+=(int)Math.pow(2,i)*n1;
			else
				sum+=((int)Math.pow(2,j)*n1)+((int)Math.pow(2,i)*n2);
			
			i--;
			j++;
		}
		
		if(sum%3==0)
			return true;
		else
			return false;
	}
	
	public static int getNum(char c)
	{
		if(c=='0')
			return 0;
		else if(c=='1')
			return 1;
		else
		{
			System.out.println("Invalid Input");
			BinaryCheck.main(null);
		}
		
		return -1;
	}
}