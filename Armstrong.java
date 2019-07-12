import java.util.Scanner;

public class Armstrong
{
	public static void main(String args[])
	{
		var sc = new Scanner(System.in);
		
		System.out.println("Enter any Number:");
		
		int num = sc.nextInt();
		
		if(isArmstrong(num))
			System.out.println("Yes,"+num+" is a Armstrong Number");
		else
			System.out.println("No,"+num+" is not a Armstrong Number");
	}
	
	public static boolean isArmstrong(int num)
	{
		int len =  String.valueOf(num).length();
		
		int temp = num;
		
		int res = 0;
		
		while(temp>0)
		{
			res += (int)Math.pow(temp%10,len);
			
			temp /= 10;
		}
		
		return (res==num);
	}
}