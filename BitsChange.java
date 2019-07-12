import java.util.Scanner;

public class BitsChange
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		String bitString = sc.next().trim();
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if(n1<=0||n2<=0){
			System.out.println(-1);
			System.exit(0);
		}
		
		StringBuilder tempString = new StringBuilder(bitString);
		change(tempString,n1);
		change(tempString,n2);
		int res = 0;
		for(int i=0;i<tempString.length(); i++)
		{
			if(tempString.charAt(i)==bitString.charAt(i))
				res +=1;
		}
		
		System.out.println(res);
	}
	
	private static void  change(StringBuilder tempString,int n)
	{
		
		int index = n-1;
		while(index<tempString.length())
		{
			char c = tempString.charAt(index);
			if(c=='0')
				tempString.setCharAt(index,'1');
			else
				tempString.setCharAt(index,'0');
			index +=n;
		}
	}
}