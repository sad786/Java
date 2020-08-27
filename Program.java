import java.util.*;

public class Program
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		String res = "";
		
		while(num>0)
		{
			int r = num/10 + 48;
			char c = r;
			res = c+"";
			num = num/10;
		}
		
		System.out.println(res);
	}
}