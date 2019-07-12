import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class StringMatching 
{
	public static void main(String args[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String mainStr = br.readLine();
		
		String patternStr = br.readLine();
		
		char ms[] = mainStr.toCharArray();
		char lp[] = patternStr.toCharArray();
		
		int max = ms.length>lp.length?(ms.length-lp.length+1):(lp.length-ms.length+1);
		boolean flag = true;
		for(int i=0; i<max; i++)
		{
			flag = true;
			
			for(int j=0; j<(ms.length>lp.length?lp.length:ms.length)&&flag==true; j++)
			{
				if(ms.length>lp.length?(lp[j]!=ms[j+i]):(ms[j]!=lp[j+i]))
				{
					flag = false;
				}
			}
			
			if(flag==true)
			{
				System.out.println("String matched");
				return;
			}
		}
		
		if(flag==false)
		{
			System.out.println("String doesn't matched");
		}
		
	}
}