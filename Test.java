import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test 
{
	public static void main(String args[])throws IOException
	{
		String str;
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{
			str = br.readLine();
			Integer num = Integer.parseInt(str);
			System.out.println("The Input is Integer");
		}catch(NumberFormatException num)
		{
			try
			{
				Float fnum = Float.parseFloat(str);
				System.out.println("The Input is Float");
			}catch(NumberFormatException n)
			{
				try
				{
					String s = String.valueOf(str);
					System.out.println("The Input is String");
				}catch(NumberFormatException n2)
				{
					System.out.println("The Input is Something else");
				}
			}
		}
	}
}