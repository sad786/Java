import java.util.function.Supplier;
public class Password
{
	public static void main(String args[])
	{
		char[] al = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','#','@','$'};
		Supplier<String> pas = () -> {
			String pass = "";
			for(int i=1; i<=8; i++)
			{
				int in;
				if(i%2==0){
					in = (int)(Math.random()*10);
					pass = pass+in;
				}
				else{
					in = (int)(Math.random()*29);
					pass = pass+al[in];
				}
			}
			
			return pass;
		};
		System.out.println(pas.get());
		System.out.println(pas.get());
		System.out.println(pas.get());
		System.out.println(pas.get());
		System.out.println(pas.get());
		System.out.println(pas.get());
		System.out.println(pas.get());
		System.out.println(pas.get());
		System.out.println(pas.get());
		System.out.println(pas.get());
		System.out.println(pas.get());
	}
}