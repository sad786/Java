

public class Process
{
	public static void main(String args[])throws Exception
	{
		Runtime r = Runtime.getRuntime();
		
		System.out.println(r.exec("C://Windows/System32/mspaint.exe"));
		
	}
}