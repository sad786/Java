import java.util.Scanner;




public class AllArmstong
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers");
		
		String num[] = sc.nextLine().split(" ");
		
		printAll(Integer.parseInt(num[0]),Integer.parseInt(num[1]));
	}
	
	public static void printAll(int n1,int n2)
	{
		for(; n1<=n2; n1++)
		{
			if(Armstrong.isArmstrong(n1))
				System.out.print(n1+" ");
		}
	}
}
