import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Example
{
	public static void main(String args[])throws IOException
	{
		String name ="";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		name = br.readLine();
		System.out.println("Welcome "+name);
	}
}